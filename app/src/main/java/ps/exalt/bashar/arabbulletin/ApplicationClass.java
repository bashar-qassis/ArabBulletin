package ps.exalt.bashar.arabbulletin;

import android.app.Application;

import ps.exalt.bashar.arabbulletin.models.Item;
import ps.exalt.bashar.arabbulletin.models.NewsArticle;
import ps.exalt.bashar.arabbulletin.newsservices.NewsResponse;
import ps.exalt.bashar.arabbulletin.utilities.NewsServicesCallback;

/**
 * Created by Abdallah on 7/10/2016.
 */
public class ApplicationClass extends Application implements NewsServicesCallback {
    public static Item[] newsList;

    @Override
    public void onCreate() {
        super.onCreate();
        NewsResponse.getNewsArticles(this);
    }

    @Override
    public void onFailure(Object error) {

    }

    @Override
    public void onSuccess(NewsArticle newsArticle) {
        newsList = newsArticle.getRss().getChannel().getItem();
    }
}

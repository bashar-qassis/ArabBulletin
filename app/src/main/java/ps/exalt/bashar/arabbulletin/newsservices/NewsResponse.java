package ps.exalt.bashar.arabbulletin.newsservices;

import ps.exalt.bashar.arabbulletin.Constants;
import ps.exalt.bashar.arabbulletin.models.NewsArticle;
import ps.exalt.bashar.arabbulletin.utilities.NewsAPI;
import ps.exalt.bashar.arabbulletin.utilities.NewsServicesCallback;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.SimpleXmlConverterFactory;

/**
 * Created by Bashar on 7/10/2016.
 */
public class NewsResponse {
    public static Object getNewsArticles(final NewsServicesCallback callback) {

        //While the app fetched data we are displaying a progress dialog
        //Creating a rest adapter
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.ROOT_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        //Creating an object of our api interface
        NewsAPI api = retrofit.create(NewsAPI.class);

        //Defining the method
        api.getNewsArticles(new Callback<NewsArticle>() {
            @Override
            public void onResponse(Response<NewsArticle> response, Retrofit retrofit) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                callback.onFailure(new Error("No Response"));
            }
        });
        return null;
    }
}
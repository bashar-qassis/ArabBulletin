package ps.exalt.bashar.arabbulletin.utilities;

import ps.exalt.bashar.arabbulletin.models.NewsArticle;
import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Bashar on 7/10/2016.
 */
public interface NewsAPI {
    /*Retrofit get annotation with our ROOT_URL
       And our method that will return us the list ob Book
    */
    @GET("/arabic/rss.xml")
    Call<NewsArticle> getNewsArticles();
}

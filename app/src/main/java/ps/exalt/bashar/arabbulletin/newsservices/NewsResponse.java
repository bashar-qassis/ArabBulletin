package ps.exalt.bashar.arabbulletin.newsservices;

import android.util.Log;

import ps.exalt.bashar.arabbulletin.Constants;
import ps.exalt.bashar.arabbulletin.utilities.NewsAPI;
import ps.exalt.bashar.arabbulletin.utilities.NewsArticle;
import ps.exalt.bashar.arabbulletin.utilities.NewsServicesCallback;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.client.Response;
import retrofit.converter.SimpleXMLConverter;

/**
 * Created by Bashar on 7/10/2016.
 */
public class NewsResponse {
    public static void getNewsArticles(final NewsServicesCallback callback) {
        //While the app fetched data we are displaying a progress dialog

        //Creating a rest adapter
        RestAdapter adapter = new RestAdapter.Builder()
                .setClient(new OkClient())
                .setEndpoint(Constants.ROOT_URL)
                .setConverter(new SimpleXMLConverter())
                .build();

        //Creating an object of our api interface
        NewsAPI api = adapter.create(NewsAPI.class);

        //Defining the method
        api.getNewsArticles(new Callback<NewsArticle>() {
            @Override
            public void success(NewsArticle data, Response response) {
                Log.v("getNewsArticles: ", "Sucess");
                Log.d(Constants.TAG, data.toString());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.v("getNewsArticles: ", "Failure");
                //you can handle the errors here
                callback.onFailure(error);
            }
        });
        //return weatherData;
    }
}

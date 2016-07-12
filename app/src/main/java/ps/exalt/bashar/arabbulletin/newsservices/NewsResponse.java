package ps.exalt.bashar.arabbulletin.newsservices;

import ps.exalt.bashar.arabbulletin.Constants;
import ps.exalt.bashar.arabbulletin.models.Rss;
import ps.exalt.bashar.arabbulletin.utilities.NewsAPI;
import ps.exalt.bashar.arabbulletin.utilities.NewsServicesCallback;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.SimpleXmlConverterFactory;

/**
 * Created by Bashar on 7/10/2016.
 */
public class NewsResponse {
    public static void getRss(final NewsServicesCallback callback) {
        //While the app fetched data we are displaying a progress dialog
        //Creating a rest adapter
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.ROOT_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        //Creating an object of our api interface
        NewsAPI api = retrofit.create(NewsAPI.class);

        Call<Rss> call = api.getRss();
        call.enqueue(new Callback<Rss>() {
            @Override
            public void onResponse(Response<Rss> response, Retrofit retrofit) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                callback.onFailure(new Error("No Response"));
            }
        });
    }
}
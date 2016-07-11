package ps.exalt.bashar.arabbulletin.utilities;

import ps.exalt.bashar.arabbulletin.models.NewsArticle;

/**
 * Created by Bashar on 7/10/2016.
 */
public interface NewsServicesCallback {
    public void onFailure(Object error);

    public void onSuccess(NewsArticle newsArticle);
}

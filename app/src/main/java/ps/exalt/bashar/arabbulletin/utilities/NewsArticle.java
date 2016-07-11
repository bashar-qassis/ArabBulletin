package ps.exalt.bashar.arabbulletin.utilities;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by Bashar on 7/10/2016.
 */
public class NewsArticle implements Serializable {
    private String title;
    private String description;
    private String link;
    private String pubDate;
    private Bitmap image;

    public NewsArticle(String title, String description, String link, String pubDate, Bitmap image) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.pubDate = pubDate;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "NewsArticle{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", image=" + image +
                '}';
    }
}

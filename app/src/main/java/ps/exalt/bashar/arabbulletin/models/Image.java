package ps.exalt.bashar.arabbulletin.models;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
public class Image implements Serializable {
    private String title;

    private String link;

    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
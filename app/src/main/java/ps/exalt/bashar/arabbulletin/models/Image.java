package ps.exalt.bashar.arabbulletin.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
@Root(strict = false)
public class Image implements Serializable {
    @Element
    private String title;

    @Element
    private String link;

    @Element
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
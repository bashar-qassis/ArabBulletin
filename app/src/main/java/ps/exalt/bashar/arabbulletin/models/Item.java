package ps.exalt.bashar.arabbulletin.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
@Root(strict = false)
public class Item implements Serializable {
    @Element
    private Guid guid;

    @Element
    private String pubDate;

    @Element
    private String title;

    @Element
    private String description;

    @Element
    private String link;

    @Element(name = "thumbnail", required = false)
    @Namespace(prefix = "media", reference = "http://search.yahoo.com/mrss/")
    private MediaThumbnail mediaThumbnail;

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
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

    public MediaThumbnail getMediaThumbnail() {
        return mediaThumbnail;
    }

    public void setMediaThumbnail(MediaThumbnail mediaThumbnail) {
        this.mediaThumbnail = mediaThumbnail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "guid=" + guid +
                ", pubDate='" + pubDate + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", mediaThumbnail=" + mediaThumbnail +
                '}';
    }
}
package ps.exalt.bashar.arabbulletin.models;

import org.simpleframework.xml.Element;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
public class Item implements Serializable {
    private Guid guid;

    private String pubDate;

    private String title;

    private String description;

    private String link;

    @Element(name = "media:thumbnail")
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
package ps.exalt.bashar.arabbulletin.models;

import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
@Root(name = "Media:thumbnail")
public class MediaThumbnail implements Serializable {
    private String height;

    private String width;

    private String url;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MediaThumbnail{" +
                "height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
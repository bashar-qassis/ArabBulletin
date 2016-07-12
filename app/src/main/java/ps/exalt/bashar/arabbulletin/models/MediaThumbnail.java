package ps.exalt.bashar.arabbulletin.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
@Root(name = "thumbnail")
@Namespace(prefix = "media", reference = "http://search.yahoo.com/mrss/")
public class MediaThumbnail implements Serializable {
    @Attribute
    private String height;

    @Attribute
    private String width;

    @Attribute
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
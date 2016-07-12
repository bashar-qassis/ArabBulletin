package ps.exalt.bashar.arabbulletin.models;

import org.simpleframework.xml.Version;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
//@Root(strict=false)
public class NewsArticle implements Serializable {
    @Version(name = "2.0")
    private Rss rss;

    public Rss getRss() {
        return rss;
    }

    public void setRss(Rss rss) {
        this.rss = rss;
    }

    @Override
    public String toString() {
        return "NewsArticle{" +
                "rss=" + rss +
                '}';
    }
}
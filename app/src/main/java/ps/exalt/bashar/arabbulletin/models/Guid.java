package ps.exalt.bashar.arabbulletin.models;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
public class Guid implements Serializable {
    private String content;

    private String isPermaLink;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsPermaLink() {
        return isPermaLink;
    }

    public void setIsPermaLink(String isPermaLink) {
        this.isPermaLink = isPermaLink;
    }

    @Override
    public String toString() {
        return "Guid{" +
                "content='" + content + '\'' +
                ", isPermaLink='" + isPermaLink + '\'' +
                '}';
    }
}
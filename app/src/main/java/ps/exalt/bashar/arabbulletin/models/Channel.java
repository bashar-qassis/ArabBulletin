package ps.exalt.bashar.arabbulletin.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Bashar on 7/11/2016.
 */
@Root
public class Channel implements Serializable {
    @Element
    private String title;

    @Element
    private String managingEditor;

    @Element
    private String description;

    @Element
    private String link;

    @Element
    private String lastBuildDate;

    @ElementList(name = "item", inline = true)
    private ArrayList<Item> item;

    @Element
    private Image image;

    @Element
    private String generator;

    @Element
    private String copyright;

    @Element
    private String language;

    @Element
    private String ttl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManagingEditor() {
        return managingEditor;
    }

    public void setManagingEditor(String managingEditor) {
        this.managingEditor = managingEditor;
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

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", managingEditor='" + managingEditor + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", lastBuildDate='" + lastBuildDate + '\'' +
                ", item=" + item +
                ", image=" + image +
                ", generator='" + generator + '\'' +
                ", copyright='" + copyright + '\'' +
                ", language='" + language + '\'' +
                ", ttl='" + ttl + '\'' +
                '}';
    }
}
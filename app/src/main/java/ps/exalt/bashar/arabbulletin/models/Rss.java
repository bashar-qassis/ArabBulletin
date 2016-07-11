package ps.exalt.bashar.arabbulletin.models;

import java.io.Serializable;

/**
 * Created by Bashar on 7/11/2016.
 */
public class Rss implements Serializable {
    private Channel channel;

    private String version;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Rss{" +
                "channel=" + channel +
                ", version='" + version + '\'' +
                '}';
    }
}
package pl.akademiakodu.kwejk.model;

/**
 * Created by slickender on 04.09.2017.
 */
public class Gif {
    private String name;
    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
    }
}



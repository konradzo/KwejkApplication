package pl.akademiakodu.kwejk.model;

/**
 * Created by slickender on 04.09.2017.
 */
public class Gif {
    private String name;
    private String username;
    private Category category;
    private boolean favorite;

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Gif(String name, String username, Category category) {
        this(name, username);
        this.category = category;
    }

    public Gif(String name, String username, Category category, boolean favorite) {
        this(name,username,category);
        this.favorite = favorite;
    }

    public String getUrl() {
        return "/gifs/" + getName() + ".gif";
    }


}



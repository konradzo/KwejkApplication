package pl.akademiakodu.kwejk.model;

public enum Category {
    MACHINES(1, "machines"), ANNOYING(2, "annoying"), IT(3, "IT"), OTHER(4, "other");

    private Integer id;
    private String name;

    Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}

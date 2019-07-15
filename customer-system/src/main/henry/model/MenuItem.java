package main.henry.model;

/**
 * MenuItem
 */
public class MenuItem {
    private long id;
    private String name;
    private String description;

    /**
     * @param id the id to set
     */
    public MenuItem setId(long id) {
        this.id = id;
        return this;
    }

    /**
     * @param name the name to set
     */
    public MenuItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @param description the description to set
     */
    public MenuItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
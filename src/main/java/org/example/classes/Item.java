package org.example.classes;

/**
 * The type Item.
 */
public class Item {
    private String title;
    private boolean isComplete;
    private String description;

    /**
     * Instantiates a new Item.
     *
     * @param title       the title
     * @param description the description
     */
    public Item(String title, String description) {
        this.title = title;
        this.isComplete = false;
        this.description = description;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Is complete boolean.
     *
     * @return the boolean
     */
    public boolean isComplete() {
        return isComplete;
    }

    /**
     * Sets complete.
     *
     * @param complete the complete
     */
    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

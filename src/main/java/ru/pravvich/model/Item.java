package ru.pravvich.model;

/**
 * Author : Pavel Ravvich.
 * Created : 10.08.17.
 * <p>
 * Item sample of storing data.
 */
public class Item {
    /**
     * Primary key.
     */
    private int id;
    /**
     * Some desc.
     */
    private String description;

    /**
     * Default constructor.
     */
    public Item() {
    }

    /**
     * Constructor for test.
     */
    public Item(final int id, final String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void notifyOfAdd() {
        System.out.println("Item work.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != item.id) return false;
        return description.equals(item.description);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + description.hashCode();
        return result;
    }
}

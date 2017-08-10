package ru.pravvich.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.pravvich.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Pavel Ravvich.
 * Created : 10.08.17.
 * <p>
 * Memory implementation for heap repo.
 */
@Component
public class DAOMemory implements DAO {

    /**
     * Data container.
     */
    private final List<Item> memory;

    /**
     * Default constructor.
     */
    @Autowired
    public DAOMemory() {
        memory = new ArrayList<>(100);
    }

    /**
     * Addition Item obj to heap.
     *
     * @param item for add.
     */
    @Override
    public void add(final Item item) {
        item.notifyOfAdd();
        memory.add(item);
    }

    /**
     * Get Item from memory.
     *
     * @param id of Item.
     * @return Item which matching id.
     */
    @Override
    public Item getItem(final int id) {

        Item result = new Item();

        for (Item item : memory) {

            if (id == item.getId()) {

                result = item;
                break;
            }
        }

        return result;
    }
}

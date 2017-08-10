package ru.pravvich.dao;

import org.springframework.stereotype.Component;
import ru.pravvich.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Pavel Ravvich.
 * Created : 10.08.17.
 * <p>
 * Memory the class depends on the StorageImpl.
 */
@Component
public class DAOMemory implements DAO {

    private final List<Item> memory;

    public DAOMemory() {
        memory = new ArrayList<>(100);
    }

    @Override
    public void add(Item item) {
        item.notifyOfAdd();
        memory.add(item);
    }

    @Override
    public Item getItem(int id) {

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

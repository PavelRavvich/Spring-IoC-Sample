package ru.pravvich.dao;

import ru.pravvich.model.Item;

/**
 * Determinate base method for DAO layer.
 */
public interface DAO {
    void add(Item item);
    Item getItem(int id);
}

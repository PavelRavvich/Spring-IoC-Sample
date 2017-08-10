package ru.pravvich.dao;

import ru.pravvich.model.Item;

public interface DAO {
    void add(Item item);
    Item getItem(int id);
}

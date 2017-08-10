package ru.pravvich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.pravvich.dao.DAO;
import ru.pravvich.model.Item;

/**
 * Author : Pavel Ravvich.
 * Created : 10.08.17.
 * <p>
 * UserManager the class adapter for DAO implementations.
 */
@Component
public class UserManager {
    /**
     * DAO implementation.
     */
    private final DAO dao;

    /**
     * Default constructor.
     *
     * @param dao app runtime implementation DAOJdbc. DAOMemory -for test.
     */
    @Autowired
    public UserManager(@Qualifier("DAOJdbc") final DAO dao) {
        this.dao = dao;
    }

    /**
     * Addition Item from dao.
     *
     * @param item for add.
     */
    public void add(final Item item) {
        dao.add(item);
    }

    /**
     * Get Item from dao.
     *
     * @param id of Item.
     * @return Item which matching id.
     */
    public Item get(final int id) {
        return dao.getItem(id);
    }
}

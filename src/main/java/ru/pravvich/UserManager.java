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
 * StorageImpl the class which depends from Memory.
 */
@Component
public class UserManager {

    private final DAO dao;

    @Autowired
    public UserManager(@Qualifier("DAOJdbc") final DAO dao) {
        this.dao = dao;
    }

    public void add(final Item item) {
        dao.add(item);
    }

    public Item get(final int id) {
        return dao.getItem(id);
    }
}

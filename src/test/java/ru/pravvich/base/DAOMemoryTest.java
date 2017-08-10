package ru.pravvich.base;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.pravvich.dao.DAOMemory;
import ru.pravvich.model.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DAOMemoryTest {

    private final ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("spring-context.xml");

    @Test
    public void whenGetBeanThenBeanNotNull() {

        final DAOMemory bean = context.getBean(DAOMemory.class);

        assertNotNull(bean);
    }

    @Test
    public void whenAddItemToBeanThenBeanContainItem() {

        final Item item = new Item();
        item.setId(1);


        final DAOMemory bean = context.getBean(DAOMemory.class);

        bean.add(item);

        final Item result = bean.getItem(1);

        assertThat(result, is(item));
    }
}
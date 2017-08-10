package ru.pravvich.base;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.pravvich.UserManager;
import ru.pravvich.model.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class UserManagerTest {

    private final ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("test-config.xml");

    private Item item = new Item(1, "test");

    @Test
    public void whenGetBeanGeanNotNull() {

        final UserManager bean = context.getBean(UserManager.class);

        assertNotNull(bean);
    }

    @Test
    public void whenItemAddToDBThenDBContainItem() {

        final UserManager bean = context.getBean(UserManager.class);

        bean.add(item);

        final Item result = bean.get(1);

        assertThat(result, is(item));
    }
}
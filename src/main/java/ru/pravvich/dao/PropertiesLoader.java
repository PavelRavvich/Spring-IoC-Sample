package ru.pravvich.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Author : Pavel Ravvich.
 * Created : 10.08.17.
 * <p>
 * PropertiesLoader
 */
@Component
public class PropertiesLoader {
    /**
     * Represents a persistent set of properties.
     */
    private final Properties properties;

    /**
     * Default constructor.
     */
    public PropertiesLoader() {
        this.properties = new Properties();
    }

    /**
     * Load all data.
     *
     * @param fileName of  data contains
     */
    public void load(final String fileName) {
        try (final InputStream input =
                     Thread
                             .currentThread()
                             .getContextClassLoader()
                             .getResourceAsStream(fileName)
        ) {

            properties.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get get.
     *
     * @param key of get.
     * @return get of Properties by key.
     */
    public String get(final String key) {
        return properties.getProperty(key);
    }

}

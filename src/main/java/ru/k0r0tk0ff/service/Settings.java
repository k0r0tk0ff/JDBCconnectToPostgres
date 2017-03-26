package ru.k0r0tk0ff.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Settings {

    private static final Settings INSTANCE = new Settings();

    private final static Properties properties = new Properties();

    private Settings() {
        try {
            properties.load(new FileInputStream(
                this.getClass().getClassLoader().
                        getResource("dbConnect.properties").getFile()
            ));
        } catch (IOException IoError) {
            IoError.printStackTrace();
        }
    }

/*    public void load(InputStream io) {
        try {
            properties.load(io);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static Settings getInstance() {return INSTANCE;}

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}

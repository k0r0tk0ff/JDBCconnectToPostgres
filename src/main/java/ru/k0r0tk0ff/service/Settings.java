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

/*    public Settings() {}

    ClassLoader loader = Settings.class.getClassLoader();
        try (InputStream io = loader.getResourceAsStream("dbConnect.properties")) {
        settings.load(io);
    }*/

    private Settings() {
    }

    public static Settings getInstance() {return INSTANCE;}

    public String getValue(String key) {
        return properties.getProperty(key);
    }

    /*public final Properties prs = new Properties();

    public void load(InputStream io) {
        try {
            this.prs.load(io);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return this.prs.getProperty(key);
    }*/
}

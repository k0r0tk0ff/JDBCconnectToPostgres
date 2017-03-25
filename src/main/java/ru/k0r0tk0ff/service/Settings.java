package ru.k0r0tk0ff.service;

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
    public final Properties prs = new Properties();

    public void load(InputStream io) {
        try {
            this.prs.load(io);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return this.prs.getProperty(key);
    }
}

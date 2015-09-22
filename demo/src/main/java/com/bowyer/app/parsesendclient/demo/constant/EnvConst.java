package com.bowyer.app.parsesendclient.demo.constant;

import java.util.ResourceBundle;

/**
 * Created by Bowyer on 2015/08/02.
 */
public class EnvConst {

    public static final ParseProperties PROPERTIES = new ParseProperties();


    public static final String PARSE_APPLICATION_ID = PROPERTIES.getString("PARSE_APPLICATION_ID");
    public static final String PARSE_CLIENT_KEY = PROPERTIES.getString("PARSE_CLIENT_KEY");

    public static class ParseProperties {

        private final ResourceBundle mBundle = ResourceBundle.getBundle("parsepush");

        public String getString(final String key) {
            return mBundle.getString(key);
        }
    }
}

package com.quebragelo.quebragelo.helper;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bruno on 11/06/15.
 */
public class URLMaker {
    public static URL create(String path){
        URL url = null;

        try {
            String part = Constraint.WEB_API_DOMAIN + Constraint.WEB_API_VERSION;
            url = new URL(part + path);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }
}
package org.example;

public class Constant {
    /**
     * A static method that makes a string URL friendly. Removes spaces, interpunction and changes everthing to lowercase
     * @param url
     * @return a friendly url.
     */

    public static String createUrl(String url) {
        String newUrl = url.replace(",","").replace(".","").replace("?","").replace("!","").replace("&","&amp;").replace(" ", "-").toLowerCase();
        return newUrl;
    }
}

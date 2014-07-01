package me.mineslam.trading.util;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by Ryan on 7/1/2014.
 */
public class Tenjava {
   /*
   I have no idea if this will even work. Yolo.
    */
    public static void main(String[] args) throws MalformedURLException{
        openWebpage(new URL("https://www.youtube.com/watch?v=A9HV5O8Un6k"));
    }

    /**
     * #StackoverflowOP
     * @param uri
     */
    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void openWebpage(URL url) {
        try {
            openWebpage(url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

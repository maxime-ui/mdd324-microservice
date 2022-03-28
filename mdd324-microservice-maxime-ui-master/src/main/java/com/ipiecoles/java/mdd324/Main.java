package com.ipiecoles.java.mdd324;

import java.io.IOException;

import static com.ipiecoles.java.mdd324.utils.Utils.getPageContents;

public class Main {
    public static void main(String[] args) throws IOException {

        String res = getPageContents("http://rss.allocine.fr/ac/cine/prochainement?format=xml");
        System.out.println(res);
    }
}

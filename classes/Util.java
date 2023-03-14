/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outils;

import java.net.URL;

/**
 *
 * @author tohy
 */
public class Util {
    public String getInfoUrl(String url) {
        String[] url1 = url.split("//");
        String[] url2 = url1[1].split("/");
        return url2[2];
    }
}

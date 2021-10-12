package com.unidev.parserapp;

import com.unidev.httpclient.okhttp.OkHttp;
import com.unidev.parser.Parser;
import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {
        String page = new OkHttp().get("http://canyouseeme.org/");
        Parser parser = new Parser();
        page = parser.clean(page);
        String ip = StringUtils.substringBetween(page, "id=\"ip\" type=\"text\" value=\"", "\"");
        System.out.println(ip);
    }
}

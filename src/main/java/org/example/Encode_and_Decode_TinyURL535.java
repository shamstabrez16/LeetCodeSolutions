package org.example;

import java.util.HashMap;

public class Encode_and_Decode_TinyURL535 {
    // Encodes a URL to a shortened URL.
    static  HashMap<Integer,String> urlDb = new HashMap<>();
    static int encodeCount =1000;
    public static String encode(String longUrl) {
        urlDb.put(encodeCount,longUrl);
        return "http://tinyurl.com/"+encodeCount;
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
      return urlDb.get(Integer.parseInt(shortUrl.substring(19)));
    }
}

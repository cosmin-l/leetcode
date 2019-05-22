package org.cl.problem535;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    Map<String, Long> encodedMap = new HashMap<>();
    long index = 12323232;
    static final String range = "ABCDEFGHIJKLMNOPQRSTUVXYZbcdefghijklmnopqrstuvxyz";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Long get = encodedMap.get(longUrl);
        if (get == null){
            encodedMap.put(longUrl,index);
            String returned = encode(index, range);
            index++;
            return returned;
        }else{
            return encode(get, range);
        }
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        Long index = decode(shortUrl, range);
        for (Map.Entry<String, Long> entry : encodedMap.entrySet()) {
            if (entry.getValue().equals(index)) {
                return entry.getKey();
            }
        }
        return null;
    }

    static long decode(String s, String symbols) {
        final int B = symbols.length();
        long num = 0;
        for (char ch : s.toCharArray()) {
            num *= B;
            num += symbols.indexOf(ch);
        }
        return num;
    }
    static String encode(long num, String symbols) {
        final int B = symbols.length();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(symbols.charAt((int) (num % B)));
            num /= B;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";
        Codec codec = new Codec();
        String encoded = codec.encode(url);
        System.out.println("Encoded: " + encoded);
        String decodedUrl = codec.decode(codec.encode(url));
        System.out.println(decodedUrl);


    }
}

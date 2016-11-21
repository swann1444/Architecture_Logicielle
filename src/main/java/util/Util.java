package util;

import java.util.List;

// TODO singleton
public class Util {

    public static int findMaxLength(List<String> list){
        int maxLength = 0;
        for(String s: list){
            maxLength = (s.length() > maxLength) ? s.length() : maxLength;
        }
        return maxLength;
    }
}

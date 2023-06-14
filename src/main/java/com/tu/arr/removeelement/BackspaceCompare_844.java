package com.tu.arr.removeelement;

/**
 * <a href=https://leetcode-cn.com/problems/backspace-string-compare/>844. 比较含退格的字符串</a>
 * @author tu
 * @date 2023-06-08 11:46
 */
public class BackspaceCompare_844 {

    public static boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }

    public static String backspace(String s){
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '#') {
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else {
                sb.append(chars[i]);

            }
        }
        return sb.toString();
    }


}

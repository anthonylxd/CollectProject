package com.utils;

public class StringUtil {

    /**
     * 判断字符串是否为空
     * 空返回false
     * 非空返回true
     * @param str
     * @return
     */
    public static boolean notEmpty(String str) {
        if(str != null && "".equals(str.trim())){
            return true;
        }
        return false;
    }
}

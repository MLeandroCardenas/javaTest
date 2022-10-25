package com.platzi.javatest.util;

public class StringUtil {
    public String repeat(String str, int times) {
        if(times < 0) throw  new IllegalArgumentException("negative times not allowed");
        String resultado = "";
        for (int i = 0; i < times; i++) {
            resultado+=str;
        }
        return resultado;
    }
}

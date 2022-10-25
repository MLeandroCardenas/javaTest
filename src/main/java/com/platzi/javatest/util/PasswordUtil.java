package com.platzi.javatest.util;

public class PasswordUtil {
    public enum SecurityLevel { WEAK, MEDIUM, STRONG }

    public SecurityLevel assessPassword(String pass) {
        if( pass.length() < 8 ) return  SecurityLevel.WEAK;
        if( pass.matches("[a-zA-Z]+") ) return  SecurityLevel.WEAK;
        if( pass.matches("[a-zA-Z0-9]+") ) return  SecurityLevel.MEDIUM;
        if( pass.matches("[a-zA-Z0-9]+") ) return  SecurityLevel.MEDIUM;

        return SecurityLevel.STRONG;
    }
}

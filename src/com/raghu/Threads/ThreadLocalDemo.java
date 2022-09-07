package com.raghu.Threads;

public class ThreadLocalDemo {

    private static final ThreadLocal<String> str = new ThreadLocal<String>() {
        @Override
        protected String initialValue () {
            return "Raghuram";
        }
    };

    public static String getValue(){
        return str.get();
    }

    public static void main (String[] args) {
        System.out.println(getValue());
    }
}

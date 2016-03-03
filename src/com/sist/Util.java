package com.sist;

/**
 * Created by cjw on 2016-03-03.
 */
public class Util {
    public static <T> Innovation<T> innovating(T t){
        Innovation<T> innovation=new Innovation<T>();
        innovation.setT(t);;
        return innovation;
    }
}

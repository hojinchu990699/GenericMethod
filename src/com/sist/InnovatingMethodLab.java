package com.sist;

/**
 * Created by cjw on 2016-03-03.
 */
public class InnovatingMethodLab {
    public static void main(String[] args){
       Innovation<Integer> integerInnovation=Util.<Integer>innovating(2016);
        int intValue=integerInnovation.getT();
        System.out.println(intValue);

        Innovation<String> stringInnovation=Util.innovating("정도전");
        String strValue=stringInnovation.getT();
        System.out.println(strValue);
    }
}

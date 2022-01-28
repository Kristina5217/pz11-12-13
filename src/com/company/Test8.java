package com.company;

import java.util.Locale;

public class Test8 {
    public Test8() {
    }
    public static void main(String[] args) {
        Test8 test = new Test8();
        Locale l = Locale.getDefault();
        System.out.println(l.getCountry() + " " +
                l.getDisplayCountry() + " " + l.getISO3Country());
        System.out.println(l.getLanguage() + " " +
                l.getDisplayLanguage() + " " + l.getISO3Language());
        System.out.println(l.getVariant() + " " + l.getDisplayVariant());
        l = new Locale("ru","RU","WINDOWS");
        System.out.println(l.getCountry() + " " +
                l.getDisplayCountry() + " " + l.getISO3Country());
        System.out.println(l.getLanguage() + " " +
                l.getDisplayLanguage() + " " + l.getISO3Language());
        System.out.println(l.getVariant() + " " + l.getDisplayVariant());
    }
}

package com.company;

public class cwh14_stringmethods {
    public static void main(String[] args) {
        String name="Nihal";
        System.out.println(name);
        int value=name.length();
        System.out.println(value);
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        String myname="   nihal gade   ";
        System.out.println(myname);
        String trimname=myname.trim();
        System.out.println(trimname);

        System.out.println(name.replace('i','e'));
        System.out.println(name.replace("e","vas"));

    }
}

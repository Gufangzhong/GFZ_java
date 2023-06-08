package com.iwb;

import com.iwb.pojo.Studnt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(new Studnt(1,"渣男"));
    }
}

package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)
            throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("Mira",3);

//        System.out.println(cat.getName());
//        System.out.println(cat.getClass().getDeclaredField("age"));
        Field[] catFields = cat.getClass().getDeclaredFields();
        for (Field field: catFields) {
//            System.out.println(field.getName());
            if(field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(cat, " new cat name");
            }
        }
//        System.out.println(cat.getName());

        Method[] catMethods = cat.getClass().getDeclaredMethods();

        for (Method method: catMethods) {
//            System.out.println(method.getName());

            if(method.getName().equals("meow")) {
                method.invoke(cat);
            }
            if(method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(cat);
            }
        }
    }
}
package org.example;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow");
    }

    private void heyThisIsPrivate(){
        System.out.println("Hey this is private");
    }

    private static void thisIsPublicAndStatic() {
        System.out.println("This is public and static method");
    }

    private static void thisIsPrivateAndStatic() {
        System.out.println("This is private and static method");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

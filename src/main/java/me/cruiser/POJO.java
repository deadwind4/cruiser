package me.cruiser;

public class POJO {
    public static class Person {
        public String name;
        public int age;

        public Person() {}

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return this.name + " age: " + this.age;
        }
    }

    public static void main( String[] args ) {
        Person ap = new Person();
        System.out.println(ap);
    }
}

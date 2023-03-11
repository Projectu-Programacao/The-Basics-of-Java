package classes.and.objects;

import java.util.Scanner;

public class F_ClassesAndObjects {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//        Person person = new Person(name, age);

        //create a new object
        Person person1 = new Person();
        //set the name
        person1.name = "Maycon";
        //set the age
        person1.age = 29;
        //print the name and age
        System.out.println("person1.name = " + person1.name);
        System.out.println("person1.age = " + person1.age);
        //create a new object
        Person person2 = new Person();
        //set the name
        person2.name = "Giovanna";
        //set the age
        person2.age = 20;
        //print the name and age
        System.out.println("person2.name = " + person2.name);
        System.out.println("person2.age = " + person2.age);
        person1.sayHello();
        person1.sayHello(person2);

    }

}


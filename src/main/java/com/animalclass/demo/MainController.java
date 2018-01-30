package src.main.java.com.animalclass.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {

    public class Main {

        public static void main(String[] args) {

            Animal a = new Animal("The overloaded constructor has run");
            a.setName("Yogi Bear");
            System.out.println("The animal is called " + a.getName());
            System.out.println(a.eat());
            System.out.println(a.sleep());


            Animal b = new Animal();
            b.setName("Smokey the Bear");
            System.out.println("The animal is called " + b.getName());
            System.out.println(b.eat());
            System.out.println(b.sleep());

        }
    }

    public static class Animal {

        private String name;
        //this is the default constructor
        public Animal(){
            System.out.println("An animal has been created ... ");
        }
        //this is an overloaded constructor
        public Animal (String message){
            System.out.println(message);
        }

        public String getName(){
            return name;
        }
        public void setName(String value){
            name = value;
        }

        public String eat(){
            return "An animal eats ... ";
        }
        public String sleep(){
            return "An animal sleeps ...";
        }
    }

    public static class Cat {

        private String name;
        //this is the default constructor
        public Animal(){
            System.out.println("An animal has been created ... ");
        }
        //this is an overloaded constructor
        public Animal (String message){
            System.out.println(message);
        }

        public String getName(){
            return name;
        }
        public void setName(String value){
            name = value;
        }

        public String eat(){
            return "An animal eats ... ";
        }
        public String sleep(){
            return "An animal sleeps ...";
        }
        public String purr(){
            return "An animal purrs ...";
        }
    }

    public class Bird {

        private String name;
        //this is the default constructor
        public Animal(){
            System.out.println("An animal has been created ... ");
        }
        //this is an overloaded constructor
        public Animal (String message){
            System.out.println(message);
        }

        public String getName(){
            return name;
        }
        public void setName(String value){
            name = value;
        }

        public String eat(){
            return "An animal eats ... ";
        }
        public String sleep(){
            return "An animal sleeps ...";
        }
        public String fly(){
            return "An animal flys ...";
        }
    }

    @RestController
    public class AnimalApp {

        public static void main(String[] args) {

            Animal a = new Animal();
            print(a.eat());
            print(a.sleep());

            Cat c = new Cat();
            print(c.eat());
            print(c.sleep());
            print(c.purr());


            Bird b = new Bird();
            print(b.eat());
            print(b.sleep());
            print(b.fly());

        }
        private static void print(String s){
            System.out.println(s);
        }
    }
}

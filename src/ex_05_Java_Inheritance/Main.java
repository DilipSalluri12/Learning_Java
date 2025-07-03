package ex_05_Java_Inheritance;

    public class Main{
        public static void main(String[] args) {
            Cat myCat = new Cat();

            myCat.makeSound();
            myCat.meow();
        }
    }

    class Animal {
        void makeSound(){
            System.out.println("Animal Make Sound");
        }
    }

    class Cat extends Animal {
        void meow(){
            System.out.println("Cat Says: Meow");
        }
    }



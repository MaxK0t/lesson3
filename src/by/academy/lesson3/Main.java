package by.academy.lesson3;


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        defNameAgeCat();
        randomAgeName();
        doWhileAgeName();
        forEachAgeName();
        equals();
    }

    public static void defNameAgeCat() {
        Cat cat = new Cat();
        String nameCat = cat.getNameCat();
        int ageCat = cat.getAgeCat();
        int test = 0;
        while (test < 10) {
            test++;
            System.out.println("The cat has a name " + nameCat + ", age:" + ageCat + ".");
        }
    }

    public static void randomAgeName() {
        for (int i = 0; i <= 10; i++) {
            Cat cat1 = new Cat();
            String name = cat1.getNameCat1();
            cat1.setNameCat1("Police");
            int ageCat = cat1.getAgeCat1();
            cat1.setAgeCat1((int) (Math.random() * 28));


            System.out.println("Age cat: " + ageCat + ", name: " + name);
        }
    }

    public static void doWhileAgeName() {
        int test = 0;
        do {
            Cat cat2 = new Cat("Molik", ((int) (Math.random() * 28)));
            System.out.println(cat2);
            ++test;
        } while (test < 10);
    }

    public static void forEachAgeName() {
        String[] cats = new String[5];
        cats[0] = "Luck";
        cats[1] = "Koppi";
        cats[2] = "Nill";
        cats[3] = "Pers";
        cats[4] = "Prit";

        int[] age = new int[5];
        age[0] = ((int) (Math.random() * 28));
        age[1] = ((int) (Math.random() * 28));
        age[2] = ((int) (Math.random() * 28));
        age[3] = ((int) (Math.random() * 28));
        age[4] = ((int) (Math.random() * 28));



            for (int j = 0; j < 5; j++){
                System.out.println("The Cat name is: " + cats[j] + age);
        }
    }

    public static void equals() {
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        System.out.println(cat3.equals(cat4));

    }
}


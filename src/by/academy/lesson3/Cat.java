package by.academy.lesson3;

public class Cat {
    private static final String nameCat = "Ahmed";
    private static final int ageCat = 10;
    private static String nameCat1;
    private static int ageCat1;
    private static String nameCat2;
    private static int ageCat2;



    public boolean equals(Object obj) {
        return (this == obj);
    }


    @Override
    public String toString() {
        return "Cat name is " + nameCat2 + ", age: " + ageCat2;
    }

    public Cat(){

    }

    public Cat(String nameCat2, int ageCat2){
        this.nameCat2 = nameCat2;
        this.ageCat2 = ageCat2;
    }


    public void setAgeCat1(int ageCat1) {
        this.ageCat1 = ageCat1;
    }

    public void setNameCat1(String nameCat1) {
        this.nameCat1 = nameCat1;
    }

    public static String getNameCat1() {
        return nameCat1;
    }

    public static int getAgeCat1() {
        return ageCat1;
    }


    public static String getNameCat() {
        return nameCat;
    }

    public static int getAgeCat() {
        return ageCat;
    }

}

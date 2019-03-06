package com.company;

class Printer {
    static void celcjusz(){
        System.out.println("Give your value of C");
    }
    static void fahreinheit(){
        System.out.println("Give your value of F");
    }
    static void menu(){
        String[] menu={"1.Zamiana Celcjusza na Fahrenheit", "2.Zamiana Fahrenheit na Celcjusza","3.Zamiana Celcjusza na Kelvina","4.Zamiana Kelvina na Celcjusza", "5.Zamiana Kelvina na Fahrengheit","6.Zamiana Fahreinheit na Kelvina","99.Exit"};
        for (String menu1 : menu) System.out.println(menu1);
    }

    static void kelvin() {
        System.out.println("Give your value of K");
    }
}

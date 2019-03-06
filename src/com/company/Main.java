package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x;
        int choose;
        Printer.menu();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What you want to convert?");
            choose=scanner.nextInt();
            switch (choose) {
                case 1:
                    Printer.celcjusz();
                    x = scanner.nextDouble();
                    System.out.println(CToF.calculate(x));
                    break;
                case 2:
                    Printer.fahreinheit();
                    x = scanner.nextDouble();
                    System.out.println(FToC.calculate(x));
                    break;
                case 3:
                    Printer.celcjusz();
                    x=scanner.nextDouble();
                    System.out.println(CToK.calculate(x));
                    break;
                case 4:
                    Printer.kelvin();
                    x=scanner.nextDouble();
                    System.out.println(KToC.calculate(x));
                    break;
                case 5:
                    Printer.kelvin();
                    x=scanner.nextDouble();
                    System.out.println(KToF.calculate(x));
                    break;
                case 6:
                    Printer.fahreinheit();
                    x=scanner.nextDouble();
                    System.out.println(FToK.calculate(x));
                    break;
            }
        }while(choose!=99);
        System.out.println("Exiting...");
    }
}

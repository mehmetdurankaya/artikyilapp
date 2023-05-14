package artikyilbulmaapp;

import java.util.Scanner;

public class ArtikYilbulmaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tarih, mod4, mod100, mod400;
        System.out.println("Artıkyıl bulma Uygulamasıdır.");
        System.out.print("Yıl giriniz: ");
        tarih = input.nextInt();
        mod4 = tarih % 4;
        System.out.println(mod4);
        mod100 = tarih % 100;
        System.out.println(mod100);
        mod400 = tarih % 400;
        System.out.println(mod400);

        if (mod4 == 0) {
            if (mod100 == 0) {
                if (mod400 == 0) {
                    System.out.println(tarih + " Bir artık yıldır.");
                } else {
                    System.out.println(tarih + " Bir artık yıl değildir.");
                }
            } else {
                System.out.println(tarih + " Bir artık yıl değildir.");
            }

        } else {
            System.out.println(tarih + " Bir artık yıl değildir.");
        }
    }
}
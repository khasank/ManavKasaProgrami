package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz.
        double armut;
        double elma;
        double domates;
        double muz;
        double patlican;
        double toplamTutar;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5 ;

        // Scanner sınıfı değişkenimizi tanımlıyoruz.
        Scanner giris = new Scanner(System.in) ;

        // Kullanıcıdan girişleri alıyoruz.
        System.out.print("Armut Kaç Kilo ? : ");
        armut = giris.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = giris.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = giris.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = giris.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = giris.nextDouble();

        // Hesaplama işlemlerini yapıyoruz.
        toplamTutar = armut * armutFiyat + elma * elmaFiyat + domates * domatesFiyat + muz * muzFiyat +
                patlican * patlicanFiyat ;

        // Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

    }

}

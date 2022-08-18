package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int mat,fizik,kimya,tarih,muzik,turkce ;
      Scanner input = new Scanner(System.in);

        System.out.println("matemaik notunu giriniz : ");
        mat = input.nextInt();

        System.out.println("fizik notunu giriniz : " );
        fizik = input.nextInt();

        System.out.println("kimya notunu giriniz : ");
        kimya = input.nextInt();

        System.out.println("tarih notunu giriniz : ");
        tarih = input.nextInt();

        System.out.println("muzik notunu giriniz : ");
        muzik = input.nextInt();

        System.out.println("turkce notunu giriniz : ");
        turkce = input.nextInt();

        int sonuc = (mat+fizik + kimya +tarih+muzik+turkce);
        double sonuc2 = sonuc/6 ;
        System.out.println(" ortalamanız " + sonuc2);

        String str = (sonuc<60) ?"sınıfta kaldınız": "sınıfı geçtiniz";
        System.out.println(str);




    }

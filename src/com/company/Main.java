package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double elmaKilo,armutKilo,domatesKilo,muzKilo,patlicanKilo;
        System.out.println("Armut kac kilo?");
        armutKilo=scan.nextDouble();
        System.out.println("elma kac kilo?");
        elmaKilo=scan.nextDouble();
        System.out.println("domates kac kilo?");
        domatesKilo=scan.nextDouble();
        System.out.println("muz kac kilo?");
        muzKilo=scan.nextDouble();
        System.out.println("patlican kac kilo?");
        patlicanKilo=scan.nextDouble();
        double tutar=elmaKilo*3.67+armutKilo*2.14+domatesKilo*1.11+muzKilo*0.95+patlicanKilo*5.0;
        System.out.println("toplam tutar:"+tutar);
    }
}

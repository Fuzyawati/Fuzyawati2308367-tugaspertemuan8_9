/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fuzyawati2308367.pertemuan89;
import java.util.Scanner;

/**
 *
 * @author Desa Cibatu
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi-sisi
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        // Input warna
        System.out.print("Masukkan warna segitiga: ");
        String color = input.next();

        // Input apakah diisi atau tidak
        System.out.print("Apakah segitiga diisi? (true/false): ");
        boolean filled = input.nextBoolean();

        // Buat objek segitiga
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        // Output
        System.out.println("\n=================== Hasil ===================");
        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());
    }
}
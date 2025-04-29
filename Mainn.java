/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fuzyawati2308367.pertemuan89;

/**
 *
 * @author Desa Cibatu
 */
public class Mainn {
    public static void main(String[] args) {
        Person person = new Person("Fuzy", "Jalan Kerkop", "085248654410", "fuzy@gmail.com");
        Student student = new Student("Fauzi", "Jalan Ciledug", "080987654432", "fauzi@gmail.com", Student.JUNIOR);
        Employee employee = new Employee("Farid", "Jalan Pembangunan", "081427975530", "farid@gmail.com", "Room 100", 2000000, new MyDate());
        Faculty faculty = new Faculty("Yanyan", "Jalan Ahmad Yani", "089240356619", "yanyan@gmail.com", "Room 911", 3500000, new MyDate(), 10, "Asisten Dosen");
        Staff staff = new Staff("Khilda", "Jalan Ade Irma", "085678903321", "khilda@gmail.com", "Room 888", 5600000, new MyDate(), "Asisten Praktikum");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
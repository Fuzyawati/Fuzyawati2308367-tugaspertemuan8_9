/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fuzyawati2308367.pertemuan89;

/**
 *
 * @author Desa Cibatu
 */
public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name +
            ", Address: " + address +
            ", Phone: " + phoneNumber +
            ", Email: " + email +
            ", Office: " + office +
            ", Salary: " + salary +
            ", Hired Date: " + dateHired +
            ", Office Hours: " + officeHours +
            ", Rank: " + rank;
    }
}

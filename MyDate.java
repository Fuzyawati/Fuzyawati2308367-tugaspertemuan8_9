/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fuzyawati2308367.pertemuan89;
import java.util.Date;

/**
 *
 * @author Desa Cibatu
 */
public class MyDate {
    private Date hireDate;

    public MyDate() {
        this.hireDate = new Date();
    }

    public MyDate(Date date) {
        this.hireDate = date;
    }

    public Date getDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return hireDate.toString();
    }
}

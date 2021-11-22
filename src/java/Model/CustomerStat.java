/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Hoang Loc
 */
public class CustomerStat extends Customer implements Serializable {
    private int quantity;
    private double revenue;
    private double totalHour;

    public CustomerStat() {
    }

    public CustomerStat(int quantity, double revenue, double totalHour) {
        this.quantity = quantity;
        this.revenue = revenue;
        this.totalHour = totalHour;
    }

    public CustomerStat(int quantity, double revenue, double totalHour, int id, String name, String phoneNum, String email) {
        super(id, name, phoneNum, email);
        this.quantity = quantity;
        this.revenue = revenue;
        this.totalHour = totalHour;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }
}

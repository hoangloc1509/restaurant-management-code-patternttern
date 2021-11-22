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
public class DishStat extends Dish implements Serializable {
    private int quantity;
    private double revenue;

    public DishStat() {
    }

    public DishStat(int quantity, double revenue) {
        this.quantity = quantity;
        this.revenue = revenue;
    }

    public DishStat(int quantity, double revenue, int id, String name, String type, double unitPrice, String description) {
        super(id, name, type, unitPrice, description);
        this.quantity = quantity;
        this.revenue = revenue;
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
}

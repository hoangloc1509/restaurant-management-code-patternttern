/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Hoang Loc
 */
public class IncomeStat extends Receipt implements Serializable {
    private double totalRevenue;

    public IncomeStat() {
    }

    public IncomeStat(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public IncomeStat(double totalRevenue, int id, Date createdDate, double totalAmount, MakingReservation makingReservation, Staff staff) {
        super(id, createdDate, totalAmount, makingReservation, staff);
        this.totalRevenue = totalRevenue;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}

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
public class Receipt implements Serializable {
    private int id;
    private Date createdDate;
    private double totalAmount;
    private MakingReservation makingReservation;
    private Staff staff;

    public Receipt() {
    }

    public Receipt(int id, Date createdDate, double totalAmount, MakingReservation makingReservation, Staff staff) {
        this.id = id;
        this.createdDate = createdDate;
        this.totalAmount = totalAmount;
        this.makingReservation = makingReservation;
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public MakingReservation getMakingReservation() {
        return makingReservation;
    }

    public void setMakingReservation(MakingReservation makingReservation) {
        this.makingReservation = makingReservation;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}

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
public class MakingReservation implements Serializable {
    private int id;
    private Date bookedTime;
    private String note;
    private Customer customer;
    private Staff staff;
    private BookedTable bookedTable;
    private OrderedDish orderedDish;
    private OrderedCombo orderedCombo;

    public MakingReservation() {
    }

    public MakingReservation(int id, Date bookedTime, String note, Customer customer, Staff staff, BookedTable bookedTable, OrderedDish orderedDish, OrderedCombo orderedCombo) {
        this.id = id;
        this.bookedTime = bookedTime;
        this.note = note;
        this.customer = customer;
        this.staff = staff;
        this.bookedTable = bookedTable;
        this.orderedDish = orderedDish;
        this.orderedCombo = orderedCombo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(Date bookedTime) {
        this.bookedTime = bookedTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public BookedTable getBookedTable() {
        return bookedTable;
    }

    public void setBookedTable(BookedTable bookedTable) {
        this.bookedTable = bookedTable;
    }

    public OrderedDish getOrderedDish() {
        return orderedDish;
    }

    public void setOrderedDish(OrderedDish orderedDish) {
        this.orderedDish = orderedDish;
    }

    public OrderedCombo getOrderedCombo() {
        return orderedCombo;
    }

    public void setOrderedCombo(OrderedCombo orderedCombo) {
        this.orderedCombo = orderedCombo;
    }
}

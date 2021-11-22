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
public class SupplierStat extends Supplier implements Serializable {
    private double spentAmount;

    public SupplierStat() {
    }

    public SupplierStat(double spentAmount) {
        this.spentAmount = spentAmount;
    }

    public SupplierStat(double spentAmount, int id, String name, String phoneNum, String email, String address, MaterialInformation materialInformation) {
        super(id, name, phoneNum, email, address, materialInformation);
        this.spentAmount = spentAmount;
    }

    public double getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(double spentAmount) {
        this.spentAmount = spentAmount;
    }
}

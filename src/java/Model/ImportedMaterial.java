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
public class ImportedMaterial implements Serializable {
    private int id;
    private int quantity;
    private double amount;
    private MaterialInformation materialInformation;

    public ImportedMaterial() {
    }

    public ImportedMaterial(int id, int quantity, double amount, MaterialInformation materialInformation) {
        this.id = id;
        this.quantity = quantity;
        this.amount = amount;
        this.materialInformation = materialInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public MaterialInformation getMaterialInformation() {
        return materialInformation;
    }

    public void setMaterialInformation(MaterialInformation materialInformation) {
        this.materialInformation = materialInformation;
    }
}

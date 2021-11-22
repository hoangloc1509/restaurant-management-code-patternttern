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
public class Combo implements Serializable {
    private int id;
    private String name;
    private String type;
    private double unitPrice;
    private String description;
    private ComboInformation comboInformation;

    public Combo() {
    }

    public Combo(int id, String name, String type, double unitPrice, String description, ComboInformation comboInformation) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.unitPrice = unitPrice;
        this.description = description;
        this.comboInformation = comboInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComboInformation getComboInformation() {
        return comboInformation;
    }

    public void setComboInformation(ComboInformation comboInformation) {
        this.comboInformation = comboInformation;
    }
}

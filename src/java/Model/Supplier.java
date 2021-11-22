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
public class Supplier implements Serializable {
    private int id;
    private String name;
    private String phoneNum;
    private String email;
    private String address;
    private MaterialInformation materialInformation;

    public Supplier() {
    }

    public Supplier(int id, String name, String phoneNum, String email, String address, MaterialInformation materialInformation) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
        this.materialInformation = materialInformation;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MaterialInformation getMaterialInformation() {
        return materialInformation;
    }

    public void setMaterialInformation(MaterialInformation materialInformation) {
        this.materialInformation = materialInformation;
    }
}

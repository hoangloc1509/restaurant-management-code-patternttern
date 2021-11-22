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
public class Invoice implements Serializable {
    private int id;
    private Date createdDate;
    private Staff staff;
    private ImportedMaterial importedMaterial;
    private Supplier supplier;

    public Invoice() {
    }

    public Invoice(int id, Date createdDate, Staff staff, ImportedMaterial importedMaterial, Supplier supplier) {
        this.id = id;
        this.createdDate = createdDate;
        this.staff = staff;
        this.importedMaterial = importedMaterial;
        this.supplier = supplier;
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

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public ImportedMaterial getImportedMaterial() {
        return importedMaterial;
    }

    public void setImportedMaterial(ImportedMaterial importedMaterial) {
        this.importedMaterial = importedMaterial;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}

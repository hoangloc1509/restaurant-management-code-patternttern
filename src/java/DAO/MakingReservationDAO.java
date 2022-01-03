/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.MakingReservation;
import Model.OrderedCombo;
import Model.OrderedDish;
import java.util.ArrayList;

/**
 *
 * @author Hoang Loc
 */
public class MakingReservationDAO extends DAO {

    public MakingReservationDAO() {
        super();
    }
    
    public boolean bookingTable(MakingReservation makingReservation) {
        return false;
    }
    
    public boolean addOrdering(MakingReservation makingReservation) {
        return false;
    }
    
    public ArrayList<OrderedDish> getListOrderedDish(MakingReservation makingReservation) {       
        return null;       
    }
    
    public ArrayList<OrderedCombo> getListOrderedCombo(MakingReservation makingReservation) {
        return null;
    }
}

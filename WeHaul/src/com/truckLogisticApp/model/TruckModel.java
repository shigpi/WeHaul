/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.model;

/**
 *
 * @author Aarohn Narsingh Khadka
 * LMU ID: 23048510
 */

public class TruckModel {
    private int id;
    private String type;
    private int makeYear;
    private boolean inUse;
    private Integer orderId; // Nullable to represent "not in use"

    public TruckModel(int id, String type, int makeYear, boolean inUse, Integer orderId) {
        this.id = id;
        this.type = type;
        this.makeYear = makeYear;
        this.inUse = inUse;
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public Integer getUserId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    
    // JOptionPane.showInputDialog calls the toString method on each object in the array
    @Override
    public String toString() {
        return "Truck ID: " + id + ", Type: " + type + ", Make Year: " + makeYear;
    }
    
}


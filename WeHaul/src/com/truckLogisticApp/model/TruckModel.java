/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.model;

/**
 *
 * @author aarohnkhadka
 */
public class TruckModel {
    private int truckId;
    private String model;
    private boolean inUse;
    
    public TruckModel(int truckId, String model, boolean inUse) {
        this.truckId = truckId;
        this.model = model;
        this.inUse = inUse;
    }

    public int getTruckId() {
        return truckId;
    }

    public String getModel() {
        return model;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
    
    
    
}

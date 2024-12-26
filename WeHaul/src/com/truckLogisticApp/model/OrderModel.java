/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.model;

/**
 *
 * @author aarohnkhadka
 */
public class OrderModel {
    private int orderId;
    private String pickupLocation;
    private String dropoffLocation;

    public OrderModel(int orderId, String pickupLocation, String dropoffLocation) {
        this.orderId = orderId;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }
}

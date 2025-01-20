/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.model;

import java.time.LocalDate;

/**
 *
 * @author Aarohn Narsingh Khadka
 * LMU ID: 23048510
 */
public class OrderModel {
    private int orderId;
    private String pickupLocation;
    private String dropoffLocation;
    private LocalDate orderDate;
    private boolean completionStatus = false;
    
    
    public OrderModel(int orderId, String pickupLocation, String dropoffLocation, LocalDate orderDate) {
        this.orderId = orderId;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.orderDate = orderDate;
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
    
    public boolean getCompletionStatus(){
        return completionStatus;
    }
    
    public void setCompletionStatus(boolean completionStatus){
        this.completionStatus = completionStatus;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }
    
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
    // JOptionPane.showInputDialog calls the toString method on each object in the array
    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Pickup: " + pickupLocation + ", Drop-off: " + dropoffLocation;
    }
}

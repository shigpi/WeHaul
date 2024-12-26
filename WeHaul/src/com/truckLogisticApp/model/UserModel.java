/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.model;

import java.util.ArrayList;


/**
 *
 * @author Aarohn Narsingh Khadka
 * LMU ID: 23048510
 */
public class UserModel {
    private int usrId;
    private String usrName;
    private String usrSex;
    private int usrAge;
    private ArrayList<OrderModel> usrOrders;

    public UserModel(int usrId, String usrName, String usrSex, int usrAge, ArrayList<OrderModel> usrOrders) {
        this.usrId = usrId;
        this.usrName = usrName;
        this.usrSex = usrSex;
        this.usrAge = usrAge;
        this.usrOrders = usrOrders;
    }

    public int getUsrId() {
        return usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public String getUsrSex() {
        return usrSex;
    }

    public int getUsrAge() {
        return usrAge;
    }

    public ArrayList<OrderModel> getUsrOrders() {
        return usrOrders;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public void setUsrSex(String usrSex) {
        this.usrSex = usrSex;
    }

    public void setUsrAge(int usrAge) {
        this.usrAge = usrAge;
    }

    public void setUsrOrders(ArrayList<OrderModel> usrOrders) {
        this.usrOrders = usrOrders;
    }
        
}

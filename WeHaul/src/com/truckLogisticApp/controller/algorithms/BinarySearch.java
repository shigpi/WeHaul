/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.controller.algorithms;

import com.truckLogisticApp.model.TruckModel;
import com.truckLogisticApp.model.UserModel;
import java.util.List;

/**
 *
 * @author Aarohn Narsingh Khadka
 * LMU ID: 23048510
 */
public class BinarySearch {
    // Search User
    public UserModel searchByName(String searchValue, List<UserModel> userList, int left, int right) {
        // Base case: If the search range is invalid
        if (right < left) {
            return null;
        }

        // Calculate the midpoint
        int mid = (left + right) / 2;

        // Perform case-insensitive comparison for user name at mid
        int comparison = searchValue.compareToIgnoreCase(userList.get(mid).getUsrName());

        if (comparison == 0) {
            // Match found
            return userList.get(mid);
        } else if (comparison < 0) {
            // Search left half
            return searchByName(searchValue, userList, left, mid - 1);
        } else {
            // Search right half
            return searchByName(searchValue, userList, mid + 1, right);
        }
    }
    
    // Search Truck
    public TruckModel searchTruck(int searchValue, List<TruckModel> truckList, int left, int right, boolean searchByOrderId) {
        // Base case: If the search range is invalid
        if (right < left) {
            return null;
        }

        // Calculate the midpoint
        int mid = (left + right) / 2;

        // Get the value to compare based on the search type
        int comparisonValue = searchByOrderId ? 
                              (truckList.get(mid).getUserId() == null ? -1 : truckList.get(mid).getUserId()) : 
                              truckList.get(mid).getId();

        // Perform comparison
        if (comparisonValue == searchValue) {
            // Match found
            return truckList.get(mid);
        } else if (searchValue < comparisonValue) {
            // Search left half
            return searchTruck(searchValue, truckList, left, mid - 1, searchByOrderId);
        } else {
            // Search right half
            return searchTruck(searchValue, truckList, mid + 1, right, searchByOrderId);
        }
    }
}

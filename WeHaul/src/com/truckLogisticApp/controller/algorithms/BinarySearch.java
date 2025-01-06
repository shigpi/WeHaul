/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.controller.algorithms;

import com.truckLogisticApp.model.UserModel;
import java.util.List;

/**
 *
 * @author aarohnkhadka
 */
public class BinarySearch {
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
}

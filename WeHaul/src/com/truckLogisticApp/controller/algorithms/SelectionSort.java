/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.controller.algorithms;

import com.truckLogisticApp.model.UserModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aarohn Narsingh Khadka
 * LMU ID: 23048510
 */
public class SelectionSort {
    public List<UserModel> sortByUserId(List<UserModel> unsortedData, boolean isDesc) {
    // Create a copy of the data to sort
    List<UserModel> dataToSort = new ArrayList<>(unsortedData);

    // Selection sort logic
    for (int i = 0; i < dataToSort.size() - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < dataToSort.size(); j++) {
            // Compare and assign
            if (isDesc) {
                if (dataToSort.get(j).getUsrId() > dataToSort.get(minIndex).getUsrId()) {
                    minIndex = j;
                }
            } else {
                if (dataToSort.get(j).getUsrId() < dataToSort.get(minIndex).getUsrId()) {
                    minIndex = j;
                }
            }
        }
        // Swap elements
        UserModel tempUser = dataToSort.get(minIndex);
        dataToSort.set(minIndex, dataToSort.get(i));
        dataToSort.set(i, tempUser);
    }
    return dataToSort;
}

public List<UserModel> sortByUserName(List<UserModel> unsortedData, boolean isDesc) {
    // Create a copy of the data to sort
    List<UserModel> dataToSort = new ArrayList<>(unsortedData);

    // Selection sort logic
    for (int i = 0; i < dataToSort.size() - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < dataToSort.size(); j++) {
            // Compare and assign using String comparison
            if (isDesc) {
                if (dataToSort.get(j).getUsrName().compareToIgnoreCase(dataToSort.get(minIndex).getUsrName()) > 0) {
                    minIndex = j;
                }
            } else {
                if (dataToSort.get(j).getUsrName().compareToIgnoreCase(dataToSort.get(minIndex).getUsrName()) < 0) {
                    minIndex = j;
                }
            }
        }
        // Swap elements
        UserModel tempUser = dataToSort.get(minIndex);
        dataToSort.set(minIndex, dataToSort.get(i));
        dataToSort.set(i, tempUser);
    }
    return dataToSort;
}

}
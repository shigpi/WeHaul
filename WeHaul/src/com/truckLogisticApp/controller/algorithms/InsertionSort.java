/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.controller.algorithms;

import com.truckLogisticApp.model.TruckModel;
import java.util.List;

/**
 *
 * @author Aarohn Narsingh Khadka
 * LMU ID: 23048510
 */
public class InsertionSort {
    public List<TruckModel> sortByMakeYear(List<TruckModel> truckList, boolean ascending) {
        for (int i = 1; i < truckList.size(); i++) {
            TruckModel key = truckList.get(i);
            int j = i - 1;

            // Compare based on ascending or descending order
            while (j >= 0 && compare(truckList.get(j).getMakeYear(), key.getMakeYear(), ascending)) {
                truckList.set(j + 1, truckList.get(j));
                j--;
            }
            truckList.set(j + 1, key);
        }
        return truckList;
    }

    private boolean compare(int year1, int year2, boolean ascending) {
        return ascending ? year1 > year2 : year1 < year2;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truckLogisticApp.controller.algorithms;

import com.truckLogisticApp.model.OrderModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aarohn Narsingh Khadka
 * LMU ID: 23048510
 */
public class MergeSort {
    public void sortByDateDescending(List<OrderModel> orders) {
        if (orders.size() < 2) {
            return; 
        }

        // Split the list into two halves
        int mid = orders.size() / 2;
        List<OrderModel> left = new ArrayList<>(orders.subList(0, mid));
        List<OrderModel> right = new ArrayList<>(orders.subList(mid, orders.size()));

        // Recursively sort both halves
        sortByDateDescending(left);
        sortByDateDescending(right);

        // Merge the sorted halves
        merge(orders, left, right);
    }

    private void merge(List<OrderModel> orders, List<OrderModel> left, List<OrderModel> right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from both halves and merge in descending order
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getOrderDate().isAfter(right.get(j).getOrderDate())) {
                orders.set(k++, left.get(i++));
            } else {
                orders.set(k++, right.get(j++));
            }
        }

        // Add remaining elements from the left half
        while (i < left.size()) {
            orders.set(k++, left.get(i++));
        }

        // Add remaining elements from the right half
        while (j < right.size()) {
            orders.set(k++, right.get(j++));
        }
    }
}

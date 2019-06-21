package com.array;

import java.util.HashSet;

public class FindFirstDuplicateCollection {

    public static void main(String[] args) {
        
        int arr[]= {6,2,4,4,2,5,6};
        int temp =-1;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=arr.length-1; i>=0;i--) {
            if(hs.contains(arr[i])) {
                temp = i;
            }
            else {
                hs.add(arr[i]);
            }
        
        }
        if(temp!=-1) {
            System.out.println("First Duplicate value is:"+arr[temp]);
        }
        else {
            System.out.println("No duplicates found");
        }

    }

}



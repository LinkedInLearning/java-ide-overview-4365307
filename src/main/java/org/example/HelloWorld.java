package org.example;

import java.util.List;

import org.example.model.Product;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        List<Integer> nums=List.of(1,3,6,7);
        
        for (Integer num : nums) {
			
		}
        
        if (nums == null) {
			
		}
        
        try {
        	nums.get(5);
        } catch (ArrayIndexOutOfBoundsException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
        
        new Product("iphone",1000.0);
        
        
        
    }
}
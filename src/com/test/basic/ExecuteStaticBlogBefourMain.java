package com.test.basic;

public abstract class ExecuteStaticBlogBefourMain {
	 // Static block, it is called when class is loaded.
    static {
        System.out.println("Before main class in static block");
    }
    

    public static void main(String[] args) {
        System.out.println("Hello Java!");
        
    }
     

}

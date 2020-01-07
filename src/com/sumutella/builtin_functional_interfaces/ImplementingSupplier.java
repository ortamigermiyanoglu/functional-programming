package com.sumutella.builtin_functional_interfaces;

/*
 * A Supplier is used when you want to generate or supply values without taking any input.
 * The Supplier interface is defined as
 */


/*
* Lambda expressions can access static variables, instance variables, effectively final
* method parameters, and effectively final local variables.
*/


import java.time.LocalDate;
import java.util.function.Supplier;

// Functional Interfaces			Return Type 		Single Abstract Method
// Supplier<T>		        		T		        	get


public class ImplementingSupplier {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Supplier<LocalDate> s2 = LocalDate::now;
        //Above two lines are functionally the same

        Supplier<StringBuilder> s3 = () -> new StringBuilder();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        StringBuilder sb = s3.get();




    }
}


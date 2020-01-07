package com.sumutella.builtin_functional_interfaces;

/*
* A Function is responsible for turning one parameter into a value of a potentially different
* type and returning it. Similarly, a BiFunction is responsible for turning two parameters
* into a value and returning it.
*/

import java.util.function.Function;


// Functional Interfaces			Return Type 		Single Abstract Method
// BiFunction<T, U, R>	        		R		    	apply
// Function<T, U,>	        		    U		    	apply


public class ImplementingFunctionBiFunction {

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

    }
}

package com.sumutella.builtin_functional_interfaces;

/*
* A Function is responsible for turning one parameter into a value of a potentially different
* type and returning it. Similarly, a BiFunction is responsible for turning two parameters
* into a value and returning it.
*/

import java.util.function.BiFunction;
import java.util.function.Function;


// Functional Interfaces			Return Type 		Single Abstract Method
// BiFunction<T, U, R>	        		R		    	apply
// Function<T, U,>	        		    U		    	apply


public class ImplementingFunctionBiFunction {

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        int a = f1.apply("chuck");
        int b = f2.apply("chuck");

        System.out.println(a==b);

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        String s1 = b1.apply("nice", " move");
        String s2 = b2.apply("nice", " move");


        System.out.println(s1.contentEquals(s2));

    }
}

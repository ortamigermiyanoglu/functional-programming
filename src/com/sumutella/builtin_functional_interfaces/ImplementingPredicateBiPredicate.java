package com.sumutella.builtin_functional_interfaces;

/*
 * Predicate is often used when filtering or matching. Both are
 * very common operations. A BiPredicate is just like a Predicate except that it takes two
 * parameters instead of one.
 */

import java.util.function.BiPredicate;
import java.util.function.Predicate;

// Functional Interfaces			Return Type 		Single Abstract Method
//Predicate<T>			            	boolean			test
//BiPredicate<T, U>			            boolean			test
public class ImplementingPredicateBiPredicate {
    public static void main(String[] args) {

        //Below two lines are functionally the same
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("OK"));;

        //Below two lines are functionally the same
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
    }
}

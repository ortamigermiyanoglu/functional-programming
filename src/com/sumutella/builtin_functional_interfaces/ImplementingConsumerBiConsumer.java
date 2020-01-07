package com.sumutella.builtin_functional_interfaces;

/*
* You use a Consumer when you want to do something with a parameter but not return any-
* thing. BiConsumer does the same thing except that it takes two parameters.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Functional Interfaces			Return Type 		Single Abstract Method
//  Consumer<T>				        void		    	accept
//  BiConsumer<T, U>			    void			    accept
public class ImplementingConsumerBiConsumer {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        //Above two lines are functionally the same

        c1.accept("Annie");
        c2.accept("Annie");


        Map<String, Integer> map = new HashMap<>();

        //Below two lines are functionally the same
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);

    }
}

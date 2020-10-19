package com.example.tests;

import android.content.Intent;

public class Math {

   public  int add(int a, int b) {
       return a + b;
   }

   public  int minus (int a, int b) {
       return a - b;
   }
   public  int multiply (int a, int b) {
       return a * b;
   }
   public Double divide (Double a, Double b) {
       double d = a / b ;
        d = java.lang.Math.round(d);
       if (a == 0 || b == 0) {
           return null;
       } else
       return d;
   }

   public String swap (String a, String b) {
       String c = a;
       a = b;
       b = c;
       return a.trim() + " " + b.trim();
   }
   public String reverse (String a) {
       return new StringBuilder(a).reverse().toString();
   }

}

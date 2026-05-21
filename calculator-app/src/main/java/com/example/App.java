package com.calculator;

public class App {
    public int add(int a, int b) { 
        return a + b; 
    }
    
    public int subtract(int a, int b) { 
        return a - b; 
    }
    
    public int multiply(int a, int b) { 
        return a * b; 
    }
    
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("May tinh dang hoat dong!");
        App calc = new App();
        System.out.println("Ket qua phep cong 10+5 = " + calc.add(10, 5));
        System.out.println("Ket qua phep chia 10/2 = " + calc.divide(10, 2));
    }
}
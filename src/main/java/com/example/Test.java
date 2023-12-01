package com.example;

public class Test {
    public void assertEquals(String name, Object a, Object b){
        System.out.print(name+": ");
        if (a.equals(b)){
            System.out.print("Success");
        }
        else System.out.print("Fail");
        System.out.println("");
    }
    public void assertNotEquals(String name, Object a, Object b){
        System.out.print(name+": ");
        if (!a.equals(b)){
            System.out.print("Success");
        }
        else System.out.print("Fail");
        System.out.println("");
    }
    
}

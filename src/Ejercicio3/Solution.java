package Ejercicio3;

public class Solution {
    public static void main(String[] args){
        Adder agg = new Adder();
        System.out.println("My superclass is: " + agg.getClass().getSuperclass().getName());
        System.out.println(agg.add(10,32) + " " + agg.add(10,3) + " " +agg.add(10,10)+"\n");
    }
}

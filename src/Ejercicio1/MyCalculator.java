package Ejercicio1;

class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int result = 0;
        int cont = 1;
        for(int num = 1; num < n+1; num++){
            if ((n % num)==0){
                System.out.println("Divisor no. " +cont + " = " + num);
                result = result + num;
                cont = cont + 1;
            }
        }
        System.out.println("La suma total es: ");
        return result;
    }
}
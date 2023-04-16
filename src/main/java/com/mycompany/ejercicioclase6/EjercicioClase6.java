

package com.mycompany.ejercicioclase6;


public class EjercicioClase6 {

    public static void main(String[] args) {
        
        //Multiplicar 80 x 3
        Calculadora mult = new Calculadora(80,3);
        double multip = mult.multiplicar();
        System.out.println("El resultado de la multiplicación es " + multip);
        
        //Sumar 150 y 180, y dividirlo por 3
        Calculadora sum = new Calculadora (150,180);
        double sumas = sum.sumar();
        Calculadora sumD = new Calculadora(sumas,3);
        double sumDividir = sumD.dividir();
        System.out.println("El resultado de sumar y dividir es " + sumDividir);
        
        //Restar 90 y 50, multiplicar pr 15
        Calculadora rest = new Calculadora (90,50);
        double rests = rest.restar();
        Calculadora restMul = new Calculadora(rests,15);
        double restaMultipl = restMul.multiplicar();
        System.out.println("El resultado de restar y multiplicar es " + restaMultipl);
        
        //Sumar 70 y 40, multiplicar pr 25
        Calculadora sume = new Calculadora (70,40);
        double sumes = sume.sumar();
        Calculadora sumM = new Calculadora(sumes,25);
        double sumaMultipl = sumM.multiplicar();
        System.out.println("El resultado de sumar y multiplicar es " + sumaMultipl);
        
        
        
        
    }
}

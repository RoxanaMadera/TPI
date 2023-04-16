
package com.mycompany.ejercicioclase6;


public class Calculadora {
    
    private double unNumero;
    private double otroNumero;
    
    public Calculadora(double unNumero, double otroNumero) {
        this.unNumero = unNumero;
        this.otroNumero = otroNumero;
    } 

    public double getUnNumero() {
        return unNumero;
    }

    public void setUnNumero(double unNumero) {
        this.unNumero = unNumero;
    }

    public double getOtroNumero() {
        return otroNumero;
    }

    public void setOtroNumero(double otroNumero) {
        this.otroNumero = otroNumero;
    }

    
    
    
    public double sumar(){
        
        double suma = this.unNumero + otroNumero;
        return suma;
    }
    
    public double restar(){
        
        double resta = this.unNumero - this.otroNumero;
        return resta;
    }
    
    public double multiplicar(){
            
            double multiplicacion = this.unNumero * this.otroNumero;
            return multiplicacion;
    }
    
    
    public double dividir(){
            
            double division = this.unNumero / this.otroNumero;
            return division;
    }
   
}

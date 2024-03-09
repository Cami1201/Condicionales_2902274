package co.edu.sena.miscelania; 

 

public class Ejercicios { 
    
    //1. Operadores
    public double areaTriangulo(double dato1, double dato2){ 
        return (dato1 * dato2) / 2; 
    } 
    
    public double Suma(double dato1, double dato2){ 
        return dato1 + dato2; 
    }
    
    public double Elevado(double dato1){ 
        return dato1 * dato1; 
    } 
    
    public double Conversion(double dato1){ 
        return dato1 * 1.08; 
    } 
    
    public double Lado(double dato1){ 
        return dato1 * dato1; 
    } 
    
    public double Perimetro(double dato1){ 
        return dato1 + dato1 + dato1 + dato1; 
    } 
    
    public double Area(double dato1, double dato2){ 
        return ((3.1416 * 2 * dato1 * dato2) + (3.1416 * 2) * (dato1 * dato1)); 
    } 
    
    public double Volumen(double dato1, double dato2){ 
        return (3.1416 * (dato1 * dato1) * dato2); 
    } 
    
    public double Longitud(double dato1){ 
        return ((3.1416 * 3.1416) * dato1); 
    } 
    
    public double Circunferencia (double dato1){ 
        return (3.1416 * (dato1 * dato1)); 
    } 

    public double Promedio(double dato1, double dato2, double dato3){ 
        return (dato1 + dato2 + dato3)/3; 
    }

    //2. Condicionales

    public String Positivo(double dato1) {
        if(dato1 > 0) {
            return "El número ingresado es positivo";
        } else if(dato1 < 0) {
            return "El número ingresado es negativo";
        } else {
            return "El número ingresado es cero";
        }
    }

    public String MayMen(double dato1, double dato2) {
        if(dato1 > dato2) {
            return "El primer número es el mayor y el segundo es el menor";
        } else {
            return "El segundo número es el mayor y el primero es el menor";
        }
    }

    public String Tres_n(double dato1, double dato2, double dato3) {
        double mayor = Math.max(dato1, Math.max(dato2, dato3));
        double menor = Math.min(dato1, Math.min(dato2, dato3));
    
        return "El mayor número es: " + mayor + " y el menor número es: " + menor;
    }

    public String SumRes(double dato1, double dato2) {
        if(dato1 < dato2) {
            double sumas = dato1 + dato2;
            return "El primer numero es menor, por lo tanto:" + sumas;
        } else {
            double restas = dato1 - dato2;
            return "El primer numero es mayor, por lo tanto:" + restas;
        }
    }

    public String Cociente(double dato1, double dato2) {
        if(dato2 != 0) {
            double divi = dato1 / dato2;
            return "El cociente de la division es:" + divi;
        } else {
            return "La division no es posible";
        }
    }
    public String NumNe(double dato1, double dato2) {
        if(dato1 < 0 || dato2 < 0) {
            double result = dato1 + dato2;
            return "Hay un numero negativo, por lo tanto:" + result;
        } else {
            double resulta = dato1 * dato2;
            return "Los dos numeros son positivos por lo tanto:" + resulta;
        }
    }

    public String AñoBi(double dato1) {
        if((dato1 % 4 == 0 && dato1 % 100 != 0) || (dato1 % 400 == 0)) {
            return "El año ingresado es un año bisiesto";
        } else {
            return "El año ingresado no es un año bisiesto";
        }
    }
} 
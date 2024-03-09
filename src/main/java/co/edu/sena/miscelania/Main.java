package co.edu.sena.miscelania; 

 

import java.util.Scanner;;; 

 

public class Main 
{ 
    public static void main( String[] args) 
    {
        double dato1; 
        double dato2; 
        double dato3; 
        double dato4;
        String dato5;

        //Menú 
        System.out.println("1. Operadores" ); 
        System.out.println("2. Condicionales" ); 
        System.out.println("3. Ciclos" ); 
        System.out.println("4. Arreglos" ); 
        System.out.println("99. Salir" ); 
        
        Ejercicios ejercicios = new Ejercicios(); 
        
        //Submenús 

        //1.1 
        System.out.println("1.1 Calcular el área de un triángulo" ); 
        Scanner src = new Scanner(System.in); 
    
        System.out.println("Ingrese la base del triángulo"); 
        dato1 = src.nextDouble(); 
        System.out.println("Ingrese la altura del triángulo"); 
        dato2 = src.nextDouble(); 
        dato3 = ejercicios.areaTriangulo(dato1, dato2); 
        System.out.println("El área del triánguo es: " + dato3); 
        
        //1.2 
        System.out.println("1.2 Sumar dos números" ); 
        Scanner sum = new Scanner(System.in); 
        
        System.out.println("Ingrese el primer número"); 
        dato1 = src.nextDouble(); 
        System.out.println("Ingrese el segundo número"); 
        dato2 = src.nextDouble(); 
        dato3 = ejercicios.Suma(dato1, dato2); 
        System.out.println("La suma de los dos número es: " + dato3); 
        
        //1.3 
        System.out.println("1.3 Número elvado al cuadrado" ); 
        Scanner ele = new Scanner(System.in); 
        
        System.out.println("Ingrese un número"); 
        dato1 = src.nextDouble(); 
        dato3 = ejercicios.Elevado(dato1); 
        System.out.println("El número elevado al cuadrado es: " + dato3); 
        
        //1.4 
        System.out.println("1.4 Convertir de euros a doláres" ); 
        Scanner con = new Scanner(System.in); 
        
        System.out.println("Ingrese un valor en euros"); 
        dato1 = src.nextDouble(); 
        dato3 = ejercicios.Conversion(dato1); 
        System.out.println("El valor en doláres es: " + dato3); 
        
        //1.5 
        System.out.println("1.5 Área y perímetro del cuadrado" ); 
        Scanner cua = new Scanner(System.in); 
        
        System.out.println("Ingrese el lado del cuadrado");
        dato1 = src.nextDouble(); 
        dato3 = ejercicios.Lado(dato1); 
        System.out.println("El área del cuadrado: " + dato3); 
        dato4 = ejercicios.Perimetro(dato1); 
        System.out.println("El perímetro del cuadrado es: " + dato4); 
        
        //1.6 
        System.out.println("1.6 Área y Volúmen del cilindro" ); 
        Scanner cil = new Scanner(System.in); 
        
        System.out.println("Ingrese el radio del cilindro"); 
        dato1 = src.nextDouble(); 
        System.out.println("Ingrese la altura del cilindro"); 
        dato2 = src.nextDouble(); 
        dato3 = ejercicios.Area(dato1, dato2); 
        System.out.println("El área del cilindro es: " + dato3); 
        dato4 = ejercicios.Volumen(dato1, dato2); 
        System.out.println("El volúmen del cilindro es: " + dato4); 
        
        //1.7 
        System.out.println("1.7 Longitud y área de la circunferencia" ); 
        Scanner cir = new Scanner(System.in); 
        
        System.out.println("Ingrese el radio de la circunferencia"); 
        dato1 = src.nextDouble(); 
        dato3 = ejercicios.Longitud(dato1); 
        System.out.println("La longitud de la circunferencia: " + dato3); 
        dato4 = ejercicios.Circunferencia(dato1); 
        System.out.println("El área de la circunferencia es: " + dato4); 
        
        //1.8 
        System.out.println("1.8 Promedio de Tres numeros" ); 
        Scanner pro = new Scanner(System.in);

        System.out.println("Ingrese el primer numero"); 
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo numero"); 
        dato2 = src.nextDouble();
        System.out.println("Ingrese el tercer numero"); 
        dato3 = src.nextDouble();
        dato4 = ejercicios.Promedio(dato1, dato2, dato3); 
        System.out.println("El promedio de los numeros es: " + dato4);

        //2.1
        System.out.println("2.1 Positivo o Negativo");
        System.out.println("Ingrese un número");
        dato1 = src.nextDouble();
        dato5 = ejercicios.Positivo(dato1);
        System.out.println(dato5);

        //2.2
        System.out.println("2.2 Mayor y Menor");
        System.out.println("Ingrese el primer número");
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo número");
        dato2 = src.nextDouble();
        dato5 = ejercicios.MayMen(dato1, dato2);
        System.out.println(dato5);

        //2.3
        System.out.println("2.3 Mayor y Menor de tres números");
        System.out.println("Ingrese el primer número");
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo número");
        dato2 = src.nextDouble();
        System.out.println("Ingrese el tercer número");
        dato3 = src.nextDouble();
        dato5 = ejercicios.Tres_n(dato1, dato2, dato3);
        System.out.println(dato5);

        //2.4
        System.out.println("2.4 Sumar o Restar");
        System.out.println("Ingrese el primer número");
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo número");
        dato2 = src.nextDouble();
        dato5 = ejercicios.SumRes(dato1, dato2);
        System.out.println(dato5);

        //2.5
        System.out.println("2.5 Cociente");
        System.out.println("Ingrese el primer número");
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo número");
        dato2 = src.nextDouble();
        dato5 = ejercicios.Cociente(dato1, dato2);
        System.out.println(dato5);

        //2.6
        System.out.println("2.6 Un numero negativo o no");
        System.out.println("Ingrese el primer número");
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo número");
        dato2 = src.nextDouble();
        dato5 = ejercicios.NumNe(dato1, dato2);
        System.out.println(dato5);

        //2.7
        System.out.println("2.7 Año bisiesto");
        System.out.println("Ingrese el Año que quiere comprobar");
        dato1 = src.nextDouble();
        dato5 = ejercicios.AñoBi(dato1);
        System.out.println(dato5);
    }
}
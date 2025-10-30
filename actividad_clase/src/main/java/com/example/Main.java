package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         // --- Declaración de variables ---   
        //Ejercicio 1    
        int Entero = 34;
        System.out.println("Variable con int " + Entero);

        //Ejercicio 2
        double Decimal = 3.14;
        System.out.println("Variable con double " + Decimal);

        //Ejercicio 3
        String msj = "Hola JAVA";
        System.out.println("Variable con String " + msj);      

        // --- Tipos de datos primitivos ---   
        //Ejercicio 1
        byte valorBite = 32;
        System.out.println("byte: " + valorBite);

        short valorShort = 32000;
        System.out.println("short: " + valorShort);

        int valorInt = 10334990;
        System.out.println("int: " + valorInt);

        long valorLong = 9223372036854775807L;
        System.out.println("long: " + valorLong);

        float valorFloat = 3.14f;
        System.out.println("float: " + valorFloat);

        double valorDouble = 10.1952;
        System.out.println("double: " + valorDouble);

        boolean valorBoolean = false;
        System.out.println("boolean: " + valorBoolean);

        char valorChar = 'A';  
        System.out.println("char: " + valorChar);

        //Ejercicio 2
        int x = 10;
        int y = 8;

        int multiplicacion = x * y;
        System.out.println("La multiplicacion entre " + x + " y " + y + " es: " + multiplicacion);

        //Ejercicio 3
        boolean tieneEntrada = false;
        if (tieneEntrada) {
            System.out.println("Con entrada puede pasar");
        } else {
            System.out.println("Sin entrada no puede pasar");
        }

        // --- Tipos de datos no primitivos --- 
        //Ejercicio 1      
        String texto = "String en Java";
        System.out.println("String: " + texto);

        //Ejercicio 2
        int[] numerosPares = new int[3];
        numerosPares[0] = 14;
        numerosPares[1] = 22;
        numerosPares[2] = 58;

        System.out.println("Los numeros pares son: " + numerosPares[0] + ", " + numerosPares[1] + ", " + numerosPares[2] );

        // --- Operadores aritméticos ---
        
        //Ejercicio 1
        int n = 30;
        int z = 12;
        System.out.println("Suma: " + (n + z));
        System.out.println("Resta: " + (n - z));
        System.out.println("Multiplicacion: " + (n * z));
        System.out.println("Division: " + (n / z));
        System.out.println("Modulo: " + (n % z));

        //Ejercicio 2
        double divisionDecimal = (double) n / z;
        int divisionEntera = n / z;
        System.out.println("División entera: " + divisionEntera);
        System.out.println("División decimal: " + divisionDecimal);

        //Ejercicio 3
        int contador = 5;
        System.out.println("Contador inicial: " + contador);
        contador++;
        System.out.println("Después de incremento: " + contador);
        contador--;
        System.out.println("Después de decremento: " + contador);


        // --- Operadores de asignación ---  
        
        //Ejercicio 1
        int numero = 24;
        System.out.println("Numero sin cambios: " + numero);
        numero += 8;
        System.out.println("Numero con suma: " + numero);
        numero -= 13;
        System.out.println("Numero con resta: " + numero);

        //Ejercicio 2
        int numero2 = 61;
        System.out.println("Numero sin cambios: " + numero2);
        numero2 *= 37;
        System.out.println("Numero con multiplicacion: " + numero2);
        numero2 /= 11;
        System.out.println("Numero con division: " + numero2);

        //Ejercicio 3
        int num = 15;
        System.out.println("Paso 1 - Número inicial: " + num);
        System.out.println("Paso 2 - Operación: num %= 4");
        System.out.println("Paso 3 - Cálculo: " + num + " % 4 = " + (15 % 4));
        System.out.println("15 ÷ 4 = 3 (cociente)");
        System.out.println("3 × 4 = 12");
        System.out.println("15 - 12 = 3 ← RESTO");
        System.out.println("Paso 4 - Asignación: num = 3");
        num %= 4;
        System.out.println("Paso 5 - Resultado final: " + num);

        // --- Operadores de comparación ---       

        //Ejercicio 1
        int a = 41;
        int b = 38;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        //Ejercicio 2
        int j = 5;
        int v = 10;

        if (j > v) {
            System.out.println("j > v: SE CUMPLE");
        } else {
            System.out.println("j > v: NO SE CUMPLE");
        }

        if (j < v) {
            System.out.println("j < v: SE CUMPLE");
        } else {
            System.out.println("j < v: NO SE CUMPLE");
        }

        if (j >= v) {
            System.out.println("j >= v: SE CUMPLE");
        } else {
            System.out.println("j >= v: NO SE CUMPLE");
        }

        if (j <= v) {
            System.out.println("j <= v: SE CUMPLE");
        } else {
            System.out.println("j <= v: NO SE CUMPLE");
        }

        int edad = 18;
        if (edad >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }

        // --- Operadores lógicos ---       
    
        //Ejercicio 1
        boolean tienePasaporte = true;
        boolean tieneVisa = false;
        System.out.println("Puede viajar al exterior (&&): " + (tienePasaporte && tieneVisa));
        System.out.println("Tiene algún documento (||): " + (tienePasaporte || tieneVisa));
    
        //Ejercicio 2
        boolean usuarioConectado = true;
        System.out.println("Usuario conectado: " + usuarioConectado);
        System.out.println("Usuario desconectado: " + !usuarioConectado);

        //Ejercicio 3
        int edadNiño = 18;
        boolean estudiaPrimaria = false;
        boolean entregaKit = ((edadNiño < 14 || estudiaPrimaria) && edadNiño > 5);
        System.out.println("Se entrega kit: " + entregaKit);


        // --- If ---  
        //Ejercicio 1
        int num1 = 15;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        }

        //Ejercicio 2
        int familia = 10;
        if (familia >= 34) {
            System.out.println("Es una familia grande");
        } else {
            System.out.println("Es una familia pequeña");
        }

        //Ejercicio 3
        int nota = 67;
        if (nota >= 90) {
            System.out.println("Una excelente nota");
        } else if (nota >= 70) {
            System.out.println("Lo hiciste bien");
        } else if (nota >= 50) {
            System.out.println("Tienes que mejorar");
        } else {
            System.out.println("insuficiente");
        }

        // --- Operador ternario ---
        //Ejercicio 1
        int edadTernario = 20;
        String resultadoEdad = (edadTernario >= 18) ? "mayor de edad" : "menor de edad";
        System.out.println("La persona es: " + resultadoEdad);

        //Ejercicio 2
        int cantidad = 4;
        double precio = 100;
        double descuento = (cantidad >= 3) ? precio * 0.1 : 0.0;
        double precioFinal = precio - descuento;
        System.out.println("Descuento aplicado: " + precioFinal);

        //Ejercicio 3
        int numeroParImpar = 16;
        String tipoNumero = (numeroParImpar % 2 == 0) ? "par" : "impar";
        System.out.println("El número " + numeroParImpar + " es " + tipoNumero);

        // --- Switch ---     
        //Ejercicio 1
        String dia = "Miercoles";
        int numeroDia;

        switch (dia) {
            case "lunes": 
                numeroDia = 1; 
                break;
            case "martes": 
                numeroDia = 2; 
                break;
            case "miercoles": 
                numeroDia = 3; 
                break;
            case "jueves": 
                numeroDia = 4; 
                break;
            case "viernes": 
                numeroDia = 5; 
                break;
            case "sabado": 
                numeroDia = 6; 
                break;
            case "domingo": 
                numeroDia = 7; 
                break;
            default: 
                numeroDia = 0; 
                break;
            }
            if (numeroDia != 0) {
                System.out.println("El día " + dia + " es del numero : " + numeroDia);
            } else {
                System.out.println(" " + dia + " no es un día válido");
            }

        //Ejercicio 2

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una calificación de 1 a 10: ");
        int calificacion = sc.nextInt();

    switch (calificacion) {
      case 1:
        System.out.println("Insuficiente");
        break;
      case 2:
        System.out.println("Insuficiente");
        break;
      case 3:
        System.out.println("Insuficiente");
        break;
      case 4:
        System.out.println("Suficiente");
        break;
      case 5:
        System.out.println("Bien");
        break;
      case 6:
        System.out.println("Notable");
        break;
      case 7:
        System.out.println("Sobresaliente");
        break;
      case 8:
        System.out.println("Sobresaliente");
        break;
      case 9:
        System.out.println("Sobresaliente");
        break;
      case 10:
        System.out.println("Excelente");
        break;
      default:
        System.out.println("Calificación no válida");
    }
        //Ejercicio 3
    Scanner estaciones = new Scanner(System.in);

    System.out.println("Ingrese un número entero: ");
    int numeros = estaciones.nextInt();

    switch (numeros) {
      case 1:
      case 2:
      case 3:
        System.out.println("Invierno");
        break;
      case 4:
      case 5:
      case 6:
        System.out.println("Primavera");
        break;
      case 7:
      case 8:
      case 9:
        System.out.println("Verano");
        break;
      case 10:
      case 11:
      case 12:
        System.out.println("Otoño");
        break;
      default:
        System.out.println("Número no válido");
    }        
        // --- Otros ejemplos ---       
        //Ejercicio 1
        int numeroEvaluar = -5;
        if (numeroEvaluar > 0) {
            System.out.println("El número " + numeroEvaluar + " es positivo");
        } else if (numeroEvaluar < 0) {
            System.out.println("El número " + numeroEvaluar + " es negativo");
        } else {
            System.out.println("El número es cero");
        }

        //Ejercicio 2
        String contrasenaIngresada = "secreto123";
        String contrasenaCorrecta = "secreto123";
        if (contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.println("Contraseña correcta - Acceso permitido");
        } else {
            System.out.println("Contraseña incorrecta - Acceso denegado");
        }

        //Ejercicio 3
        int puntuacion = 61;
        String categoria;
        if (puntuacion >= 95) {
            categoria = "Sobresaliente";
        } else if (puntuacion >= 85) {
            categoria = "Notable";
        } else if (puntuacion >= 75) {
            categoria = "Bien";
        } else if (puntuacion >= 65) {
            categoria = "Suficiente";
        } else {
            categoria = "Insuficiente";
        }
        System.out.println("Nota " + puntuacion + ": " + categoria);
    }
}
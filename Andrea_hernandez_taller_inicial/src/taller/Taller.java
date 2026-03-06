package taller;

import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
import java.time.Period;

    public class Taller {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 1
        public void ejercicio1() {
            System.out.println("Ingrese un número entero:");
            int num = sc.nextInt();
            System.out.println("Número ingresado: " + num);
        }

        // 2
        public void ejercicio2() {
            System.out.println("Ingrese un número decimal:");
            double num = sc.nextDouble();

            if (num >= 0)
                System.out.println("Número positivo");
            else
                System.out.println("Número negativo");
        }

        // 3
        public void ejercicio3() {
            System.out.println("Ingrese un número entero:");
            int num = sc.nextInt();

            if (num % 2 == 0)
                System.out.println("PAR");
            else
                System.out.println("IMPAR");
        }

        // 4
        public void ejercicio4() {
            System.out.println("Ingrese un número entero:");
            int num = sc.nextInt();

            if (num % 2 == 0 && num >= 0)
                System.out.println("Par positivo");
            else if (num % 2 == 0)
                System.out.println("Par negativo");
            else if (num >= 0)
                System.out.println("Impar positivo");
            else
                System.out.println("Impar negativo");
        }

        // 5
        public void ejercicio5() {

            System.out.println("Ingrese su año de nacimiento:");
            int anio = sc.nextInt();

            LocalDate hoy = LocalDate.now();
            LocalDate nacimiento = LocalDate.of(anio, 1, 1);

            int edad = Period.between(nacimiento, hoy).getYears();

            System.out.println("Edad aproximada: " + edad);
        }

        // 6
        public void ejercicio6() {

            System.out.println("Ingrese número de teléfono:");
            String telefono = sc.next();

            if (telefono.startsWith("300"))
                System.out.println("Operador: Claro");
            else if (telefono.startsWith("310"))
                System.out.println("Operador: Movistar");
            else if (telefono.startsWith("320"))
                System.out.println("Operador: Tigo");
            else
                System.out.println("Operador desconocido");
        }

        // 7
        public void ejercicio7() {

            System.out.println("Ingrese primer número:");
            int a = sc.nextInt();

            System.out.println("Ingrese segundo número:");
            int b = sc.nextInt();

            int temp = a;
            a = b;
            b = temp;

            System.out.println("Valores intercambiados:");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
        }

        // 8
        public void ejercicio8() {

            int num = random.nextInt(21) + 50;
            System.out.println("Número aleatorio: " + num);
        }

        // 9
        public void ejercicio9() {

            System.out.println("Ingrese edad:");
            int edad = sc.nextInt();

            if (edad <= 3)
                System.out.println("Bebé");
            else if (edad <= 8)
                System.out.println("Niño");
            else if (edad <= 17)
                System.out.println("Adolescente");
            else
                System.out.println("Adulto");
        }

        // 10
        public void ejercicio10() {

            System.out.println("Ingrese valor de la venta:");
            double venta = sc.nextDouble();

            double descuento;

            if (venta > 150000)
                descuento = venta * 0.25;
            else
                descuento = venta * 0.10;

            double total = venta - descuento;
            double iva = total * 0.19;

            System.out.println("Descuento: " + descuento);
            System.out.println("IVA: " + iva);
            System.out.println("Total a pagar: " + (total + iva));
        }
    }


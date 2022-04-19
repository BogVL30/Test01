package main.java;

public class Triangle {
        public static double Sq () {
            int a = 3;
            int b = 4;
            int c = 5;
            int p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь треуголька: " + S);
            return S;
        }
    }


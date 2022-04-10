/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen1ºEvaluacion;

/**
 *
 * @author Eduardo
 */
public class Ejercicio__17 {

    public static double areaCirculo(double radio) {

        double areaC = Math.PI * Math.pow(radio, 2);

        return areaC;
    }

    public static double areaTriangulo(double base, double altura) {

        double areaT = (base * altura) / 2;

        return areaT;
    }

    public static double areaRombo(double DiagonalMayor, double DiagonalMenor) {

        double areaR = (DiagonalMayor * DiagonalMenor) / 2;

        return areaR;
    }

    public static double areaPentagono(double lado, double apotema) {

        double areaP = (lado * 5) * apotema / 2;

        return areaP;
    }

    public static void main(String[] args) {
        double areaCirculo = areaCirculo(15);
        double areaTriangulo = areaTriangulo(4, 2);
        double areaRombo = areaRombo(14, 5);
        double areaPentagono = areaPentagono(14, 5);

    }

}

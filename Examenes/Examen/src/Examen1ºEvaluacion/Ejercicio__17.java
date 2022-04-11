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

    /**
     *
     *
     * @param radio
     * @return areaC
     *
     * creación del metodo areaCirculo, el cual, pasa por parametro el radio
     * (indicado por el usuario) y calculado su area dentro del metodo
     */
    public static double areaCirculo(double radio) {

        double areaC = Math.PI * Math.pow(radio, 2);

        return areaC;
    }

    /**
     *
     * @param base
     * @param altura
     * @return areaT
     *
     * creación del metodo areaTriangulo, el cual, pasa por parametro la base y
     * la altura (indicado por el usuario) y calculado su area dentro del metodo
     */
    public static double areaTriangulo(double base, double altura) {

        double areaT = (base * altura) / 2;

        return areaT;
    }

    /**
     *
     * @param DiagonalMayor
     * @param DiagonalMenor
     * @return areaR
     *
     * creación del metodo areaRombo, el cual, pasa por parametro el la
     * DiagonalMayor y la menor (indicado por el usuario) y calculado su area
     * dentro del metodo
     */
    public static double areaRombo(double DiagonalMayor, double DiagonalMenor) {

        double areaR = (DiagonalMayor * DiagonalMenor) / 2;

        return areaR;
    }

    /**
     *
     * @param lado
     * @param apotema
     * @return
     *
     * creación del metodo areaPentagono y calculado su lado y apotema dentro
     * del metodo
     */
    public static double areaPentagono(double lado, double apotema) {

        double areaP = (lado * 5) * apotema / 2;

        return areaP;
    }

    /**
     *
     * @param args
     *
     * Creación del metodo main, el cual, se llaman a los metodos
     */
    public static void main(String[] args) {
        double areaCirculo = areaCirculo(15);
        double areaTriangulo = areaTriangulo(4, 2);
        double areaRombo = areaRombo(14, 5);
        double areaPentagono = areaPentagono(14, 5);

    }

}

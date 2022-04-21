/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ficheroscsv;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class DatosFichero {
    //Comunidad autonoma , Estacion , Altura , Mes , T , TM , Tm , R , H , DR , DN , DT , DF , DH , DD , I
    String comunidadAutonoma;
    String estacion;
    String altura;
    String mes;
    String T;
    String TM;
    String Tm;
    String R;
    String H;
    String DR;
    String DN;
    String DT;
    String DF;
    String DH;
    String DD;
    String I;

    public DatosFichero(String comunidadAutonoma, String estacion, String altura, String mes, String T, String TM, String Tm, String R, String H, String DR, String DN, String DT, String DF, String DH, String DD, String I) {
        this.comunidadAutonoma = comunidadAutonoma;
        this.estacion = estacion;
        this.altura = altura;
        this.mes = mes;
        this.T = T;
        this.TM = TM;
        this.Tm = Tm;
        this.R = R;
        this.H = H;
        this.DR = DR;
        this.DN = DN;
        this.DT = DT;
        this.DF = DF;
        this.DH = DH;
        this.DD = DD;
        this.I = I;
    }

    @Override
    public String toString() {
        return comunidadAutonoma + "," + estacion + "," + altura + "," + mes + "," + T + "," + TM + "," + Tm + "," + R + "," + H + "," + DR + "," + DN + "," + DT + "," + DF + "," + DH + "," + DD + "," + I;
    }
    
    
}

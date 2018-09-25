/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebitex.oficial;

/**
 *
 * @author jose
 */
public class Personal {
    private String nomTrab;
    private String estatus;
    private double sueldoBase;
    private static double maxSdoF_estatusE=0;
    private static double minSdoF_estatusE=1000000;
    private static double maxSdoF_estatusO=0;
    private static double minSdoF_estatusO=1000000;
    

    public String getNomTrab() {
        return nomTrab;
    }

    public void setNomTrab(String nomTrab) {
        this.nomTrab = nomTrab;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
        double sueldoFinal=sueldoFinal();
        if((sueldoFinal>maxSdoF_estatusE)&&(getEstatus().equals("E")))
               maxSdoF_estatusE=sueldoFinal;
           if((sueldoFinal>maxSdoF_estatusO)&&(getEstatus().equals("O")))
               maxSdoF_estatusO=sueldoFinal;
           if((sueldoFinal<minSdoF_estatusE)&&(getEstatus().equals("E")))
               minSdoF_estatusE=sueldoFinal;
           if((sueldoFinal<minSdoF_estatusO)&&(getEstatus().equals("O")))
               minSdoF_estatusO=sueldoFinal;
    }
    public double sueldoFinal(){
        return sueldoBase*1.22;
    }
    public double maximo_sueldoFinal(String estat){
        double ret=sueldoFinal();
        if (estat.equals("E"))ret=maxSdoF_estatusE;
        else if (estat.equals("O"))ret=maxSdoF_estatusO;
        return ret;
        
    }
     public double minimo_sueldoFinal(String estat){
         double ret=sueldoFinal();
        if (estat.equals("E"))ret=minSdoF_estatusE;
        else if (estat.equals("O"))ret=minSdoF_estatusO;
        return ret;
    }

}

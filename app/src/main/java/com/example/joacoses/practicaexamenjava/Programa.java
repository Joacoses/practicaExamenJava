package com.example.joacoses.practicaexamenjava;

public class Programa {
    private int horaInicio;
    private int horaFinal;
    private String tipo;

    public Programa(){
    }
    public Programa(int horaInicio, int horaFinal, String tipo){
        this.horaInicio=horaInicio;
        this.horaFinal=horaFinal;
        this.tipo=tipo;
    }

    public Programa(String s, int hora, int horaFin, String tipo) {
    }

    /*-----------------------------------get-set----------------------------------------------------*/
    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /*---------------------------------FIN:get-set--------------------------------------------------*/

    public String toString(){
        String mensaje="{hora inicio: "+ horaInicio + ", hora final: " + horaFinal + ", tipo: " + tipo+"}";
        return mensaje;
    }

}

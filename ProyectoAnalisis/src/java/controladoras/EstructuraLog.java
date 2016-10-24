package controladoras;

import controladoras.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gianka
 */
public class EstructuraLog {
    String nombre;
    String valor;
    int linea;

    public EstructuraLog(String nombre, String valor,int linea) {
        this.nombre = nombre;
        this.valor = valor;
        this.linea=linea;
    }

    public EstructuraLog() {
    }
    
}

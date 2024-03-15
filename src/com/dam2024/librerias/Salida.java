package com.dam2024.librerias;

import javax.swing.*;
public class Salida {
    /**
     * opcion de ventana
     */
    public static final Integer Ventana=1;

    /**
     * opcion para consola
     */
    public static final Integer Consola=2;

    // String para el mensaje
    public static boolean salida_ventana(String msg, Integer opcion){
        if (opcion==Ventana) {
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (opcion == Consola) {
            System.out.println(msg);
        }
        return true;
    }
}

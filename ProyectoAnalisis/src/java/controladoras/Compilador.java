/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Alejandro
 */
public class Compilador {

    Class clase;

    public Compilador() {
    }
    
    public void compilar()
    {
        try {
            clase = Class.forName(Compilador.class.getPackage().getName()+"."+"Programa");
            Object objeto=clase.newInstance();
            Method ejecutarTarea = clase.getMethod("principal", null);
            ejecutarTarea.invoke(objeto, null);
            Method ejecutarTarea1 = clase.getMethod("mostrar", null);
            ejecutarTarea1.invoke(objeto, null);
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener la clase");
        } catch (InstantiationException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            System.out.println("Error acceso ilegal");
        } catch (NoSuchMethodException ex) {
            System.out.println("No se encontro el metodo");
        } catch (SecurityException ex) {
            System.out.println("Excepcion de seguridad");
        } catch (IllegalArgumentException ex) {
            System.out.println("Argumentacion ilegal");
        } catch (InvocationTargetException ex) {
            System.out.println("Error al invocar");
        }
    }
    public static void main(String[] args) {
        Compilador oe= new Compilador();
        oe.compilar();
    } 
}

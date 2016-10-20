/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladoras;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author Jorge Alejandro
 */
public class GenerarJava {

    public  String codigo;
    public  String java;
    private  HashMap<String, String> variables;

    public GenerarJava() {
        System.out.println("hola mundo");
        variables=new HashMap<String, String>();
        codigo = "";
        java = "";

    }
    public static void oe()
    {
        System.out.println("asda");
    }
    public void recibir(String texto) {
        codigo = codigo + texto + "\n";

    }

    public  void escribir() {
        java="package controladoras;\n"
                + "public class Programa {\n"
                + "public void principal() {\n"
                + "" + codigo + "\n"
                + "}\n"
                + "}\n";
        System.out.println(java);
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("D:\\Proyectos\\Proyecto-Analisis-Java-web\\ProyectoAnalisis\\src\\java\\controladoras\\Programa.java");//C:\\Users\\Jorge Alejandro\\Documents\\NetBeansProjects\\Proyecto-Analisis-Java-web\\ProyectoAnalisis\\src\\java\\controladoras\\Programa.java
            pw = new PrintWriter(fichero);
            pw.println(java);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void insertarVariable(String tipo, String identificador) {
        variables.put(identificador, tipo);
    }

    public String buscarVariable(String identificador) {
        try {
            String tipo = variables.get(identificador);
            return tipo;
        } catch (Exception E) {
            return null;
        }
    }
}

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

    public String codigo;
    public String java;
    private HashMap<String, String> variables;

    public GenerarJava() {
        System.out.println("hola mundo");
        variables = new HashMap<String, String>();
        codigo = "";
        java = "";

    }

    public static void oe() {
        System.out.println("asda");
    }

    public void recibir(String texto) {
        codigo = codigo + texto + "\n";

    }
    public void escribirWhile(String condicion) {
        recibir("\n while("+condicion+"){");
        escribir();
    }
    public void escribirDeclaraciones(Token n, String[] valores) {
        recibir(valores[1] + " " + n.image + " = " + valores[0] + ";");
        if (valores[1].equals("String")) {
            recibir("agregar(\"" + n.image + "\"," + n.image + "," + n.beginLine + ");");
        } else {

            recibir("agregar(\"" + n.image + "\",Integer.toString(" + n.image + ")," + n.beginLine + ");");
        }
        insertarVariable(valores[1], n.image);
           }

    public void escribir() {
        java = "package controladoras;\n"
                + "import java.util.LinkedList;"
                + "public class Programa {\n"
                + "LinkedList<EstructuraLog> log=new LinkedList<EstructuraLog>();"
                + "public void principal() {\n"
                + "" + codigo + "\n"
                + "}\n"
                + "public void  agregar(String x,String valor,int linea)\n"
                + "{\nlog.add(new EstructuraLog(x, valor,linea));\n}\n"
                + "public void mostrar()\n{  \nfor (int i = 0; i < this.log.size(); i++) \n{\n\n        System.out.println(\"linea\"+this.log.get(i).linea+\"  variable=\"+this.log.get(i).nombre+\"=\"+this.log.get(i).valor);\n    }\n}\n"
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

package controladoras;
import java.util.LinkedList;public class Programa {
LinkedList<EstructuraLog> log=new LinkedList<EstructuraLog>();public void principal() {
String oe1 = "234";
agregar("oe1",oe1,2);
int oe2 = 12;
agregar("oe2",Integer.toString(oe2),3);
int oe3 = oe2;
agregar("oe3",Integer.toString(oe3),4);

 while(true  && oe3 > oe2){
String x = "12";
agregar("x",x,7);

}


}
public void  agregar(String x,String valor,int linea)
{
log.add(new EstructuraLog(x, valor,linea));
}
public void mostrar()
{  
for (int i = 0; i < this.log.size(); i++) 
{

        System.out.println("linea"+this.log.get(i).linea+"  variable="+this.log.get(i).nombre+"="+this.log.get(i).valor);
    }
}
}


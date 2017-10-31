
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int anyo;
    private int mes;
    private int dia;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        anyo = 1;
        mes = 1;
        dia = 1;
    }

    public void fijarFecha(int nDia , int nMes , int nAnyo)
    {
        dia = nDia;
        mes = nMes;
        anyo = nAnyo;    
    }
    
    public String obtenerFecha()
    { String  d =  dia +"-";
      String  m = mes +"-";
      String  a = anyo +"";
      if(dia<9 || mes<9){
      d = "0" + d;
      m = "0" + m;
    }    
      return d + m + a.substring(2,4);
    }
    
    public void avanzarFecha()
    {
     dia = dia +1;
     if(dia > 30){
         dia = 1;
         mes= mes + 1;
        if (mes > 12){
         mes = 1;
         anyo = anyo + 1;
        }
        }
    }
}

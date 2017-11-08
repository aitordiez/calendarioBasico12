/**
 * Write a description of class calendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int anho;

    /**
     * Constructor for objects of class calendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        anho = 1;
    }

    public void fijarFecha(int dias, int meses, int anhos)
    {
        dia = dias;
        mes = meses;
        anho = anhos;
    }
    
    public void avanzarFecha() {
        if (dia == 28 && mes == 2){
            dia = 1;
            mes = mes + 1;
        } else if (dia == 30 && mes == 12) {
            dia = 1;
            mes = 1;
            anho = anho + 1;
        } else if (dia == 30) {
            dia = 1;
            mes = mes + 1;
        } else {
            dia = dia + 1;
        }
    }
    
    public String obtenerFecha() {  
        return (dia < 10 ? "0"+ dia : dia) + "-" + (mes < 10 ? "0"+ mes : mes) + "-" + (anho < 10 ? "0"+ anho : anho);
    }

}


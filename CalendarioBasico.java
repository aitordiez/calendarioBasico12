/**
 * Write a description of class calendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres anho;

    /**
     * Constructor for objects of class calendarioBasico
     */
    public CalendarioBasico()
    {
        dia= new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        anho = new DisplayDosCaracteres(2100);
    }

    public void fijarFecha(int dias, int meses, int anhos)
    {
        dia.setValorAlmacenado(dias);
        mes.setValorAlmacenado(meses);
        anho.setValorAlmacenado(anhos);
    }

    public void avanzarFecha() {
        dia.incrementaValorAlmacenado();
        if (dia.getValorAlmacenado() == 1){
            mes.incrementaValorAlmacenado();
            if (mes.getValorAlmacenado() == 1){
                anho.incrementaValorAlmacenado();
            }
        }
    } 

    public String obtenerFecha() {  
        return dia.getTextoDelDisplay()+ "-" + mes.getTextoDelDisplay() +"-"+anho.getTextoDelDisplay();
    }

}


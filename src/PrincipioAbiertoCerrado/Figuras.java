package PrincipioAbiertoCerrado;

import java.util.Vector;
import java.util.Enumeration;

public class Figuras {
    Vector<Figura> figuras = new Vector<Figura>();
    public void addFigura(Figura fig){
        figuras.add(fig);
    }
    public void dibujarFiguras(){
        Enumeration<Figura> figs = figuras.elements();
        Figura f ;
        while (figs.hasMoreElements()){
            f=figs.nextElement();
            f.dibujar();
        }
    }
}

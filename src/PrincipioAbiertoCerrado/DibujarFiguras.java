package PrincipioAbiertoCerrado;

import java.util.Vector;
import java.util.Enumeration;

public class DibujarFiguras {
    Vector<Cuadrado> cuadrados=new Vector<Cuadrado>();
    Vector<Circulo> circulos= new Vector<Circulo>();
    public void addCirculo(Circulo c){
        circulos.add(c);
    }
    public void addCuadrado(Cuadrado c){
        cuadrados.add(c);
    }
    public void dibujarFiguras(){
        Enumeration<Cuadrado> cuads=cuadrados.elements();
        Cuadrado c;
        while (cuads.hasMoreElements()){
            c=cuads.nextElement();
            c.dibujar();
        }
        Enumeration<Circulo> circs=circulos.elements();
        Circulo ci;
        while (cuads.hasMoreElements()){
            ci=circs.nextElement();
            ci.dibujar();
        }
    }
}

package PrincipioDeResponsabilidadUnica;

import java.util.Date;

public class Factura {
    public String _codigo;
    public Date fechaEmision;
    public Float importeFactura;
    public Float importeIVA;
    public Float importeDeduccion;
    public Float importeTotal;
    public int porcentajeDecuccion;

    //Metodo para calcular el total de la factura
    public void calcularFactura(){
        //Calcular deduccion
        CalcularDeduccion cd = new CalcularDeduccion(porcentajeDecuccion);
        importeDeduccion =cd.calcularDeduccion(importeFactura);
        //Calcular el IVA
        CalcularIVA ci = new CalcularIVA();
        importeIVA = ci.calculaIVA(importeFactura);
        //Calcular el total
        importeTotal = (importeFactura-importeDeduccion)+importeIVA;
    }
}

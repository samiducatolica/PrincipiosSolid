package PrincipioDeResponsabilidadUnica;

import java.util.Date;

public class FacturaOriginal {
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
        importeDeduccion =(importeFactura * porcentajeDecuccion)/100;
        //Calcular el IVA
        importeIVA = (float) (importeFactura * 0.16);
        //Calcular el total
        importeTotal = (importeFactura-importeDeduccion)+importeIVA;
    }
}

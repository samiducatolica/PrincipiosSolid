package PrincipioDeResponsabilidadUnica;

public class CalcularDeduccion {
    private float porcentajeDeduccion;
    public CalcularDeduccion(float pporcentajeDeduccion){
        porcentajeDeduccion=pporcentajeDeduccion;
    }
    public float calcularDeduccion(float importeFactura){
        if(importeFactura>1000){
            return (importeFactura * porcentajeDeduccion+3)/100;
        }else {
            return (importeFactura * porcentajeDeduccion) / 100;
        }
    }
}

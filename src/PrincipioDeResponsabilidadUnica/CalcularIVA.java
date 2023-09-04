package PrincipioDeResponsabilidadUnica;

public class CalcularIVA {
    private static  final double IVA=(18/100);
    public CalcularIVA(){

    }
    public float calculaIVA(float importeFactura){
        return (float) (importeFactura * IVA);
    }
}

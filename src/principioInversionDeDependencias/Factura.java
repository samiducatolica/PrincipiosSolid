package principioInversionDeDependencias;

public class Factura {
    public String _codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;
    //Se crean 2 interfaces conla logica del importe de IVA e importe de Deduccion
    private IDeduccion iDeduccion;
    private IIVA iiva;

    public Factura(IDeduccion iDeduccion, IIVA iiva) {
        this.iDeduccion = iDeduccion;
        this.iiva = iiva;
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        importeDeduccion = iDeduccion.calculaDeduccion(importeFactura);
        // Calculamos el IVA
        importeIVA = iiva.calculaIVA(importeFactura);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}

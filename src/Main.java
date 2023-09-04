import PrincipioLiskov.Configuracion;

public class Main {
    public static void main(String[] args) {

        Configuracion c = new Configuracion();
        c.cargaConfiguracion();
        c.salvarConfiguracion();
    }
}
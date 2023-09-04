package PrincipioLiskov;

public class ConfiguracionSistema implements ILoadRecursoPersistente,ISaveRecursoPersistente{
    @Override
    public void load() {
        System.out.println("Configuracion Sistema Cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion Sistema Almacenada");
    }
}

package PrincipioLiskov;

public class ConfiguracionHoraria implements ILoadRecursoPersistente{
    @Override
    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

}

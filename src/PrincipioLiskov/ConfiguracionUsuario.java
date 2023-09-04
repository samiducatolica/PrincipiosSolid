package PrincipioLiskov;

public class ConfiguracionUsuario implements ISaveRecursoPersistente,ILoadRecursoPersistente{
    @Override
    public void load() {
        System.out.println("Configuracion de usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Consifguracion de usuario almacenada");
    }
}

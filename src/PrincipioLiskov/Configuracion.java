package PrincipioLiskov;

import java.util.Iterator;
import java.util.Vector;

public class Configuracion {

    Vector<ISaveRecursoPersistente> srp = new Vector<ISaveRecursoPersistente>();
    Vector<ILoadRecursoPersistente> lrp = new Vector<ILoadRecursoPersistente>();
    public void cargaConfiguracion(){
        lrp.add(new ConfiguracionSistema());
        lrp.add(new ConfiguracionUsuario());
        lrp.add(new ConfiguracionHoraria());

        for (ILoadRecursoPersistente irp : lrp) {
            irp.load();
        }
    }
    public void salvarConfiguracion(){
        srp.add(new ConfiguracionSistema());
        srp.add(new ConfiguracionUsuario());
        for (ISaveRecursoPersistente isrp : srp) {
            isrp.save();
        }
    }
}

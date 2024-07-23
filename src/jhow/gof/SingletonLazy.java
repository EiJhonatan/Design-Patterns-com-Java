package jhow.gof;
/**
 * praticando com Singleton java puro
 * Singleton "preguiçoso"
 * @author EiJhonatan
 * 
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancia(){
        if (instancia == null) {
            instancia= new SingletonLazy();
        }
        return instancia;
    }
}

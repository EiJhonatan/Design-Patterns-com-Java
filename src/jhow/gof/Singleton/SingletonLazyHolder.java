package jhow.gof.Singleton;
/**
 * praticando com Singleton java puro
 * Singleton "LazyHolder"
 * @author EiJhonatan
 * 
 */

public class SingletonLazyHolder {
    private static class  InstanceHolder{
        private static SingletonLazyHolder instancia= new SingletonLazyHolder();

    } 
    
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}

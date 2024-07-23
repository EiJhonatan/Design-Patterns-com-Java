package jhow.gof;
/**
 * praticando com Singleton java puro
 * Singleton "Apressado"
 * @author EiJhonatan
 * 
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){
       
        return instancia;
    }
}


package implementaciones;

public class SingletonBasic {

    private static SingletonBasic INSTANCE;

    /**
     * Constructor privado que no permite que se genere un constructor por defecto.
     * (con mismo modificador de acceso que la definición de la clase).
     */
    private SingletonBasic() {
    }

    /**
     * Esta implementación no es Thread Safe, lo que quiere decir,
     * que no funciona correctamente en entornos multithread.
     * En entornos de un único thread, el funcionamiento es correcto.
     * 
     * @return SingletonBasic instance
     */
    public static SingletonBasic getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SingletonBasic();
        return INSTANCE;
    }
}

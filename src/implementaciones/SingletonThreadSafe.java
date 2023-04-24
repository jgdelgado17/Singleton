package implementaciones;

public class SingletonThreadSafe {

    private static SingletonThreadSafe INSTANCE;

    /**
     * Constructor privado que no permite que se genere un constructor por defecto.
     * (con mismo modificador de acceso que la definición de la clase).
     */
    private SingletonThreadSafe() {
    }

    /**
     * El uso de synchronized hace que esta implementación sea Thread Safe,
     * es decir que,
     * de esta manera evitamos que dos threads entren a la vez en el método y puedan
     * crear de manera simultánea un objeto y tener dos instancias del mismo objeto.
     * Pero no tiene en cuenta que el uso de synchronized penaliza el rendimiento.
     * 
     * @return SingletonThreadSafe
     */
    public synchronized static SingletonThreadSafe getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SingletonThreadSafe();
        return INSTANCE;
    }
}

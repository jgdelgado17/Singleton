package implementaciones;

public class SingletonThreadSafeCheckedLocking {

    private static SingletonThreadSafeCheckedLocking INSTANCE;

    /**
     * Constructor privado que no permite que se genere un constructor por defecto.
     * (con mismo modificador de acceso que la definición de la clase).
     */
    private SingletonThreadSafeCheckedLocking() {
    }

    /**
     * El uso de synchronized hace que esta implementación sea Thread Safe,
     * es decir que,
     * de esta manera evitamos que dos threads entren a la vez en el método y puedan
     * crear de manera simultánea un objeto y tener dos instancias del mismo objeto.
     * Tiene en cuenta el coste de la sincronización
     * al hacer uso de double checked locking para mejorar el rendimiento
     * al mover el bloque synchronized dentro del método
     * y hacer una verificación previa
     * 
     * @return SingletonThreadSafeCheckedLocking
     */
    public static SingletonThreadSafeCheckedLocking getInstance() {
        if (INSTANCE == null)
            synchronized (SingletonThreadSafeCheckedLocking.class) {
                if (INSTANCE == null)
                    INSTANCE = new SingletonThreadSafeCheckedLocking();
            }
        return INSTANCE;
    }
}

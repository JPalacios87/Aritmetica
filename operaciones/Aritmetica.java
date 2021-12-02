package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a; // En java las variables si no se especifica un valor, se inicializan con un
           // valor por default para cada tipo. En el caso de las variables de tipo int el
           // valor por defecto es 0.
    int b;

    // Constructor vacío: Los Constructores son un método especial. No devuelven
    // ningún valor y siempre se llaman igual a la clase a la que pertenecen. Solo
    // se pueden llamar para crear el objeto, como se hace en la clase de
    // PruebaAritmetica al usar la palabra reservada new.
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    // Metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }

    public int sumarConRetorno() {
        /**
         * int resultado = a + b;
         * return resultado;
         */
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a; // El argumento a se asigna al atributo this.a
        this.b = b;
        return this.sumarConRetorno();
    }
}
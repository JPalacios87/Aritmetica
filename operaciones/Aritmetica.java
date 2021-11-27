package operaciones;
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Metodos
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }
    public int sumarConRetorno() {
        /**
         * int resultado = a+ b;
         * return resultado;
         */
        return a + b;
    }
}
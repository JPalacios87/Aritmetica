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
         * int resultado = a + b;
         * return resultado;
         */
        return a + b;
    }
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return sumarConRetorno();
    }
}
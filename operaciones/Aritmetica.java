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
        return this.a + this.b;
    }
    public int sumarConArgumentos(int a, int b){
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b;
        return this.sumarConRetorno();
    }
}
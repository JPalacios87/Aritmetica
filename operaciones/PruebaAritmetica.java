package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica artimetica1 = new Aritmetica();
        artimetica1.a = 3;
        artimetica1.b = 2;
        artimetica1.sumar();

        int resultado = artimetica1.sumarConRetorno();
        System.out.println("Resultado desde la prueba = " + resultado);
    }
}

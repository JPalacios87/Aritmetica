package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica artimetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + artimetica1.a);
        System.out.println("aritmetica1 b: " + artimetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);

    }
}

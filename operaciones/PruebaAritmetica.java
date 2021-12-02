package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        //Variables locales
        var a = 10;
        var b = 2;
        MiMetodo();

        Aritmetica artimetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + artimetica1.a);
        System.out.println("aritmetica1 b: " + artimetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
    }

    public static void MiMetodo (){
        //la variable a está fuera del alcance donde fue definida.
        //a = 10;
        System.out.println("otro método");
    }
}
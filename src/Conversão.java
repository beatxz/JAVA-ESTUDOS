public class Conversão {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numerointeger = 10;
        String numeroString = numerointeger.toString();

        Double numerodouble = 10.0;
        String numerodoublrstring = numerodouble.toString();

        Long numerolong =10L;
        String numeroStringLong = numerolong.toString();

        System.out.println(d);
        System.out.println(int2);
        System.out.println(numerointeger + " " + numeroString);


    }
}

package Wrapper.Ex002;

public class String02 {
    public static void main(String[] args) {
        String nome = "isa";
        String numbers = "13456";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("i", "b"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(2));

        StringBuilder sb = new StringBuilder("Beatriz");
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);    }
}
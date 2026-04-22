package Exception.ExceptionTest.Ex002;

public class RuntimeException01 {
    public static void main (String[]args){
       System.out.println( division(4,0));

    }
    private static int division (int a, int b) {
        if (b==0){
            throw new RuntimeException("illegal argument");
        }
        return 0;

    }
}

package POO.TryCatch;

import java.io.IOException;

public class App {
    public static void main(String[]args)throws Exception {
        int [] numbers = new int[]{10,20,30,100};
        int[] pesos = new int[] {2,0,4,};

        System.out.println("Number: ");

        try{
            for(int i=0;i<4; i++){
                int result = numbers[i]/pesos[i];
                System.out.printf("%d / %d = %d \n",numbers[i],pesos[i],result);
            }

        }catch(Exception error){
            System.out.println("Error: "+error.getMessage());
        }

        System.out.println("Final message: ");

    }
}

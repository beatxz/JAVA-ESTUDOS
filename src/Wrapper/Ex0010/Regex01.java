package Wrapper.Ex0010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: "+text);
        System.out.println("indices: 0123456789");
        System.out.println("regex : "+regex);
        System.out.println("Find positions");

        while(matcher.find()){
            System.out.println(matcher.start()+" ");

        }



    }
}

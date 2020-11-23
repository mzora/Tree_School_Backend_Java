package Stream_Base;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("aldo");
        lista.add("franco");
        lista.add("francesca");

        int sum = 0;
        for (String s : lista) {
            if(s.charAt(0)=='f'){
                sum+=s.length();
            }
        }

        int sum2= lista.stream().filter(s -> s.startsWith("f")).mapToInt(String::length).sum();
        System.out.println(sum+" "+sum2);
    }
}

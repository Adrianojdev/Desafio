import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra");
        subString(scanner.next());

        scanner.close();
    }


    static void subString(String s){
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valor = s.substring(i, j+1).toCharArray();
                Arrays.sort(valor);
                String valorC = new String(valor);
                if (map.containsKey(valorC))
                    map.put(valorC, map.get(valorC)+1);
                else
                    map.put(valorC, 1);
            }
        }
        int contaAnagramas = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            contaAnagramas += (n * (n-1))/2;
        }
        System.out.println(contaAnagramas);
    }
}
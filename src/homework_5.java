import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class homework_5 {
    public static void main(String[] args) {
        /**
         * Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022
         *
         * Написать метод, который переведёт данное целое число в римский формат.
         *

         * IV - 4
         * VII - 7
         * - I = 1
         * - V = 5
         * - X = 10
         * - L = 50
         * - C = 100
         * - D = 500
         * - M = 1000
         */
        homework_5 mn = new homework_5();
        Scanner iScanner = new Scanner(System.in);
        String key = iScanner.next();
        HashMap<String, Integer> map = new HashMap<>();
        int num = iScanner.nextInt();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

//        System.out.println(mn.convert(map,key));
        System.out.println(mn.obrConvert(map, num));
    }

    public int convert (HashMap<String,Integer>rim,String key1){
        int sum = 0;
        String[] split = key1.split("");
        for (int i = 0; i < split.length; i++) {
            sum+=rim.get(split[i]);
        }
        return sum;
    }
    public LinkedList<Integer> obrConvert (HashMap<String,Integer>rim,int key1){
        LinkedList<Integer> element = new LinkedList<>();
        while(key1 >0){
            element.add(key1%10);
            key1/=10;
        }
        String rima = "";
        for (int i = 0; i < element.size(); i++) {

        }

        return element;
    }

}
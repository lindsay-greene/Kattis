import java.io.*;
import java.util.*;

public class zoo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int i = 1;
        while(num > 0) {
            TreeMap<String, Integer> animals = new TreeMap<String, Integer>();
            for(int j = 0; j < num; j++) {
                String animal = input.nextLine().toLowerCase();
                String[] words = animal.split(" ");
                String type = words[words.length-1];
                if(!animals.containsKey(type)) animals.put(type, 1);
                else animals.put(type, animals.get(type)+1);
            }
            System.out.println("List " + i + ":");
            for(int j = 0; j < animals.size(); j++) {
                String type = (String) animals.keySet().toArray()[j];
                System.out.println(type + " | " + animals.get(type));
            }
            i++;
            num = Integer.parseInt(input.nextLine());
        }
    }
}

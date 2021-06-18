package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

        public static void main(String[] args){

            List<String> list = new ArrayList<>();

            list.add("Maria");
            list.add("Alex");
            list.add("Maria");
            list.add("Ariadina");
            list.add("Maria");
            list.add("Rafael");
            list.add(2, "Marco");

            list.removeIf(x -> x == 'Maria');

            System.out.println(list.size());

            for (String name: list){
                System.out.println(name);
            }

        }
}

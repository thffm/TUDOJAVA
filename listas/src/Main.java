import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("anna");
        list.add("Joao");
        list.add("Bob");
        list.add(2,"Marco");
        list.add("alex");
        list.add("lidia");

        for(String nome: list){
            System.out.println(nome);
        }
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println("----------");
        for (String nome: list){
            System.out.println(nome);
        }
        System.out.println("Index lidia:"+list.indexOf("lidia"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
        System.out.println(result);
        String alex = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
    }
}
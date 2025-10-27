import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("ana", "bruno", "carla", "daniel");

        // Usando map() com Stream
        List<String> nomesMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Com map(): " + nomesMaiusculos);

        // Usando forEach()
        List<String> resultado = new ArrayList<>();
        nomes.forEach(nome -> resultado.add(nome.toUpperCase()));

        System.out.println("Com forEach(): " + resultado);
        }
    }

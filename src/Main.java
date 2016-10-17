import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dam on 3/10/16.
 */
public class Main {

    public static void main(String[] args) {

        procesarPokemons();

        List <Capturable> entidadesCapturables = new ArrayList<>();

        entidadesCapturables.add(new PokemonesFoc());
        entidadesCapturables.add(new Encustipat());

        entidadesCapturables.add(new Leon("Simba"));


        entidadesCapturables.forEach(e -> e.);

    }

    private static void procesarPokemons() {
        Pokemon charizard = new PokemonesFoc();

        List<Pokemon> pokemonList = new ArrayList<>();


        pokemonList.add(charizard);

        pokemonList.forEach(
                p -> {
                    System.out.println(p);
                    if (p.capturar()) {
                        System.out.println("Pokemone ! Capturado");
                    } else {
                        System.out.println("No capturado");
                    }

                });
    }


}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usu32 on 03/10/2016.
 */
public abstract class Pokemon implements Capturable  {

    private List<Pokemon> pokemonesList;

    public Pokemon() {
       pokemonesList = new ArrayList<>();
    }

    private String nom;
    private int atak;
    private int def;
    private int salut;

    public Pokemon(String nom, int atak, int def, int salut) {
        this.nom = nom;
        this.atak = atak;
        this.def = def;
        this.salut = salut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAtak() {
        return atak;
    }

    public void setAtak(int atak) {
        this.atak = atak;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSalut() {
        return salut;
    }

    public void setSalut(int salut) {
        this.salut = salut;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", atak=" + atak +
                ", def=" + def +
                ", salut=" + salut +
                '}';
    }
}

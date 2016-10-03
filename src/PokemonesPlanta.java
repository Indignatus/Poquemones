/**
 * Created by usu32 on 03/10/2016.
 */
public class PokemonesPlanta {

    private String tipus = "planta";
    private String efectiuContre = "aigua" ;
    private String debilContre = "foc";

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEfectiuContre() {
        return efectiuContre;
    }

    public void setEfectiuContre(String efectiuContre) {
        this.efectiuContre = efectiuContre;
    }

    public String getDebilContre() {
        return debilContre;
    }

    public void setDebilContre(String debilContre) {
        this.debilContre = debilContre;
    }

    @Override
    public String toString() {
        return "PokemonesPlanta{" +
                "tipus='" + tipus + '\'' +
                ", efectiuContre='" + efectiuContre + '\'' +
                ", debilContre='" + debilContre + '\'' +
                '}';
    }
}

/**
 * Created by usu32 on 03/10/2016.
 */
public class PokemonesAgua {

    private String tipus = "aigua";
    private String efectiuContre = "foc";
    private String debilContre = "planta";

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
        return "PokemonesAgua{" +
                "tipus='" + tipus + '\'' +
                ", efectiuContre='" + efectiuContre + '\'' +
                ", debilContre='" + debilContre + '\'' +
                '}';
    }
}

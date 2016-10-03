import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by usu32 on 03/10/2016.
 */



public class PokemonesAgua extends Pokemon implements Capturable {


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

    @Override
    public boolean capturar() {


        int randomNum = ThreadLocalRandom.current().nextInt(20, 120 + 1)- this.getDef();

        if (randomNum >= this.getDef()){
            return true;
        }else{
            return false;
        }


    }
}

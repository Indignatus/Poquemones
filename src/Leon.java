/**
 * Created by dam on 17/10/16.
 */
public class Leon implements Capturable{

    private String nombre;

    public Leon(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean capturar() {
        return false;
    }
}

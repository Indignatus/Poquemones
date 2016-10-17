import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by usu32 on 17/10/2016.
 */
public class Encustipat implements Capturable {

    @Override
    public boolean capturar() {

        int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);

        System.out.println(randomNum);

        if(randomNum == 0){
            System.out.println("Te has refriado GG");

            return true;
        }else{

            System.out.println("Te has librado de un resfriado GJGG");

            return false;
        }


    }
}

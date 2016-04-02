/**
 * Created by 7 on 02.04.2016.
 */
public class SamsungS4 extends Phone {
    public SamsungS4(){
        System.out.println("SamsungS4 constructor");
        screenSize = 5;
        hasWifi = true;
        touch = true;
    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("SamsungS4 is sending '" + message + " Hello" + "' to number '" + number + "'");
    }
}

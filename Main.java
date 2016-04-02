/**
 * Created by andrey on 02.04.2016.
 */
public class Main {
    public static void main(String[] args){
        SamsungS4 samsungS4 = new SamsungS4();
        Nokia3310 nokia3310 = new Nokia3310();

        samsungS4.call("5648654");
        samsungS4.call("213545");
        samsungS4.sendSMS("4687868", "wassap!");
        samsungS4.sms("2323523", "whoa!");
        nokia3310.call("23423");

        System.out.println("number of calls: " + samsungS4.getCallCount());
        System.out.println("number of sent sms's: " + samsungS4.getSmsCount());
        System.out.println("number of calls: " + nokia3310.getCallCount());
    }
}

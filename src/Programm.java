import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Array;
import java.util.*;

public class Programm {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(new String[]{"Samsung", "LG"}, new String[]{"S1", "L1"});

        OldTelevisor oldTelevisor = new OldTelevisor("Samsung", "S1");
        NewTelevisor newTelevisor = new NewTelevisor("LG", "L1");

        oldTelevisor.turnOnOrOffByRemoteControl(remoteControl);
        oldTelevisor.turnOnOrOffByRemoteControl(remoteControl);
        System.out.println();
        newTelevisor.turnOnOrOffByRemoteControl(remoteControl);
        newTelevisor.turnOnOrOffByRemoteControl(remoteControl);













    }
}

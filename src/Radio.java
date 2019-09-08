import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Scanner;
import Broadcasters.Broadcasters;
import Broadcasters.Sex;

public class Radio {
    private final String name = "radiOop";
    private final String dir = "Tec de cartago";
    private final String webDir = "www.radioop.com";
    private final double frequency = 118.5;
    private static ArrayList<Broadcasters> broadcasters = new ArrayList<Broadcasters>(0);


    public static void main(String[] args){

        Broadcasters julio = new Broadcasters("21312","julio","dadkaf@dfjka.com",139123,"fsakaf", Sex.MALE,"22/2/1230");
        Broadcasters fernando = new Broadcasters("213123","fernando","dadkaf@dfjka.com",139123,"fsakaf", Sex.MALE,"22/2/1230");
        broadcasters.add(julio);
        broadcasters.add(fernando);

        for (Broadcasters broadcaster:
             broadcasters
             ){
            System.out.println(broadcaster.getSex());

        }

    }
}

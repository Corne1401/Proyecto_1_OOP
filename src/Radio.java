import java.util.ArrayList;
import java.util.Scanner;

import Broadcasters.*;
import Program.*;


/**
 * la clase radio es la clase que maneja los datos, esta puede crear nuevos locutores
 * y nuevos programas
 * @author Daniel Cornejo Granados
 * @author jose
 * @author roberto
 */

public class Radio {
    private final String name = "radiOop";
    private final String dir = "Tec de cartago";
    private final String webDir = "www.radioop.com";
    private final double frequency = 118.5;
    private static ArrayList<Broadcasters> broadcasters = new ArrayList<Broadcasters>(0);
    private static ArrayList<Program> programs = new ArrayList<Program>(0);


    public static void main(String[] args){

        /*
        * el objeto scanner es el input() de java, cada vez que se define el objeto da espacio a
        * la insercion de datos
        */

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("1. Add new broadcaster");
            System.out.println("2. Get broadcasters");
            System.out.println("S. Exit radio");

            String optionSelect = input.nextLine();

            if(optionSelect.equals("1")){
                Scanner broadcasterInfo = new Scanner(System.in);

                System.out.println("ID: ");
                String id = broadcasterInfo.nextLine();
                System.out.println("Name: ");
                String name = broadcasterInfo.nextLine();
                System.out.println("Direction: ");
                String dir = broadcasterInfo.nextLine();
                System.out.println("BirthDay: ");
                String birthDay = broadcasterInfo.nextLine();

                Broadcasters newBroadcaster = new Broadcasters(id, name, dir, birthDay);

                System.out.println("Email: ");
                while (true) {
                    String email = broadcasterInfo.nextLine();
                    String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                    if(email.matches(regex)){
                        newBroadcaster.setEmail(email);
                        break;
                    }
                    else{
                        System.out.println("El correo debe de tener una estructura valida");
                    }
                }

                System.out.println("Phone: ");
                while (true){
                    String phone = broadcasterInfo.nextLine();
                    if(phone.length() == 8){
                        newBroadcaster.setPhone(phone);
                        break;
                    }
                    else{
                        System.out.println("El numero debe de ser de 8 digitos");
                    }
                }

                System.out.println("Select Sex");
                System.out.println("1. MALE");
                System.out.println("2. FEMALE");
                System.out.println("ANY KEY. UNDEFINED");
                String establishSex = broadcasterInfo.nextLine();
                if(establishSex.equals("1")){
                    newBroadcaster.setSex(Sex.MALE);
                }
                else if (establishSex.equals("2")){
                    newBroadcaster.setSex(Sex.FEMALE);
                }
                else{
                    newBroadcaster.setSex(Sex.UNDEFINED);
                }

                broadcasters.add(newBroadcaster);

            }
            else if (optionSelect.equals("2")){

            }

            else if(optionSelect.equals("2")){

                for (Broadcasters broadcaster: broadcasters) {

                    System.out.println("ID: " + broadcaster.getId());
                    System.out.println("name: " + broadcaster.getName());
                    System.out.println("email: " + broadcaster.getEmail());
                    System.out.println("phone: " + broadcaster.getPhone());
                    System.out.println("sex: " + broadcaster.getSex());
                    System.out.println();

                }
            }
        }
    }
}

package pl.sda.wjatki;
import pl.sda.wjatki.exceptions.EmailException;

import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {
        User user = new User();
        try {
            user.setEmail("hwdpjp.gov");
        }
        catch (EmailException e){
            e.printStackTrace();
        }
        System.out.println("dziala");
    }
}

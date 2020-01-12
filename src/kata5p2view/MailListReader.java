package kata5p2view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5p2model.Mail;

public class MailListReader {
    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            
            while(true){ //esta feo
                String line = reader.readLine();
                if (line == null)
                    break;
                if(Mail.isMail(line))
                    list.add(new Mail(line));
                }
            } catch(FileNotFoundException exception){
                System.out.println("ERROR File Not Found" + exception.getMessage());
            }catch(IOException exception){
                System.out.println("ERROR" + exception.getMessage());
            }
        return list;
    }
}

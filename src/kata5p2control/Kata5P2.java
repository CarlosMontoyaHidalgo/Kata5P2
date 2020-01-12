package kata5p2control;

import java.util.List;
import kata5p2model.Mail;
import kata5p2view.MailHistogramBuilder;
import kata5p2view.MailListReader;
import kata5p2model.Histogram;
import kata5p2view.HistogramDisplay;

public class Kata5P2 {

    public static void main(String[] args) {
        //haremos uso de java swing (contenedores y contenido)
        
        String fileName = new String("C:\\Users\\carlo\\OneDrive\\Documentos\\NetBeansProjects\\Kata5P2\\src\\email.txt.txt");
        /*I*/List<Mail> mailList = MailListReader.read(fileName);
        /*P*/Histogram histogram = MailHistogramBuilder.build(mailList);       
        /*O*/HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        /*O*/histogramdisplay.execute();
    }
    
}

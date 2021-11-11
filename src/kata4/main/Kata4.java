/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author G10
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nameFile = "email.txt";
        // I
        List<Mail> mailList = MailListReader.read(nameFile);
        // P
        Histogram<String> histogram = MailHistogramBuilder.built(mailList);
        
        // Anterior versión
        // HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram");
        // O
        HistogramDisplay hist = new HistogramDisplay(histogram); //.execute();
        hist.execute();
    }
    
}

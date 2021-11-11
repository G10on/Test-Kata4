/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.view;

import kata4.model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G10
 */
public class MailListReader{
    public static List<Mail> read(String nameFile) {
        List<Mail> list = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(nameFile)));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if (Mail.isMail(line)) {
                    list.add(new Mail(line));
                }
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("Error MailHistogramReader::read (FileNotFound)");
        }
        catch(IOException ex) {
            System.out.println("Error MailHistogramReader.read() (Second Error)");
        }
        return list;
    }
}

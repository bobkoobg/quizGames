package iohandling;

import entity.GameName;
import entity.Words;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReadandWriteQuizzes
{

    public ArrayList<Words> load(String filename, GameName name)
    {
        ArrayList<Words> arrayLust = new ArrayList();

        Scanner scanning = null;
        Words words;
        boolean ok = false;

        try
        {
            scanning = new Scanner(new File(filename));
            while (scanning.hasNextLine())
            {
                if (!ok)
                {
                    String gameName = scanning.nextLine();
                    name.setGameName(gameName);
                    //System.out.println("Name: " + gameName);
                    ok = true;
                }
                if (scanning.hasNextLine())
                {
                    Scanner scan = new Scanner(scanning.nextLine());
                    scan.useDelimiter(",");
                    String q = scan.next();
                    String a = scan.next();
                    words = new Words(q, a);
                    arrayLust.add(words);
                    //System.out.println("Reading from file : " + words);
                }
            }
        } catch (FileNotFoundException notfound)
        {
            arrayLust = null;
            JOptionPane.showMessageDialog(null, "THE FILE WAS NOT FOUND! : " + notfound, "Error Message", JOptionPane.WARNING_MESSAGE);
            
        }

        //System.out.println(arrayLust.size());
        return arrayLust;
    }

    public boolean save(String filename, ArrayList<Words> ArrayLust, GameName name)
    {
        boolean bobo = true;
        PrintWriter printwrite;

        try
        {
            printwrite = new PrintWriter(new File(filename));
            printwrite.println(name.getGameName());

            for (int i = 0; i < ArrayLust.size(); i++)
            {
                //System.out.println("Saving to file : " + ArrayLust);
                Words newwords = ArrayLust.get(i);
                printwrite.println(newwords.toString());
                //System.out.println(zapazvaibate);
            }

            printwrite.close();

        } catch (Exception except)
        {

            JOptionPane.showMessageDialog(null, "THE FILE WAS NOT SAVED! : " + except, "Error Message", JOptionPane.WARNING_MESSAGE);

            bobo = false;
        }

        return bobo;
    }
}

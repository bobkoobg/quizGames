/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iohandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;

import entity.GameName;
import javax.swing.JOptionPane;



/**
 *
 * @author Boyko
 */
public class ReadandWriteGameNames
{
    private String gameNames;
    ArrayList<GameName> list;
    
    
    public ReadandWriteGameNames()
    {
        gameNames = "gamenames.txt";
        list = new ArrayList();
    }
    
    public ArrayList<GameName> readFromFile()
    {
        Scanner chetem = null;
        GameName putinside;

        try
        {
            chetem = new Scanner(new File(gameNames));
        } catch (FileNotFoundException notfound)
        {
            JOptionPane.showMessageDialog(null, "THE FILE WAS NOT FOUND! : " + notfound, "Error Message", JOptionPane.WARNING_MESSAGE);
        }
        while (chetem.hasNextLine())
        {
            Scanner scan = new Scanner(chetem.nextLine());

            String name = scan.next();
            
            putinside = new GameName(name);
            list.add(putinside);
            //System.out.println("***READFROMFILE*** " + putinside);
            //System.out.println("Number of games: " + list.size());
        }
        chetem.close();
        return list;
    }
    
    public void SavetoFile(String fileName)
    {
        PrintWriter printwrite;
        try
        {
            printwrite = new PrintWriter(new FileWriter(gameNames, true));
            printwrite.println(fileName);
            printwrite.close();
        } catch (Exception except)
        {
            JOptionPane.showMessageDialog(null, "THE FILE WAS NOT SAVED! : " + except, "Error Message", JOptionPane.WARNING_MESSAGE);
        }
    }
    
        public boolean saveEmptyFile(String gameName)
    {
        boolean saved = false;
        PrintWriter printwrite;
        try
        {
            printwrite = new PrintWriter(new File(gameName));
            gameName = gameName.substring(0, gameName.length()-4);
            printwrite.println(gameName);
            printwrite.close();
        } 
        catch (Exception except)
        {
            JOptionPane.showMessageDialog(null, "THE FILE WAS NOT SAVED! : " + except, "Error Message", JOptionPane.WARNING_MESSAGE);
            saved = false;
        }
        return saved;
    }
}

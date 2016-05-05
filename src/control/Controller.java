package control;

import iohandling.ReadandWriteQuizzes;
import entity.Words;
import entity.Players;
import entity.GameName;
import iohandling.ReadandWriteGameNames;
import interfaces.OurInterface;

import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Controller implements OurInterface
{

    private String file = null;
    private GameName gameName;
    private ReadandWriteQuizzes iOGameNames;
    private ReadandWriteGameNames iOQuizzes;
    private ArrayList<Words> qandAsArrayList;
    private ArrayList<Players> playersArrayList;

    public Controller()
    {
        gameName = new GameName();
        iOGameNames = new ReadandWriteQuizzes();
        iOQuizzes = new ReadandWriteGameNames();
        qandAsArrayList = new ArrayList();
        playersArrayList = new ArrayList();

        //file = "words.txt"; //
    }

    @Override
    public void add(String question, String answer)
    {
        Words newword = new Words(question, answer); //adds new words
        qandAsArrayList.add(newword);
    }

    @Override
    public int size()
    {
        return qandAsArrayList.size(); 
    }

    @Override
    public String getRandomQuestion()
    {
        int QuestionID = 0;
        String ActualQuestion = null;
        try
        {
            Random generate = new Random();
            QuestionID = generate.nextInt(qandAsArrayList.size());
            ActualQuestion = qandAsArrayList.get(QuestionID).getQuestion();
            return ActualQuestion;
        } catch (Exception exept)
        {
            JOptionPane.showMessageDialog(null, "YOU HAVEN'T CHOSE A TOPIC OR YOUR FILE IS EMPTY! : " + exept, "Error Message", JOptionPane.WARNING_MESSAGE);
        }
        return ActualQuestion;
    }

    @Override
    public boolean checkGuess(String question, String guess)
    {
        for (int i = 0; i < qandAsArrayList.size(); i++)
        {
            if (qandAsArrayList.get(i).getQuestion().equals(question))
            {
                if (qandAsArrayList.get(i).getAnswer().equals(guess))
                {
                    return true;
                }
            }
        }
        return false;

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>THE OTHER WAY TO DO IT<<<<<<<<<<<<<<<<<<<<
//        for (Words words : ArrayLust)
//        {
//            if (words.getQuestion().equals(question))
//            {
//                if (words.getAnswer().equals(quess))
//                {
//                    return true;
//                }
//            }
//        }
//        return false;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    }

    @Override
    public String lookup(String question)
    {
        if (!qandAsArrayList.isEmpty())
        {
            for (int i = 0; i < qandAsArrayList.size(); i++)
            {
                if (qandAsArrayList.get(i).getQuestion().equals(question))
                {
                    return qandAsArrayList.get(i).getAnswer();
                }

            }
        }
        return null;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>THE OTHER WAY TO DO IT<<<<<<<<<<<<<<<<<<<<<<<<
//        for (Words word : ArrayLust)
//        {
//            if (word.getQuestion().equals(question))
//            {
//                return word.getAnswer();
//            }
//        }
//        return null;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    }

    @Override
    public boolean load(String filename)
    {
        boolean bobo = true;
        qandAsArrayList = iOGameNames.load(filename, gameName);
        if (qandAsArrayList == null)
        {
            bobo = false;
        }
        return bobo;
    }

    @Override
    public boolean save(String filename)
    {
        return iOGameNames.save(filename, qandAsArrayList, gameName);
    }

    @Override
    public void clear()
    {
        qandAsArrayList.clear();
    }

    @Override
    public String[] getGameNames()
    {
        String[] stringArrayofNames;
        ArrayList<GameName> arrayListofGameNames = iOQuizzes.readFromFile();
        stringArrayofNames = new String[arrayListofGameNames.size()];
        for (int i = 0; i < arrayListofGameNames.size(); i++)
        {
            stringArrayofNames[i] = arrayListofGameNames.get(i).toString();
        }
        return stringArrayofNames;
        //return (String[] )arrayname.toArray(); <<<<<THE EASY ONE :)
    }

    @Override
    public void selectGame(String gameName)
    {
        //WE USE GameName class.
    }

    @Override
    public String getSelectedGameName()
    {
        return gameName.getGameName(); //returns the gamename
    }

    @Override
    public void addGame(String gameName)
    {
        iOQuizzes.SavetoFile(gameName); //adds the game to the file with gamenames
    }

    @Override
    public void createNewFile(String gameName)
    {
        try
        {
            PrintWriter createNewFile;
            createNewFile = new PrintWriter(new FileWriter(gameName));
            iOQuizzes.saveEmptyFile(gameName);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "THE FILE WAS NOT CREATED! : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void createnewPlayers(String name, int points)
    {
        Players createPlayer = new Players(name, points);
        playersArrayList.add(createPlayer);
    }

    @Override
    public boolean countPoints(boolean correcT, int playerID)
    {
        if (correcT)
        {
            playersArrayList.get(playerID).setWinPoints();
            if (playersArrayList.get(playerID).getPoints() == 10)
            {
                return true;
            }
        } else
        {
            playersArrayList.get(playerID).setLosePoints();
        }
        return false;

    }

    @Override
    public int getPlayerPoints(int playerID)
    {
       return playersArrayList.get(playerID).getPoints();
    }

    @Override
    public int getPlayerArraySize()
    {
        return playersArrayList.size();
    }

    @Override
    public String getPlayerName(int playerID)
    {
        return playersArrayList.get(playerID).getPlayerName();
    }

    @Override
    public void clearPeopleScores()
    {
        for (int i = 0; i < playersArrayList.size(); i++)
        {
            playersArrayList.get(i).setPoints(0);
        }
    }
}

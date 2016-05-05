/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Boyko
 */
public class Players
{
    private String playerName;
    private int points;

    public void setPoints(int points)
    {
        this.points = points;
    }

    public Players(String playerName, int points)
    {
        this.playerName = playerName;
        this.points = points;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public int getPoints()
    {
        return points;
    }

    public void setWinPoints()
    {
        points++;
        System.out.println(playerName + " " + points);
    }
    
    public void setLosePoints()
    {
        if(points > 0)
        {
        //points--;
        }
        System.out.println(playerName + " " + points);
    }
    
        @Override
    public String toString()
    {
        return playerName + "," + points;
    }

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Boyko
 */
public class GameName
{
    private String gameName;

    public GameName()
    {
        
    }
    
    public GameName(String importedgameName)
    {
        this.gameName = importedgameName;
    }

    public String getGameName()
    {
        return gameName;
    }

    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }
    
        @Override
    public String toString()
    {
        return gameName;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Boyko
 */
public interface OurInterface extends QuizzControlInterface
{
    void createNewFile(String gameName);
    
    void createnewPlayers(String name, int points);
    
    boolean countPoints(boolean correcT, int playerID);
    
    int getPlayerPoints(int playerID);
    
    int getPlayerArraySize();
    
    String getPlayerName(int playerID);
    
    void clearPeopleScores();
}

package boundary;

import control.Controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Boyko
 */
public class GameGUI extends javax.swing.JFrame
{

    /**
     * Creates new form GameGUI
     */
    private Controller control;
    private String file = null;
    private int playernumber;
    String[] list;
    


    public GameGUI()
    {
        control = new Controller();
        list = control.getGameNames();

        initComponents();

        jLayeredStartingPane.setVisible(true); //We turn on the main Layer, the other stay not visible!
        jLayeredMulti.setVisible(false);
        jLayeredMultiWinner.setVisible(false);
        jLayeredPaneAddtoGame.setVisible(false);
        jLayeredPaneGameChooser.setVisible(false);
        jLayeredPaneGameCreator.setVisible(false);
        jLayeredPaneSingle.setVisible(false);
        jMenuFunctionality.setEnabled(false);
        jTextFieldAnswer.setEditable(false);
        //jLabelgameName.setText(""); //for the stupid users xD
        jLabelgameNameAdd.setText("(no topic)");
        jTextFieldQuestion.setEditable(false);
        jTextFieldAddQuestion.setEditable(false);
        jTextFieldRandomQuestion.setEditable(false);


        DefaultComboBoxModel combomodel = new DefaultComboBoxModel<>(list); //we dinamicly fill the list model with
        jComboBoxAllGames.setModel(combomodel);


        //RESPONSIBLE FOR THE PICTURE IN ALL LAYERS
        try
        {
            jLabelPicture.setIcon(new ImageIcon(ImageIO.read(new File("splash-of-colors.jpg"))));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "IMAGE DOES NOT EXIST : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
            jLabelPicture.setIcon(null);
        }
        try
        {
            jLabelPicture1.setIcon(new ImageIcon(ImageIO.read(new File("splash-of-colors.jpg"))));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "IMAGE DOES NOT EXIST : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
            jLabelPicture.setIcon(null);
        }
        try
        {
            jLabelPicture2.setIcon(new ImageIcon(ImageIO.read(new File("splash-of-colors.jpg"))));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "IMAGE DOES NOT EXIST : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
            jLabelPicture2.setIcon(null);
        }
        try
        {
            jLabelPicture3.setIcon(new ImageIcon(ImageIO.read(new File("splash-of-colors.jpg"))));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "IMAGE DOES NOT EXIST : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
            jLabelPicture3.setIcon(null);
        }
        try
        {
            jLabelPicture4.setIcon(new ImageIcon(ImageIO.read(new File("splash-of-colors.jpg"))));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "IMAGE DOES NOT EXIST : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
            jLabelPicture4.setIcon(null);
        }
        try
        {
            jLabelPicture5.setIcon(new ImageIcon(ImageIO.read(new File("splash-of-colors.jpg"))));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "IMAGE DOES NOT EXIST : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
            jLabelPicture5.setIcon(null);
        }
        try
        {
            jLabelPicture6.setIcon(new ImageIcon(ImageIO.read(new File("splash-of-colors.jpg"))));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "IMAGE DOES NOT EXIST : " + ex, "Error Message", JOptionPane.WARNING_MESSAGE);
            jLabelPicture6.setIcon(null);
        }

    }

    public void loadSelectedQuizz(String quizzName)
    {
        file = quizzName + ".txt"; //takes the chosen filename from GameChooser GUI + txt at the end and loads it (46)

        control.load(file);

        jLabelgameName.setText(control.getSelectedGameName()); //puts the GameName from Controller, which takes it from
        jLabelgameNameAdd.setText(control.getSelectedGameName() + " (" + control.size() + " questions so far)"); //GameName which takes it from QuizzControlInterface

        String me = control.getRandomQuestion(); //randomly generates a new question and put it in jTextField (52)
        jTextFieldQuestion.setText(me);
        jTextFieldQuestion.setEditable(false);
        jTextFieldRandomQuestion.setText(me);
        jTextFieldRandomQuestion.setEditable(false);
        jTextFieldAnswer.setEditable(true);
        jTextFieldAddAnswer.setEditable(true);
        jTextFieldAddQuestion.setEditable(true);


    }

    public boolean isAlpha(String name) //CHECKS IF THE NAME != to LETTERS
    {
        return name.matches("[a-zA-Z]+");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel17 = new javax.swing.JLabel();
        jLayeredPaneSingle = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabelgameName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQuestion = new javax.swing.JTextField();
        jTextFieldAnswer = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jButtonGuess = new javax.swing.JButton();
        jButtonLookUp = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelResult = new javax.swing.JLabel();
        jLabelPicture = new javax.swing.JLabel();
        jLayeredMulti = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        jLabelTopic = new javax.swing.JLabel();
        jButtonStartGame = new javax.swing.JButton();
        jTextFieldRandomQuestion = new javax.swing.JTextField();
        jTextFieldPlayerAnswer = new javax.swing.JTextField();
        jLabelAnswerResult = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelTurn = new javax.swing.JLabel();
        jButtonCheck = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPlayerScore = new javax.swing.JLabel();
        jLabelPlayerScore1 = new javax.swing.JLabel();
        jLabelPicture1 = new javax.swing.JLabel();
        jLayeredMultiWinner = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelPicture2 = new javax.swing.JLabel();
        jLayeredPaneGameChooser = new javax.swing.JLayeredPane();
        jButtonSinglePlayerChoice = new javax.swing.JButton();
        jButtonMultiPlayerChoice = new javax.swing.JButton();
        jComboBoxAllGames = new javax.swing.JComboBox();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabelPicture3 = new javax.swing.JLabel();
        jLayeredPaneGameCreator = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextFieldGameName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jButtonCreate = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jLabelPicture5 = new javax.swing.JLabel();
        jLayeredPaneAddtoGame = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabelgameNameAdd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAddQuestion = new javax.swing.JTextField();
        jTextFieldAddAnswer = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jLabelAddResult = new javax.swing.JLabel();
        jLabelPicture4 = new javax.swing.JLabel();
        jLayeredStartingPane = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelPicture6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFunctionality = new javax.swing.JMenu();
        jMenuItemCreateGame = new javax.swing.JMenuItem();
        jMenuItemChooseGame = new javax.swing.JMenuItem();
        jMenuItemAddtoGame = new javax.swing.JMenuItem();
        jMenuMode = new javax.swing.JMenu();
        jMenuItemSinglePlayer = new javax.swing.JMenuItem();
        jMenuItemMultiPlayer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("The topic is :");
        jLabel5.setBounds(10, 10, 80, 14);
        jLayeredPaneSingle.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelgameName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelgameName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelgameName.setBounds(110, 10, 300, 40);
        jLayeredPaneSingle.add(jLabelgameName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator2.setBounds(14, 60, 410, 10);
        jLayeredPaneSingle.add(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Random Question:");
        jLabel2.setBounds(30, 70, 150, 14);
        jLayeredPaneSingle.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YOUR Answer:");
        jLabel4.setBounds(270, 70, 120, 14);
        jLayeredPaneSingle.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextFieldQuestion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldQuestionActionPerformed(evt);
            }
        });
        jTextFieldQuestion.setBounds(10, 90, 200, 30);
        jLayeredPaneSingle.add(jTextFieldQuestion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextFieldAnswer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldAnswerActionPerformed(evt);
            }
        });
        jTextFieldAnswer.setBounds(240, 90, 180, 30);
        jLayeredPaneSingle.add(jTextFieldAnswer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonNext.setText("Next Question...");
        jButtonNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonNextActionPerformed(evt);
            }
        });
        jButtonNext.setBounds(10, 130, 200, 30);
        jLayeredPaneSingle.add(jButtonNext, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonGuess.setText("Guess");
        jButtonGuess.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGuessActionPerformed(evt);
            }
        });
        jButtonGuess.setBounds(240, 130, 70, 30);
        jLayeredPaneSingle.add(jButtonGuess, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonLookUp.setText("LookUp");
        jButtonLookUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonLookUpActionPerformed(evt);
            }
        });
        jButtonLookUp.setBounds(340, 130, 80, 30);
        jLayeredPaneSingle.add(jButtonLookUp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator3.setBounds(14, 200, 400, 10);
        jLayeredPaneSingle.add(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelResult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResult.setBounds(10, 170, 410, 20);
        jLayeredPaneSingle.add(jLabelResult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelPicture.setBounds(0, 0, 690, 490);
        jLayeredPaneSingle.add(jLabelPicture, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("The topic is:");
        jLabel12.setBounds(10, 60, 70, 14);
        jLayeredMulti.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelTopic.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTopic.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTopic.setBounds(80, 60, 154, 31);
        jLayeredMulti.add(jLabelTopic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonStartGame.setText("StartGame");
        jButtonStartGame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonStartGameActionPerformed(evt);
            }
        });
        jButtonStartGame.setBounds(300, 60, 100, 30);
        jLayeredMulti.add(jButtonStartGame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextFieldRandomQuestion.setBounds(110, 120, 154, 30);
        jLayeredMulti.add(jTextFieldRandomQuestion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextFieldPlayerAnswer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldPlayerAnswerActionPerformed(evt);
            }
        });
        jTextFieldPlayerAnswer.setBounds(110, 170, 154, 30);
        jLayeredMulti.add(jTextFieldPlayerAnswer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelAnswerResult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAnswerResult.setBounds(110, 100, 154, 20);
        jLayeredMulti.add(jLabelAnswerResult, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("The Question:");
        jLabel13.setBounds(10, 120, 100, 20);
        jLayeredMulti.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelTurn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTurn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTurn.setBounds(10, 170, 100, 20);
        jLayeredMulti.add(jLabelTurn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonCheck.setText("Check");
        jButtonCheck.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckActionPerformed(evt);
            }
        });
        jButtonCheck.setBounds(280, 170, 70, 30);
        jLayeredMulti.add(jButtonCheck, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(30, 210, 320, 11);
        jLayeredMulti.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelPlayerScore.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlayerScore.setBounds(30, 220, 154, 18);
        jLayeredMulti.add(jLabelPlayerScore, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelPlayerScore1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlayerScore1.setBounds(30, 250, 154, 18);
        jLayeredMulti.add(jLabelPlayerScore1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelPicture1.setBounds(0, 0, 670, 490);
        jLayeredMulti.add(jLabelPicture1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setBounds(20, 30, 370, 50);
        jLayeredMultiWinner.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Enjoy the northern light :)");
        jLabel15.setBounds(20, 184, 170, 30);
        jLayeredMultiWinner.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Restart");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(330, 10, 69, 23);
        jLayeredMultiWinner.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelPicture2.setBounds(0, 0, 690, 490);
        jLayeredMultiWinner.add(jLabelPicture2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonSinglePlayerChoice.setText("SinglePlayer");
        jButtonSinglePlayerChoice.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSinglePlayerChoiceActionPerformed(evt);
            }
        });
        jButtonSinglePlayerChoice.setBounds(20, 210, 100, 30);
        jLayeredPaneGameChooser.add(jButtonSinglePlayerChoice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonMultiPlayerChoice.setText("MultiPlayer");
        jButtonMultiPlayerChoice.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonMultiPlayerChoiceActionPerformed(evt);
            }
        });
        jButtonMultiPlayerChoice.setBounds(120, 210, 100, 30);
        jLayeredPaneGameChooser.add(jButtonMultiPlayerChoice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBoxAllGames.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxAllGamesActionPerformed(evt);
            }
        });
        jComboBoxAllGames.setBounds(20, 40, 110, 30);
        jLayeredPaneGameChooser.add(jComboBoxAllGames, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator8.setBounds(20, 250, 200, 10);
        jLayeredPaneGameChooser.add(jSeparator8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Choose Game");
        jLabel11.setBounds(20, 20, 100, 14);
        jLayeredPaneGameChooser.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelPicture3.setBounds(0, 0, 690, 490);
        jLayeredPaneGameChooser.add(jLabelPicture3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add new game:");
        jLabel8.setBounds(10, 4, 110, 20);
        jLayeredPaneGameCreator.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator5.setBounds(0, 30, 300, 10);
        jLayeredPaneGameCreator.add(jSeparator5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextFieldGameName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldGameNameActionPerformed(evt);
            }
        });
        jTextFieldGameName.setBounds(146, 50, 150, 30);
        jLayeredPaneGameCreator.add(jTextFieldGameName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name:");
        jLabel9.setBounds(110, 50, 40, 20);
        jLayeredPaneGameCreator.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator7.setBounds(0, 120, 300, 10);
        jLayeredPaneGameCreator.add(jSeparator7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCreateActionPerformed(evt);
            }
        });
        jButtonCreate.setBounds(215, 130, 80, 30);
        jLayeredPaneGameCreator.add(jButtonCreate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 255, 255));
        jLabelError.setBounds(10, 94, 420, 20);
        jLayeredPaneGameCreator.add(jLabelError, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelPicture5.setBounds(0, 0, 690, 490);
        jLayeredPaneGameCreator.add(jLabelPicture5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add to :");
        jLabel1.setBounds(10, 20, 50, 20);
        jLayeredPaneAddtoGame.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelgameNameAdd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelgameNameAdd.setText("Topic");
        jLabelgameNameAdd.setBounds(60, 20, 309, 20);
        jLayeredPaneAddtoGame.add(jLabelgameNameAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose a Question :");
        jLabel3.setBounds(40, 40, 120, 30);
        jLayeredPaneAddtoGame.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Choose an answer");
        jLabel7.setBounds(270, 50, 120, 20);
        jLayeredPaneAddtoGame.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextFieldAddQuestion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldAddQuestionActionPerformed(evt);
            }
        });
        jTextFieldAddQuestion.setBounds(10, 70, 200, 30);
        jLayeredPaneAddtoGame.add(jTextFieldAddQuestion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextFieldAddAnswer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldAddAnswerActionPerformed(evt);
            }
        });
        jTextFieldAddAnswer.setBounds(250, 70, 170, 30);
        jLayeredPaneAddtoGame.add(jTextFieldAddAnswer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonAddActionPerformed(evt);
            }
        });
        jButtonAdd.setBounds(250, 110, 60, 30);
        jLayeredPaneAddtoGame.add(jButtonAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSaveActionPerformed(evt);
            }
        });
        jButtonSave.setBounds(350, 110, 70, 30);
        jLayeredPaneAddtoGame.add(jButtonSave, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("...then...");
        jLabel6.setBounds(310, 120, 60, 20);
        jLayeredPaneAddtoGame.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonClearActionPerformed(evt);
            }
        });
        jButtonClear.setBounds(10, 110, 80, 30);
        jLayeredPaneAddtoGame.add(jButtonClear, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelAddResult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddResult.setBounds(10, 160, 404, 20);
        jLayeredPaneAddtoGame.add(jLabelAddResult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelPicture4.setBounds(0, 0, 690, 490);
        jLayeredPaneAddtoGame.add(jLabelPicture4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome to our game.");
        jLabel10.setBounds(30, 120, 420, 110);
        jLayeredStartingPane.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Play QuizzGames either vs Computer or vs Player");
        jLabel16.setBounds(20, 290, 290, 30);
        jLayeredStartingPane.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Test your knowledge , create new games");
        jLabel18.setBounds(60, 320, 330, 14);
        jLayeredStartingPane.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("add new questions, choose other games");
        jLabel19.setBounds(120, 340, 300, 14);
        jLayeredStartingPane.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("or have fun with your friends and beat them 1v1");
        jLabel20.setBounds(170, 360, 320, 14);
        jLayeredStartingPane.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("GOOD LUCK!");
        jLabel21.setBounds(70, 400, 90, 17);
        jLayeredStartingPane.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelPicture6.setBounds(0, 0, 680, 490);
        jLayeredStartingPane.add(jLabelPicture6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuFunctionality.setText("Functionality");

        jMenuItemCreateGame.setText("Create Game");
        jMenuItemCreateGame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemCreateGameActionPerformed(evt);
            }
        });
        jMenuFunctionality.add(jMenuItemCreateGame);

        jMenuItemChooseGame.setText("Choose Game");
        jMenuItemChooseGame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemChooseGameActionPerformed(evt);
            }
        });
        jMenuFunctionality.add(jMenuItemChooseGame);

        jMenuItemAddtoGame.setText("Add to Game");
        jMenuItemAddtoGame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemAddtoGameActionPerformed(evt);
            }
        });
        jMenuFunctionality.add(jMenuItemAddtoGame);

        jMenuBar1.add(jMenuFunctionality);

        jMenuMode.setText("Mode");

        jMenuItemSinglePlayer.setText("Single Player");
        jMenuItemSinglePlayer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemSinglePlayerActionPerformed(evt);
            }
        });
        jMenuMode.add(jMenuItemSinglePlayer);

        jMenuItemMultiPlayer.setText("Multi Player");
        jMenuItemMultiPlayer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItemMultiPlayerActionPerformed(evt);
            }
        });
        jMenuMode.add(jMenuItemMultiPlayer);

        jMenuBar1.add(jMenuMode);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPaneAddtoGame, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jLayeredPaneGameCreator, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredMultiWinner, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredMulti, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPaneGameChooser, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addComponent(jLayeredStartingPane)
            .addComponent(jLayeredPaneSingle)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPaneSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredMultiWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPaneGameCreator, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPaneGameChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPaneAddtoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredStartingPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredStartingPane.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(676, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuestionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldQuestionActionPerformed
    {//GEN-HEADEREND:event_jTextFieldQuestionActionPerformed
    }//GEN-LAST:event_jTextFieldQuestionActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonNextActionPerformed
    {//GEN-HEADEREND:event_jButtonNextActionPerformed
        String me = control.getRandomQuestion(); //Clears all and generates new one!
        jTextFieldQuestion.setText("");
        jTextFieldQuestion.setText(me);
        jTextFieldAnswer.setText("");
        jLabelResult.setText("");
        //System.out.println("RandomNext Button Clicked. Answer and Result fields cleared!");
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jTextFieldAnswerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldAnswerActionPerformed
    {//GEN-HEADEREND:event_jTextFieldAnswerActionPerformed
    }//GEN-LAST:event_jTextFieldAnswerActionPerformed

    private void jButtonGuessActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonGuessActionPerformed
    {//GEN-HEADEREND:event_jButtonGuessActionPerformed
        if (control.checkGuess(jTextFieldQuestion.getText(), jTextFieldAnswer.getText()))
        {   //checks if the question and the answer are correct
            jLabelResult.setText("CORRECT");
        } else
        {
            jLabelResult.setText("WRONG");
        }
    }//GEN-LAST:event_jButtonGuessActionPerformed

    private void jButtonLookUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonLookUpActionPerformed
    {//GEN-HEADEREND:event_jButtonLookUpActionPerformed
        String question = jTextFieldQuestion.getText();//.toString();
        String show = control.lookup(question); //looks up the correct answer correspoding to the particular question
        jTextFieldAnswer.setText(show);
        jLabelResult.setText("LOOKED UP!");
    }//GEN-LAST:event_jButtonLookUpActionPerformed

    private void jMenuItemCreateGameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemCreateGameActionPerformed
    {//GEN-HEADEREND:event_jMenuItemCreateGameActionPerformed
        jLayeredPaneGameCreator.setVisible(true);
        jLayeredMulti.setVisible(false);
        jLayeredMultiWinner.setVisible(false);
        jLayeredPaneSingle.setVisible(false);
        jMenuMode.setEnabled(false);
        jMenuFunctionality.setEnabled(false);
    }//GEN-LAST:event_jMenuItemCreateGameActionPerformed

    private void jTextFieldAddQuestionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldAddQuestionActionPerformed
    {//GEN-HEADEREND:event_jTextFieldAddQuestionActionPerformed
    }//GEN-LAST:event_jTextFieldAddQuestionActionPerformed

    private void jTextFieldAddAnswerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldAddAnswerActionPerformed
    {//GEN-HEADEREND:event_jTextFieldAddAnswerActionPerformed
    }//GEN-LAST:event_jTextFieldAddAnswerActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonClearActionPerformed
    {//GEN-HEADEREND:event_jButtonClearActionPerformed
        control.clear(); //clears... illogical, but ok! 
        jLabelAddResult.setText("WARNING, If you click SAVE you will DELETE all VALUES!");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSaveActionPerformed
    {//GEN-HEADEREND:event_jButtonSaveActionPerformed
        if (!jTextFieldAddQuestion.getText().isEmpty() || !jTextFieldAddAnswer.getText().isEmpty())
        {
            control.save(file); //saves 

            jLabelAddResult.setText("SAVED TO FILE");
            jTextFieldAddAnswer.setText("");
            jTextFieldAddQuestion.setText("");
        } else
        {
            jLabelAddResult.setText("Mistake : Empty Fields!");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAddActionPerformed
    {//GEN-HEADEREND:event_jButtonAddActionPerformed
        String question = jTextFieldAddQuestion.getText().toString();
        String answer = jTextFieldAddAnswer.getText().toString();
        String show = control.lookup(question);
        //jTextFieldAddAnswer.setText(show);

        if (control.lookup(question) != null || control.lookup(answer) != null)
        {
            jLabelAddResult.setText("The values are already imported.");
        } else if (question.isEmpty() || answer.isEmpty())
        {
            jLabelAddResult.setText("The field(s) are empty.");
        } else if (question.equals(answer))
        {
            jLabelAddResult.setText("The fields are exactly the same.");
        } else
        {
            control.add(question, answer); //adds to the arraylist with many else if statements
            System.out.println("We added: " + question + " and " + answer);
            jLabelAddResult.setText("ADDED! (now click SAVE)");
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonStartGameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonStartGameActionPerformed
    {//GEN-HEADEREND:event_jButtonStartGameActionPerformed
        jLabelTopic.setText(file);
        if (file == null)
        {
            jLabelTopic.setText("");
        }
        if (jLabelTopic.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Select a game!", "Error Message", JOptionPane.WARNING_MESSAGE);
        } else
        {
            try
            {
                int playerNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of players"));

                if (playerNumber < 2)
                {
                    JOptionPane.showMessageDialog(null, "Not enough players", "Welcome to the game", JOptionPane.ERROR_MESSAGE);
                } else if (playerNumber > 5)
                {
                    JOptionPane.showMessageDialog(null, "Too much players", "Welcome to the game", JOptionPane.ERROR_MESSAGE);
                } else
                {
                    for (int i = 0; i < playerNumber; i++)
                    {
                        control.createnewPlayers(JOptionPane.showInputDialog("Enter name of player " + (i + 1)), 0);
                    }
                    jTextFieldRandomQuestion.setText(control.getRandomQuestion());
                    jButtonStartGame.setEnabled(false);
                    jButtonCheck.setVisible(true);
                    jTextFieldPlayerAnswer.setVisible(true);
                    jTextFieldRandomQuestion.setVisible(true);
                    jButtonStartGame.setEnabled(true);
                    jLabel1.setVisible(true);
                    jLabelTurn.setText(control.getPlayerName(playernumber) + "'s turn.");
                    jTextFieldPlayerAnswer.setEnabled(true);
                    jButtonCheck.setEnabled(true);
                }
            } catch (java.lang.NumberFormatException exept)
            {
                JOptionPane.showMessageDialog(null, "TYPE IN INTEGER : " + exept, "Error Message", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButtonStartGameActionPerformed

    private void jTextFieldPlayerAnswerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldPlayerAnswerActionPerformed
    {//GEN-HEADEREND:event_jTextFieldPlayerAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlayerAnswerActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckActionPerformed
        jLabelPlayerScore1.setText(jLabelPlayerScore.getText());

        if (jTextFieldPlayerAnswer.getText().equals("HACKER"))
        {
            jLayeredMultiWinner.setVisible(true);
            jLayeredMulti.setVisible(false);
            jLabel14.setText("HACKER WINS");
        }
        if (jTextFieldPlayerAnswer.getText().isEmpty())
        {
            jLabelAnswerResult.setText("Empty field");
        }

        if (control.checkGuess(jTextFieldRandomQuestion.getText(), jTextFieldPlayerAnswer.getText()))
        {
            jLabelAnswerResult.setText("Correct");
            if (control.countPoints(true, playernumber))
            {
                jLayeredMultiWinner.setVisible(true);
                jLayeredMulti.setVisible(false);
                jLabel14.setText(control.getPlayerName(playernumber) + " wins the game");
            }
        } else
        {
            jLabelAnswerResult.setText("Wrong");
            control.countPoints(false, playernumber);
        }
        jTextFieldRandomQuestion.setText(control.getRandomQuestion());
        jLabelPlayerScore.setText(control.getPlayerName(playernumber) + " has " + control.getPlayerPoints(playernumber) + "pts.");
        if (playernumber == control.getPlayerArraySize() - 1)
        {
            playernumber = 0;
        } else
        {
            playernumber++;
        }
        String name = control.getPlayerName(playernumber);
        jLabelTurn.setText(name + "'s turn:");
        jTextFieldPlayerAnswer.setText("");
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        control.clearPeopleScores();
        jLabelPlayerScore.setText(control.getPlayerName(0));
        jLabelPlayerScore1.setText(control.getPlayerName(1));
        playernumber = 0;
        jLayeredMultiWinner.setVisible(false);
        jLayeredMulti.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemSinglePlayerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemSinglePlayerActionPerformed
    {//GEN-HEADEREND:event_jMenuItemSinglePlayerActionPerformed
        if (jLayeredPaneSingle.isVisible())
        {
            JOptionPane.showMessageDialog(null, "You are in the Single Player menu.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jLayeredStartingPane.isVisible())
        {
            jLayeredPaneSingle.setVisible(true);
            jLayeredStartingPane.setVisible(false);
            jMenuFunctionality.setEnabled(true);
            jButtonGuess.setEnabled(false);
            jButtonLookUp.setEnabled(false);
            jButtonNext.setEnabled(false);
        } else if (jLayeredMulti.isVisible())
        {
            jLayeredPaneSingle.setVisible(true);
            jLayeredMulti.setVisible(false);
            jMenuItemCreateGame.setEnabled(true);
            jMenuItemAddtoGame.setEnabled(true);
        } else if (jLayeredPaneAddtoGame.isVisible())
        {
            jLayeredPaneSingle.setVisible(true);
            jLayeredPaneAddtoGame.setVisible(false);
            jMenuFunctionality.setEnabled(true);
            jMenuItemMultiPlayer.setEnabled(true);
        } else if (!jLayeredPaneSingle.isVisible())
        {
            jLayeredMulti.setVisible(true);
            jLayeredStartingPane.setVisible(false);
        }

    }//GEN-LAST:event_jMenuItemSinglePlayerActionPerformed

    private void jMenuItemMultiPlayerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemMultiPlayerActionPerformed
    {//GEN-HEADEREND:event_jMenuItemMultiPlayerActionPerformed
        if (jLayeredMulti.isVisible())
        {
            JOptionPane.showMessageDialog(null, "You are in the Multi Player menu.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jLayeredStartingPane.isVisible())
        {
            jLayeredStartingPane.setVisible(false);
            jLayeredMulti.setVisible(true);
            jMenuFunctionality.setEnabled(true);
            jMenuItemAddtoGame.setEnabled(false);
            jMenuItemCreateGame.setEnabled(false);
            jTextFieldPlayerAnswer.setEnabled(false);
            jButtonCheck.setEnabled(false);
        } else if (!jLayeredMulti.isVisible())
        {
            jLayeredPaneSingle.setVisible(false);
            jLayeredMulti.setVisible(true);
            jMenuItemAddtoGame.setEnabled(false);
            jMenuItemCreateGame.setEnabled(false);
            jTextFieldPlayerAnswer.setEnabled(false);
            jButtonCheck.setEnabled(false);
        }
    }//GEN-LAST:event_jMenuItemMultiPlayerActionPerformed

    private void jTextFieldGameNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldGameNameActionPerformed
    {//GEN-HEADEREND:event_jTextFieldGameNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGameNameActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCreateActionPerformed
    {//GEN-HEADEREND:event_jButtonCreateActionPerformed
        if (isAlpha(jTextFieldGameName.getText()))
        {
            control.addGame(jTextFieldGameName.getText());
            control.createNewFile(jTextFieldGameName.getText() + ".txt");

            JOptionPane.showConfirmDialog(null, "Good job, you created '" + jTextFieldGameName.getText() + ".txt'.");
            jLayeredPaneGameCreator.setVisible(false);
            jLayeredStartingPane.setVisible(true);
            jMenuMode.setEnabled(true);
            jMenuFunctionality.setEnabled(false);
        } else
        {
            jLabelError.setText("You should use characters only from the English alphabet! (A-Z,a-z)");
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonSinglePlayerChoiceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSinglePlayerChoiceActionPerformed
    {//GEN-HEADEREND:event_jButtonSinglePlayerChoiceActionPerformed
        String selectedQuizz = (String) jComboBoxAllGames.getSelectedItem();
        control.clear();
        loadSelectedQuizz(selectedQuizz);
        jLayeredPaneSingle.setVisible(true);
        jLayeredPaneGameChooser.setVisible(false);
        JOptionPane.showMessageDialog(null, "You chose the topic '" + selectedQuizz + "' Good Luck!");
        jMenuFunctionality.setEnabled(true);
        jMenuMode.setEnabled(true);
        jButtonGuess.setEnabled(true);
        jButtonLookUp.setEnabled(true);
        jButtonNext.setEnabled(true);
        jTextFieldAnswer.setEnabled(true);
    }//GEN-LAST:event_jButtonSinglePlayerChoiceActionPerformed

    private void jButtonMultiPlayerChoiceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonMultiPlayerChoiceActionPerformed
    {//GEN-HEADEREND:event_jButtonMultiPlayerChoiceActionPerformed
        String selectedQuizz = (String) jComboBoxAllGames.getSelectedItem();
        control.clear();
        loadSelectedQuizz(selectedQuizz);
        jLayeredMulti.setVisible(true);
        jLayeredPaneGameChooser.setVisible(false);
        JOptionPane.showMessageDialog(null, "You chose the topic '" + selectedQuizz + "' Good Luck!");
        jMenuFunctionality.setEnabled(true);
        jMenuMode.setEnabled(true);

        jTextFieldAnswer.setEnabled(true);

    }//GEN-LAST:event_jButtonMultiPlayerChoiceActionPerformed

    private void jComboBoxAllGamesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxAllGamesActionPerformed
    {//GEN-HEADEREND:event_jComboBoxAllGamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAllGamesActionPerformed

    private void jMenuItemChooseGameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemChooseGameActionPerformed
    {//GEN-HEADEREND:event_jMenuItemChooseGameActionPerformed
        if (jLayeredPaneSingle.isVisible())
        {
            jLayeredPaneSingle.setVisible(false);
            jLayeredPaneGameChooser.setVisible(true);
            jButtonSinglePlayerChoice.setVisible(true);
            jButtonMultiPlayerChoice.setVisible(false);
            jMenuFunctionality.setEnabled(false);
            jMenuMode.setEnabled(false);

        }
        if (jLayeredMulti.isVisible())
        {
            jLayeredMulti.setVisible(false);
            jLayeredPaneGameChooser.setVisible(true);
            jButtonMultiPlayerChoice.setVisible(true);
            jButtonSinglePlayerChoice.setVisible(false);
            jMenuFunctionality.setEnabled(false);
            jMenuMode.setEnabled(false);
        }

    }//GEN-LAST:event_jMenuItemChooseGameActionPerformed

    private void jMenuItemAddtoGameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemAddtoGameActionPerformed
    {//GEN-HEADEREND:event_jMenuItemAddtoGameActionPerformed
        if (file != null)
        {
            jLayeredPaneAddtoGame.setVisible(true);
            jLayeredMulti.setVisible(false);
            jLayeredPaneSingle.setVisible(false);
            jLayeredMultiWinner.setVisible(false);
            jLayeredPaneGameChooser.setVisible(false);
            jLayeredPaneGameCreator.setVisible(false);
            jMenuFunctionality.setEnabled(false);
            jMenuItemMultiPlayer.setEnabled(false);
        } else
        {
            JOptionPane.showMessageDialog(null, "You do not have a topic to add pairs.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemAddtoGameActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GameGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonGuess;
    private javax.swing.JButton jButtonLookUp;
    private javax.swing.JButton jButtonMultiPlayerChoice;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSinglePlayerChoice;
    private javax.swing.JButton jButtonStartGame;
    private javax.swing.JComboBox jComboBoxAllGames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddResult;
    private javax.swing.JLabel jLabelAnswerResult;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPicture1;
    private javax.swing.JLabel jLabelPicture2;
    private javax.swing.JLabel jLabelPicture3;
    private javax.swing.JLabel jLabelPicture4;
    private javax.swing.JLabel jLabelPicture5;
    private javax.swing.JLabel jLabelPicture6;
    private javax.swing.JLabel jLabelPlayerScore;
    private javax.swing.JLabel jLabelPlayerScore1;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelTopic;
    private javax.swing.JLabel jLabelTurn;
    private javax.swing.JLabel jLabelgameName;
    private javax.swing.JLabel jLabelgameNameAdd;
    private javax.swing.JLayeredPane jLayeredMulti;
    private javax.swing.JLayeredPane jLayeredMultiWinner;
    private javax.swing.JLayeredPane jLayeredPaneAddtoGame;
    private javax.swing.JLayeredPane jLayeredPaneGameChooser;
    private javax.swing.JLayeredPane jLayeredPaneGameCreator;
    private javax.swing.JLayeredPane jLayeredPaneSingle;
    private javax.swing.JLayeredPane jLayeredStartingPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFunctionality;
    private javax.swing.JMenuItem jMenuItemAddtoGame;
    private javax.swing.JMenuItem jMenuItemChooseGame;
    private javax.swing.JMenuItem jMenuItemCreateGame;
    private javax.swing.JMenuItem jMenuItemMultiPlayer;
    private javax.swing.JMenuItem jMenuItemSinglePlayer;
    private javax.swing.JMenu jMenuMode;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextFieldAddAnswer;
    private javax.swing.JTextField jTextFieldAddQuestion;
    private javax.swing.JTextField jTextFieldAnswer;
    private javax.swing.JTextField jTextFieldGameName;
    private javax.swing.JTextField jTextFieldPlayerAnswer;
    private javax.swing.JTextField jTextFieldQuestion;
    private javax.swing.JTextField jTextFieldRandomQuestion;
    // End of variables declaration//GEN-END:variables
}

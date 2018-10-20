
package checkers;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Board extends JFrame
{
   private JPanel[][] Tiles = new JPanel[8][8] ; 
   private JPanel test = new JPanel() ; 
   private JPanel test2 = new JPanel() ; 
   private JPanel Data = new JPanel() ;
   private JLabel p1 = new JLabel("PLAYER 1") ;
   private JLabel p2 = new JLabel("PLAYER 2") ; 
   
    
    public Board() 
    {
        init() ; 
    }
    
    public void init()
    {
        Container c = getContentPane();  
        setLayout(null);
//       Tiles[0][0].setBackground(Color.red);
//       Tiles[0][1].setBackground(Color.WHITE);
//        test.setBackground(Color.red);
//        test2.setBackground(Color.WHITE);
        
         c.add(test) ;
         c.add(test2) ; 
        
        for (int i = 0; i <8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                Tiles[i][j] = new JPanel();

 
                Tiles[i][j].setBounds(j * 80, i * 80, 80, 80);
                Tiles[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                Tiles[i][j].setBackground(Color.WHITE);
                c.add(Tiles[i][j]) ; 
                
            }
             
        }
        for (int i = 0, j = 1; j < 8; i += 2){
             Tiles[j][i].setBackground(Color.BLACK);
            //Tiles[j][i].setColor(B);
            if ((i + 2) % 8 == 0){
                j += 2;
                i = -2;
            }
        }
         for (int i = 1, j = 0; j < 8; i += 2){
            Tiles[j][i].setBackground(Color.BLACK);
            
            if ((i + 1) % 8 == 0){
                j += 2;
                i = -1;
            }
        }
        c.add(Data) ; 
        Data.add(p1) ; 
        Data.add(p2) ;
        Data.setLayout(new GridLayout());
        //Data.setBackground(Color.red);
        Data.setBounds(900, 100, 1100, 500);
        setSize(1100,1100);
        setTitle("Checkers"); 
        setLocation(150,0);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}

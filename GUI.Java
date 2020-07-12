
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.plaf.metal.*; 
import javax.swing.text.*; 
import java.awt.event.*; 


public class GUI extends JFrame implements ActionListener  {

    private static final int width = 960;
    private static final int height = 540;

    private JFrame frame;
    private JTextArea text;
    // private JMenuBar menu;


    public GUI() {
        
        frame = new JFrame("AP");
        try { 
            // Set metl look and feel 
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 
  
            // Set theme to ocean 
            MetalLookAndFeel.setCurrentTheme(new OceanTheme()); 
        } 
        catch (Exception e) {
            System.out.println("Cant load metallookdandfeel");
        }

        JMenuBar mb = new JMenuBar();
        JMenu menu1 = new JMenu("File");

        JMenuItem mi1 = new JMenuItem("New"); 
        JMenuItem mi2 = new JMenuItem("Open"); 
        JMenuItem mi3 = new JMenuItem("Save"); 
        JMenuItem mi9 = new JMenuItem("Print"); 
  
        // Add action listener 



        public void actionPerformed(ActionEvent e) { 
 
        } 

    }



    
}
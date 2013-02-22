/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingex;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import org.w3c.dom.css.Rect;

/**
 *
 * @author ngschmidt
 */
public class SwingEx {

    JFrame frame;
    
    SwingEx() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                initComponents();
            }
        });
        initComponents();
    }
    
    public void initComponents() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PISS");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        
        GridBagLayout bag = new GridBagLayout();
        GridBagConstraints cnstr = new GridBagConstraints();
        cnstr.fill = GridBagConstraints.BOTH;
        
        JPanel pan = new JPanel();        
        pan.setLayout(bag);
        
        cnstr.gridx = 0;
        cnstr.gridy = 1;
        cnstr.gridheight = 1;
        cnstr.gridwidth = 1;
        JTextArea txtShowTXT = new JTextArea();
        String TXTDATA="THIS IS TEXT IN THA BOX \n\n\n\nAND THIS TOO\n";
        txtShowTXT.setText(TXTDATA);
        txtShowTXT.setMinimumSize(new Dimension(200,400));
        bag.setConstraints(txtShowTXT, cnstr);
        pan.add(txtShowTXT);
        txtShowTXT.append("THIS IS MOAR TEXT");
        
        
        cnstr.gridx=1;
        cnstr.gridy=1;
        JButton buttsecks = new JButton();
        buttsecks.setName("BUTTSECKS");
        bag.setConstraints(buttsecks, cnstr);
        pan.add(buttsecks);


        frame.add(pan);
        frame.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingEx gui = new SwingEx();
    }
}

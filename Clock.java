import javax.swing.*;
import javax.awt.*;
import java.awt.event.*;
import java.util.calendar.*;

public class Clock extends JFrame
{
    private static final long serialversion= 1L; 
    // components
    JTextField timeF;
    JPanel panel;

    public Clock()
    {
        super("Java Clock by RKM");
        setSize(225,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setLocationrelative(null);
        //initialize the panel 
        panel = new JPanel(new FlowLayout());

        timeF = new JTextField(10);
        timeF.setEditable(false);
        timeF.setFont(new Font("Arial",Font.PLAIN,48));

        panel.add(timeF);
        add(panel);
        Timer  t = new Timer(1000,new Listener());
        t.start();
    }
    class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Calendar rightNow = Calendar.getInstance();

            int hour = rightNow.get(Calendar.HOUR_OF_DAY);
            int minute = rightNow.get(Calendar.MINUTE);
            int sec = rightNow.get(Calendar.SECOND);
            timeF.setText(hour+":"+minute+":"+sec);
            
        }

    }

}
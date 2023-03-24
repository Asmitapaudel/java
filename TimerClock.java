import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class TimerClock extends JFrame implements ActionListener {
  private JLabel l;
  
  public TimerClock() {
    super("Clock using Timer");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(200, 100);
    l = new JLabel();
    getContentPane().add(l, BorderLayout.CENTER);
    Timer t = new Timer(1000, this); // the delay is 1000 millisecond
    t.start();
  }

  public void actionPerformed(ActionEvent ae) {
    l.setText((new Date()).toString());
  }

  public static void main(String args[]) {
    TimerClock ct = new TimerClock();
    ct.setVisible(true);
  }
}

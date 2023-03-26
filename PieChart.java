import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class PieChart extends JFrame {
    public static void main(String[] args) {
        new PieChart();
    }
    
    public PieChart() {
        super("Pie Chart");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        int[] values = {25, 35, 20, 10, 10};
        Color[] colors = {Color.red, Color.green, Color.blue, Color.yellow, Color.orange};
        int startAngle = 0;
        int arcAngle = 0;
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            g.setColor(colors[i]);
            arcAngle = (int) Math.round((values[i] * 360.0) / total);
            g.fillArc(100, 100, 200, 200, startAngle, arcAngle);
            startAngle += arcAngle;
        }
    }
} 

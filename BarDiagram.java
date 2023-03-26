import java.awt.*;

public class BarDiagram extends Frame {
    int[] data = { 20, 30, 50, 10, 40 }; // data for the bar diagram
String[] labels = { "Label 1", "Label 2", "Label 3", "Label 4", "Label 5" };
    public BarDiagram() {
        setTitle("Bar Diagram Example");
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
      // int margin = 50;
        int width = getWidth()- 100;
        int height = getHeight() - 100;
        int barWidth = width / data.length; // width of each bar

        // find the maximum value in the data array
        int maxValue = data[0];
        // System.out.println(maxValue)/\;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maxValue) {
                maxValue = data[i];
            }
        }

        // draw the bars
        for (int i = 0; i < data.length; i++) {
            int barHeight = (int) (((double) data[i] / (double) maxValue) * (height-10));
            int x = i * barWidth;
            int y = height - barHeight;
              g.setColor(Color.BLUE);

            g.fillRect(x, y, barWidth, barHeight);
              g.setColor(Color.BLACK);
            g.drawRect(x, y, barWidth, barHeight);

            // g.drawString(labels[i], x + (barWidth / 2) - (g.getFontMetrics().stringWidth(labels[i]) / 2), y - 5);
            g.drawString(labels[i], x, height);


        }
    }

    public static void main(String[] args) {
      
        new BarDiagram();
    }
}
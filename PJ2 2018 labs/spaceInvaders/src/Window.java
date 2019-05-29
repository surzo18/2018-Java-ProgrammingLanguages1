import java.awt.*;
import javax.swing.*;
public class Window {
  private int width;
  private int height;
  Window(int width, int height){
    this.height=height;
    this.width=width;

  }
  public void createWindow() {

    JFrame frame = new JFrame("Space Invaders by Edie");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel textLabel = new JLabel("Some shits there",SwingConstants.CENTER);
    textLabel.setPreferredSize(new Dimension(this.width, this.height));
    frame.getContentPane().add(textLabel, BorderLayout.CENTER);

    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
  }

}

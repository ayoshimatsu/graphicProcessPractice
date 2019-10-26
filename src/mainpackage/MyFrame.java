package mainpackage;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

   public MyFrame(String title, int width, int height) {
      super(title);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(width,height);
      setLocationRelativeTo(null);
      setResizable(false);
      this.add(new DrawCanvas());
   }

   public class DrawCanvas extends JPanel{
      @Override
      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawLine(0,0,200,200);
      }
   }
}
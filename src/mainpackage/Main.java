package mainpackage;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {

      PropertyParameter property = new PropertyParameter("property/display.properties");
      int windowWidth = property.getWindowWidth();
      int windowHeight = property.getWindowHeight();

      JFrame frame = new MyFrame("Test", windowWidth, windowHeight);
      frame.setVisible(true);
   }
}
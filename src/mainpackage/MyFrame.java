package mainpackage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame{

   PropertyParameter property = new PropertyParameter("property/display.properties");

   public MyFrame(String title) {
      super(title);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      int windowWidth = property.getWindowWidth();
      int windowHeight = property.getWindowHeight();
      setSize(windowWidth,windowHeight);
      setLocationRelativeTo(null);
      setResizable(false);

      setMessagePanel(property.getMessage());

   }

   public void setMessagePanel(String message){
      MessagePanel panel = new MessagePanel(message);
      getContentPane().add(panel, BorderLayout.CENTER);
   }


   public class MessagePanel extends JPanel{
      public MessagePanel(String message) {
         this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

         JLabel messageLabel = new JLabel();
         messageLabel.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
         messageLabel.setFont(new Font("Arial", Font.BOLD, 50));
         messageLabel.setForeground(Color.RED);
         messageLabel.setOpaque(true);
         messageLabel.setBackground(Color.YELLOW);
         messageLabel.setText(message);
         this.add(messageLabel);
      }
   }
}
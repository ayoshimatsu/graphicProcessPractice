package mainpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyParameter {
   String oWindowWidth;
   String oWindowHeight;
   String oMessage;

   public PropertyParameter(String aPropertyPass) {
      Properties properties = new Properties();
      String propertyPass = aPropertyPass;
      try {
         InputStream propertyStream = new FileInputStream(propertyPass);
         properties.load(propertyStream);
         oWindowWidth = properties.getProperty("windowWidth");
         oWindowHeight = properties.getProperty("windowHeight");
         oMessage = properties.getProperty("Message");
      } catch (IOException e) {
         System.out.println("Error : Fail to read property file.");
         e.printStackTrace();
      }
   }

   public int getWindowHeight(){
      int height = Integer.parseInt(oWindowHeight);
      return height;
   }
   public int getWindowWidth(){
      int width = Integer.parseInt(oWindowWidth);
      return width;
   }
   public String getMessage() {
      return oMessage;
   }
}
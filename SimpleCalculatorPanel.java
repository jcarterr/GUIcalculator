import java.awt.*;
import javax.swing.*;
class SimpleCalculatorPanel extends JPanel { 
   public InputOutputPanel ioPanel = new InputOutputPanel(this); 
   public ButtonsPanel btnPanel = new ButtonsPanel(this); 
   public SimpleCalculatorPanel () {
      setLayout(new BorderLayout());
      setBackground(Color.lightGray);
      add(ioPanel, BorderLayout.CENTER); 
      add(btnPanel, BorderLayout.SOUTH); 
   }			
}
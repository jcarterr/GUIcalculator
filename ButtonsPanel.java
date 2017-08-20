import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonsPanel extends JPanel { 
   private Evaluateable binaryOpr;
   private SimpleCalculatorPanel scPanel;
   private JButton addBtn = new JButton("Add");
   private JButton subtractBtn = new JButton("Subtract");
   
   public ButtonsPanel (SimpleCalculatorPanel scPanel) {
      this.scPanel = scPanel;	
      setLayout(new FlowLayout(FlowLayout.CENTER));
      addBtn.setToolTipText("Add the two operands.");
      subtractBtn.setToolTipText("Subtract the two operands.");
      add(addBtn); 
      add(subtractBtn);
      addBtn.addActionListener(new ActionListener(){ 
	 public void actionPerformed(ActionEvent e){ 
	    setResultLbl("Sum");
            binaryOpr = new Sum(); 
            btnBinaryOprAction();}});
      subtractBtn.addActionListener(new ActionListener(){
	 public void actionPerformed(ActionEvent e){ 
	    setResultLbl("Difference");
	    binaryOpr = new Subtract(); 
            btnBinaryOprAction();}});
   }	
   public void setResultLbl(String label) {
      scPanel.ioPanel.setResultLbl(label);
   }		
   public void btnBinaryOprAction() {
      int leftOperand = scPanel.ioPanel.getLeftOprTxt();
      int rightOperand = scPanel.ioPanel.getRightOprTxt();
      scPanel.ioPanel.setResultTxt( 
         binaryOpr.evaluate(leftOperand, rightOperand));
   }
}

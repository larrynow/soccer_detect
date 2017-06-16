package utils.picSelect;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PicSelect {
	
	 public static void main(String[] args) {  
	        
		 /*JFrame f = new JFrame("ImageShow");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setSize(300, 200);
	        ImageIcon image= new ImageIcon("C:/timg.jpg") ;
	        
	        Button buttonSelect1 = new Button("Select1");
	        Button buttonSelect2 = new Button("Select2");
	        
	        f.add(new JLabel(image));
	        f.add(buttonSelect1,"South");
	        f.add(buttonSelect2,"South");
	        
	        
	        f.setVisible(true);*/
		 
		 MainFrame mainFrame = new MainFrame("Main");
	     mainFrame.setVisible(true);
		 
	    }  	  

}

class MainFrame extends Frame{
	 
	 private static final long serialVersionUID = 1L;
	 Panel picPanel;
	 Panel selectButtonPanel;//A button panel(FlowLayout);
	 
	 private void generatePicPanel(){
		 
		 ImageIcon image= new ImageIcon("C:/timg.jpg") ;
		 picPanel = new Panel();
		 picPanel.add(new JLabel(image));
	 }
	 
	 private void generateSelectButtonPanel(){
		 
		 selectButtonPanel = new Panel();
		 selectButtonPanel.setLayout(new FlowLayout());
		 
		 Button choice1 = new Button("choice1");
		 Button choice2 = new Button("choice2");
		 selectButtonPanel.add(choice1);
		 selectButtonPanel.add(choice2);
	 }
	 
	 public MainFrame(String frameName){
		 
		 super("frameName");
		 
		 //Set MainFrame with BorderLayout
		 setLayout(new BorderLayout());
	      
		 //Set PicPanel
		 generatePicPanel();
		 add(picPanel,BorderLayout.CENTER);
		 
		 //Set selectButtonPanel
		 generateSelectButtonPanel();
		 add(selectButtonPanel,BorderLayout.SOUTH);
		 
		 setSize(800, 800);
		 setLocation(100,100);
		 
	 }
}
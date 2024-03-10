package sudoku;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class MainFrame extends JFrame{
	MainFrame() {

	this.setTitle("Sudoku"); //Title
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setSize(420, 420); //set x and y dimension of the frame
	this.setVisible(true);
	
	ImageIcon image = new ImageIcon("logo.jpg"); //create an ImageIcon
	
	this.setIconImage(image.getImage()); //change icon of frame
	}
}

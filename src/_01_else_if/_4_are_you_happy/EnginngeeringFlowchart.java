package _01_else_if._4_are_you_happy;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EnginngeeringFlowchart {
	public static void main(String[] args) {
	
	
	String flowChart = JOptionPane.showInputDialog("does your enginneering project move?");
	
	if (flowChart.equals("yes")) {
		String doesIt = JOptionPane.showInputDialog("should it?");
		if (doesIt.equals("yes")) {
			JOptionPane.showMessageDialog(null,"good");
		}
		else if (doesIt.equals("no")) {
			JOptionPane.showMessageDialog(null,"", "use wd40", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/_01_else_if/_4_are_you_happy/ducktape.png"));
		}
	}
	else if (flowChart.equals("no")) {
		String doesIt = JOptionPane.showInputDialog("should it?");
		if (doesIt.equals("yes")) {
			JOptionPane.showMessageDialog(null,"", "use wd40", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/_01_else_if/_4_are_you_happy/wd40.png"));
		}
		else if (doesIt.equals("no")) {
			JOptionPane.showMessageDialog(null,"good");
		}
	}
	
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
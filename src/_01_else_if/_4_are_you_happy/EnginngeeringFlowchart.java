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
			JOptionPane.showMessageDialog(null,"insertImage- ducktape");
		}
	}
	else if (flowChart.equals("no")) {
		String doesIt = JOptionPane.showInputDialog("should it?");
		if (doesIt.equals("yes")) {
			JOptionPane.showMessageDialog(null,"insertImage- wd40", "", 0, new ImageIcon("/Level0-Module3/src/_01_else_if/_4_are_you_happy/Screen Shot 2026-09-19 at 11.15.55 AM.png"));
		}
		else if (doesIt.equals("no")) {
			JOptionPane.showMessageDialog(null,"good");
		}
	}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
package _01_else_if._5_own_adventure;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"You just completed a dangerous mission in the middle of the jungle. You are being hunted\n" + 
			"by the jungle people. you have 3 days worth of food and water, a machete, a rope, and a pistol with one magazine.");
		
		
		String adventure = JOptionPane.showInputDialog("There are two paths to get to the escape helicopter. Both are about 100 miles because the helicopter cant be in foreign territory."
				+ "\nwhich path do you take? path one, or path two?"
				+ "\n path 1- 1, path 2- 2");
			
			if (adventure.equals("1")) {
			String path1 = JOptionPane.showInputDialog(null,"you have chosen path 1. "
					+ "\n you begin your journey with haste, knowing that the jungle people are trailing right behind you."
					+ "\n it is getting dark, the dangerous nocternal animals are coming out. they may hurt you or alert the jungle people of where you are."
					+ "\n there is a low chance of running into them, but if your not carefull they can get you. "
					+ "\n food/water condition = good"
					+ "\n health = 100%"
					+ "\n"
					+ "\n keep going- 1, rest- 2");
		
		
			if (path1.equals("1")) {
				String keepGoing = JOptionPane.showInputDialog(null,"you have chosen to keep going."
						+ "\n  you are getting tired but still moving, since you are tired your awareness and speed are lowering "
						+ "\n up ahead you see a black panther very vividly. you are unsure if it can see you or not."
						+ "\n shooting it will alert the jungle people where you are, and will also waste ammo if you miss."
						+ "\n getting away would work better if you are able to, but it may be hard if the panther has already seen you"
						+ " ");
				
				
				
				
					}
				}
			

	
	
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}

package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String testscore = JOptionPane.showInputDialog(null, "What was your test score?");
	double number = Double.parseDouble(testscore);
	if (number>=90) {
		JOptionPane.showMessageDialog(null, "Wow you must have studied really hard, nice job!");
	}else if(number>100) {
		JOptionPane.showMessageDialog(null, "You're lying, there was no extra credit on the test!");
	}else if(number>75) {
		JOptionPane.showMessageDialog(null, "Not bad, you could do better though");
	}else {
		JOptionPane.showMessageDialog(null,"That's awful, study more!");
	}
	
	
}
}

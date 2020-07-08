package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend = false;
		// Write code to ask the user what day it is.
        String weekend = JOptionPane.showInputDialog(null, "What day is it?");
        if (weekend.equals("saturday")||(weekend.equals("sunday"))) {
        	isWeekend = true;
        }
		// Set the boolean isWeekend based on the value they enter
if (isWeekend) {
	JOptionPane.showMessageDialog(null, "Sleep in for the day!");
}else {
	JOptionPane.showMessageDialog(null,"Get up and go to school!!");
}
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam=false;
		// Write code to ask the user what percentage they scored in their last exam
String percentage = JOptionPane.showInputDialog(null, "What was your score on the last test");
double score = Double.parseDouble(percentage);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if (score>70) {
			passedExam = true;
		}
		// If the user passed the exam, congratulate them
		if (passedExam) {
			JOptionPane.showMessageDialog(null,"Congrats, you did well!");
		}else {
			JOptionPane.showMessageDialog(null, "Better Luck Next Time!!!");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "Game is Over");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed=false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog(null, "What color should I draw with?");
		if (color.equals("red")) {
			isRed=true;
		}
		boolean isSquare=false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog(null, "What shape should I draw?");
		if(shape.equals("square")) {
			isSquare=true;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		if (isRed&&isSquare) {
			drawRedSquare();
		}else {
			JOptionPane.showMessageDialog(null,"I don't know how to draw that shape.");
		}
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(255, 0, 0);
		for (int i = 0; i < 4; i++) {
			rob.move(200);
			rob.turn(90);
		}
	}	
}

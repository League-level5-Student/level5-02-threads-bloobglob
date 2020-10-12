package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot();
		blue.penUp();
		blue.moveTo(200, 200);
		blue.hide();
		blue.penDown();
		blue.setPenColor(Color.blue);
		blue.setPenWidth(5);
		Robot black = new Robot();
		black.penUp();
		black.moveTo(350, 200);
		black.hide();
		black.penDown();
		black.setPenColor(Color.black);
		black.setPenWidth(5);
		Robot red = new Robot();
		red.penUp();
		red.moveTo(500, 200);
		red.hide();
		red.penDown();
		red.setPenColor(Color.red);
		red.setPenWidth(5);
		Robot yellow = new Robot();
		yellow.penUp();
		yellow.moveTo(275, 275);
		yellow.hide();
		yellow.penDown();
		yellow.setPenColor(Color.yellow);
		yellow.setPenWidth(5);
		Robot green = new Robot();
		green.penUp();
		green.moveTo(425, 275);
		green.hide();
		green.penDown();
		green.setPenColor(Color.green);
		green.setPenWidth(5);
		Thread r1 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				blue.move(1);
				blue.turn(1);
			}
		});
		Thread r2 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				black.move(1);
				black.turn(1);
			}
		});
		Thread r3 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				red.move(1);
				red.turn(1);
			}
		});
		Thread r4 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				yellow.move(1);
				yellow.turn(1);
			}
		});
		Thread r5 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				green.move(1);
				green.turn(1);
			}
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}


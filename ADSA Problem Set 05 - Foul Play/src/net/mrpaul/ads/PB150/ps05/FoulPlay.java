package net.mrpaul.ads.PB150.ps05;

import images.APImage;			//Note: We need to import from the images package!
import images.Pixel;			//Note: We need to import from the images package!

import java.awt.Color;
import java.awt.Image;
import java.util.Scanner;

/**            
* Experiments with Pixels
*<p> FoulPlay experiments with one image and changes the pixel values
*APCS PS150: Foul Play
*9/23/17
*
*@author Natenael Kelkay
*/
public class FoulPlay {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* 
		 * The reason we can call topicExercses() like this without an object
		 * or a class name is that it is a static method in the same class as the method call.
		 * If we wanted to call topicExercises() from a different class, we'd have to write
		 * FoulPlay.topicExercises();
		 */
		topicExercises();			


	}//end of main
	/**
	 * 
	 */
	public static void topicExercises(){
		//instantiate a new APImage object
		
		APImage dog = new APImage("doge.png");
		APImage newDog = dog.clone();
		//Use a Scanner object (and its nextLine() method) to trigger your APImage's draw() method
		Scanner input = new Scanner(System.in);
		dog.draw();
	    //Print the width and the height of your APImage object in pixels in the form, "W: # px\tH: # px"
		int width = dog.getWidth();
		int height = dog.getHeight();
		System.out.println("W: " + width + "\nH: " + height);
		//Print the R, G, and B values of the Pixel object at (10, 17)
		Pixel colors = dog.getPixel(10,17);
		System.out.println("Pixel at (10, 17):\tR: " + colors.getRed() + "\tG: " + colors.getGreen() + "\tB: " + colors.getBlue());
		//Iterate through each pixel in the image using a regular for loop; print R, G, and B in
		//the form: "Pixel at (<x>, <y>):\tR: #\tG: #\tB: #"
		//example: Pixel at (42, 53):	R: 10	G: 65	B: 157
		//Note that the console output is limited, so if you print enough stuff, the earlier stuff you printed disappears.
		System.out.println("Press enter to continue");
		input.nextLine();
		for ( int y = 0; y < dog.getHeight(); y++){
			for(int x = 0; x < dog.getWidth(); x++){
				Pixel pixel = dog.getPixel(x, y);
				int r = pixel.getRed();
				int b = pixel.getBlue();
				int g = pixel.getGreen();
				System.out.println("Pixel at" + "(" + x + "," + y + ")" + ":	R:" +  r + " G:" +  g + " B:" + b);
			}
		}
		
		System.out.println("Press enter to continue. Echanced for loop");
		input.nextLine();
		
		//Rewrite your code from the last exercise so it uses an enhanced for loop.  You may omit the indices.
		for (Pixel p: dog){
			int r = p.getRed();
			int b = p.getBlue();
			int g = p.getGreen();
			
			System.out.println("R:" +  r + " G:" +  g + " B:" + b);
			/*
			int average = (r + b + g) / 3;
			
			 p.setRed(average);
			 p.setBlue(average);
			 p.setGreen(average);
			*/
			
			//System.out.println("Pixel:\tR:" + r + "\tG:" + g + "\tB:" + b);
		}
		
		System.out.println("Press Enter to continue. Black and white stipes");
		input.nextLine();
		//Set every Pixel in each even column to white and every odd column to black.
		for ( int y = 0; y < dog.getHeight(); y++){
			for(int x = 0; x < dog.getWidth(); x+=2){
				Pixel pixel = dog.getPixel(x, y);
				
				pixel.setBlue(255);
				pixel.setGreen(255);
				pixel.setRed(255);
			}
		}
		dog.draw();
		
		for ( int y = 0; y < dog.getHeight(); y++){
			for(int x = 1; x < dog.getWidth(); x+=2){
				Pixel pixel = dog.getPixel(x, y);
				
				pixel.setBlue(0);
				pixel.setGreen(0);
				pixel.setRed(0);
			}
		}
		dog.draw();
		
		System.out.println("Press Enter to continue. Increased Brightness");
		input.nextLine();
		//Adjust the brightness: multiply each Pixel's values by a constant and constrain values to 255
		
		for ( int y = 0; y < newDog.getHeight(); y++){
			for(int x = 0; x < newDog.getWidth(); x++){
				Pixel pixel = newDog.getPixel(x, y);
				int red = pixel.getRed() * 2;
				int blue = pixel.getBlue() * 2;
				int green = pixel.getGreen() * 2;
				
				if (red > 255){
					pixel.setRed(255);
				} else
				{
					pixel.setRed(red);
				}
				if(blue > 255){
					pixel.setBlue(255);
				}
				else
				{
					pixel.setBlue(blue);
				}
				if(green > 255){
					pixel.setGreen(255);
				}else
				{
					pixel.setGreen(green);
				}
				
			}
		}
		newDog.draw();
		
		System.out.println("Save the image? y/n");
		if(input.nextLine().equalsIgnoreCase("y")){
			newDog.saveAs();
		}
		
	}//end of topicExercises
	

}//end of class FoulPlay
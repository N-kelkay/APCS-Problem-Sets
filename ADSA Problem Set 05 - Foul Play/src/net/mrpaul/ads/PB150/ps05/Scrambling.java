package net.mrpaul.ads.PB150.ps05;

import images.APImage;			//Note: We need to import from the images package!
import images.Pixel;			//Note: We need to import from the images package!
import java.util.Scanner;

/**            
* Unscrambles, and Scrambles
*<p>The Scrambling program goes through each pixel of the image and scrambles/unscrambles the image
*APCS PS150: Foul Play
*9/23/17
*
*@author Natenael Kelkay
*/
public class Scrambling {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		unscramble("scrambled");
		scramble("unScrambled");

	}//end of main



	/**
	 * Unscrambles an image puzzle for ps05: Foul play.
	 * @author 
	 * @param fileName a String holding the file name of a .png file in the current working directory.  Example: "scrambled_image.png"
	 * Creates an APImage object out of the file called fileName
	 * <p>Renders the scrambled APImage
	 * <p>Goes through each Pixel in that APImage object and mutes Green and Blue
	 * <p>Pixel values while amplifying red values by a factor of 5.
	 * <p>Then renders the unscrambled (i.e. modified) APImage object
	 * <p>Then prompts the user to save the unscrambled image.
	 * <p>Assumes: valid filename ending in .png that exists in the directory
	 */
	public static void unscramble(String fileName){
		Scanner input = new Scanner(System.in);
		APImage scrambled = new APImage("asecretmessage_encoded.png");
		APImage unScrambled = scrambled.clone();
		scrambled.draw();
		System.out.println("Press enter to unscramble the image");
		input.nextLine();
		
		for(int x = 0; x< unScrambled.getWidth();x++){
			for(int i = 0; i < unScrambled.getHeight();i++){
				unScrambled.getPixel(x, i).setBlue(0);
				unScrambled.getPixel(x, i).setGreen(0);
				unScrambled.getPixel(x, i).setRed(unScrambled.getPixel(x, i).getRed()*5);
			}
		}
		
		unScrambled.draw();
	
		System.out.println("Hit enter to display decrypted image.");
		input.nextLine();
		scrambled.draw();

		System.out.println("Save decoded image? y/n");
		if(input.nextLine().equalsIgnoreCase("y")){
			unScrambled.saveAs();
		}


	}//end of unscramble




	/**
	 * Scrambles an image for ps05.
	 * @author 
	 * @param fileName a String holding the file name of a .png file
	 * Creates an APImage object out of the file called fileName
	 * <p>Renders the regular APImage
	 * <p>Goes through each Pixel in that APImage object and randomizes the Green and Blue
	 * <p>Pixel values while diminishing red values by a factor of 10.
	 * <p>Then renders the scrambled (i.e. modified) APImage object
	 * <p>Then prompts the user to save the unscrambled image.
	 * <p>Assumes: valid filename ending in .png that exists in the directory
	 */
	public static void scramble(String fileName){
		Scanner input = new Scanner(System.in);
		APImage unScrambled = new APImage("asecretmessage.png");
		unScrambled.draw();
		
		System.out.println("Press enter to scramble the messsage");
		input.nextLine();
		
		//Scrambling code:
		
		for (int y = 0; y < unScrambled.getHeight(); y++){
			for (int x = 0; x < unScrambled.getWidth(); x++){
				
				int random = (int)(Math.random() * 255 + 1);
				
				unScrambled.getPixel(x, y).setRed(unScrambled.getPixel(x, y).getRed() / 5);
				unScrambled.getPixel(x, y).setBlue(random);
				unScrambled.getPixel(x, y).setGreen(random);
				
			}
		}
		unScrambled.draw();

		System.out.println("Save decoded image? y/n");
		if(input.nextLine().equalsIgnoreCase("y")){
			unScrambled.saveAs();
		}
	}//end of scramble

}
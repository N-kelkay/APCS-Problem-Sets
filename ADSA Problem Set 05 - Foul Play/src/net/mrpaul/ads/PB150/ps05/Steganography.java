package net.mrpaul.ads.PB150.ps05;

import images.APImage;			//Note: We need to import from the images package!
import images.Pixel;			//Note: We need to import from the images package!

import java.io.File;
import java.util.Scanner;

/**        
*Changes The RGB values     
*<p>The Steganography program works a variety of images
*and changes their pixel values to get the desired output.</p>
*APCS PS150: Foul Play
*9/23/17
*
*@author Natenael Kelkay
*/
public class Steganography {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Stegnography Program, please follow the instuctions give in the console to go through the program");
		
		
		//example calls:

		/* generate black and white
		 * manually save the file you create in this method as original_message_bw.png
		 * make sure you save it in your project working directory
		 */


			generateBW("Nate.png");



		/*
		 * shave destination
		 * manually save the file you create in this method as original_destination_shaven.png
		 */
			shaveImage("Nate2");


		/*
		 * encode your black and white message into your shaven destination
		 * save the encoded image as destination_encoded.png
		 */

			encode("original_message_bw.png", "original_destination_shaven.png");

		/*
		 * decode your encoded image
		 */
			decode("encoded.png");


	}//end of main


	/**
	 * 
	 * @param fileName
	 */
	public static void decode(String fileName){
		Scanner input = new Scanner(System.in);
		APImage flower = new APImage("encoded.png");
		flower.draw();
		for (int y = 0; y < flower.getHeight(); y++){
			for (int x = 0; x < flower.getWidth(); x++){
				Pixel pixel = flower.getPixel(x, y);

				int r = pixel.getRed();
				if (Integer.toString(r).charAt(Integer.toString(r).length()-1) == '1'){
					pixel.setRed(0);
					pixel.setBlue(0);
					pixel.setGreen(0);
				}else if(Integer.toString(r).charAt(Integer.toString(r).length()-1) == '0'){
					pixel.setRed(255);
					pixel.setGreen(255);
					pixel.setBlue(255);
				}else
				{

				}
			}
		}
		System.out.println("Hit return to render decoded file: ");
		input.nextLine();
		flower.draw();

		System.out.println("Save decoded image? y/n");
		if(input.nextLine().equalsIgnoreCase("y")){
			flower.saveAs();
		}


		System.out.println("Finished!!!");

	}//end of decode

	/**
	 * 
	 * @param fileName
	 */
	public static void generateBW(String fileName){
		APImage nate = new APImage("Nate2.png");

		Scanner input = new Scanner(System.in);
		nate.draw();
		System.out.println("Hit enter to turn the image to black and white :");
		input.nextLine();

		for(int y = 0; y < nate.getHeight(); y++){
			for(int x = 0; x < nate.getWidth(); x++){
				Pixel pixel = nate.getPixel(x, y);

				int r  = pixel.getRed();
				int g = pixel.getGreen();
				int b = pixel.getBlue();

				int avrg = (r + g + b)/3;

				if (avrg > 127){
					pixel.setBlue(255);
					pixel.setGreen(255);
					pixel.setRed(255);
				} else {
					pixel.setRed(0);
					pixel.setGreen(0);
					pixel.setBlue(0);
				}
			}
		}
		nate.draw();
		System.out.println("Enter y to save the image: ");
		if(input.nextLine().equalsIgnoreCase("y")){
			nate.saveAs();
		}

		System.out.println("Press enter to continue TO the 'Shave Image' Method");
		input.nextLine();

	}//end of generateBW

	/**
	 * 
	 * @param fileName
	 */


	public static void shaveImage(String fileName){
		APImage nate = new APImage("Nate2.png");
		Scanner input = new Scanner(System.in);

		nate.draw();
		System.out.println("Press enter to shave image");
		input.nextLine();

		for(int y = 0; y < nate.getHeight(); y++){
			for (int x =0; x < nate.getWidth(); x++){
				nate.getPixel(x, y).setRed(nate.getPixel(x, y).getRed()/10*10);;
			}
		}

		nate.draw();

		System.out.println("Enter y to save the image: ");
		if(input.nextLine().equalsIgnoreCase("y")){
			nate.saveAs();
		}

		System.out.println("Press enter to continue TO the 'encode' Method");
		input.nextLine();

	}//end of shaveImage

	/**
	 * 
	 * @param fileName
	 * @param string 
	 */
	public static void encode(String messageFileName, String destinationFileName){
		Scanner input = new Scanner(System.in);
		APImage nateBW = new APImage("original_message_bw.png");
		APImage nateSh = new APImage("original_destination_shaven2.png");
		nateSh.draw();

		System.out.println("Begin coding?");
		input.nextLine();

		for(int y = 0; y < nateSh.getHeight(); y++){
			for(int x = 0; x < nateSh.getWidth(); x++){
				Pixel pixel = nateSh.getPixel(x, y);

				if ((pixel.equals(new Pixel(0,0,0)))){
					pixel.setRed(pixel.getRed() +1);
				}else
				{

				}
			}

		}

		nateSh.draw();
		System.out.println("Enter y to save the image: ");
		if(input.nextLine().equalsIgnoreCase("y")){
			nateSh.saveAs();
		}

		System.out.println("Press enter to continue TO the 'decode' Method");
		input.nextLine();
	}//end of encode
}//end of class Steganography
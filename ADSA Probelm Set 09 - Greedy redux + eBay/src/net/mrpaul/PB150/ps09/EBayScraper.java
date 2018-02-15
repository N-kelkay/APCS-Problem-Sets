package net.mrpaul.PB150.ps09;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
*Finds information about the websites passed in a txt file
*
*<p> Goes through the txt file with a scanner and successfully access the source page <p>
*
*APCS PS150: Greedy redux + eBay
*Friday 2, 2018
*
*@author Natenael Kelkay
*/
public class EBayScraper {
	public static void main(String[] args) throws IOException {
		
		/*
		 * The first thing you'll want to do is get your file input going.  
		 * You can use either a BufferedReader (which we used inGeneExplorer) 
		 * or a Scanner (which we used in VerifyCreditCards).  
		 * First make sure you can read each URL as a String and at least print each one out.
		 */
		
		int count = 0;
		
		
		File file = new File("ebay_urls.txt");
 		Scanner input = new Scanner(file);
		
		
 		String url1 = "https://www.ebay.com/itm/Vintage-Chrome-Barber-Manual-Hand-Hair-Clippers-Trimmers-000-Sta-Shape-Shears-/132022904118?hash=item1ebd2da536";
		String url2 = "https://www.ebay.com/itm/Bressant-Manual-Hand-Hair-Clipper-Trimmer-Pet-Grooming-000-Blade/281574228175?_trkparms=aid%3D555018%26algo%3DPL.SIM%26ao%3D2%26asc%3D47300%26meid%3Dd4c2a15d5091441b85c603f22f10e07a%26pid%3D100623%26rk%3D1%26rkt%3D6%26mehot%3Dag%26sd%3D132022904118%26itm%3D281574228175&_trksid=p2047675.c100623.m-1";
		String url3 = "https://www.ebay.com/itm/Bressant-Manual-Hand-Hair-Clipper-Trimmer-Pet-Grooming-000-Blade/281574228175?hash=item418f21c0cf:g:IM0AAMXQXZZReqq~";
 		URL url = new URL(url1);
		
		input = new Scanner(new InputStreamReader(url.openStream()));
		
		while(input.hasNext()) {
			System.out.println(input.nextLine());
		}
		
	}
}

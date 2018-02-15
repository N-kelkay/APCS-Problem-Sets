package net.mrpaul.ads.csid.ps07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;


/**            
* Pig Latin
*<p>Converts English words to pig Latin
*APCS PS150: Pig Latin
*
*@author Natenael Kelkay
*/

public class PigLatin {
	//startOfFirstConsonantCluster

	/*
	 * - Treat y as a consonant if it is the first letter of the word OR if it 
	 * has a vowel on either side of it.
	 * - Treat y as a vowel if it is immediately preceded AND followed by a consonant.
	 */
	public static int startOfFirstConsonantCluster(String word){
		String lowWord = word.toLowerCase();
		int consonantIndex = -1;

		for (int i = 0; i <= lowWord.length() -1; i++){
			char letter = lowWord.charAt(i);
			if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u' && Character.isLetter(letter) ) {
				if (word.charAt(i) == 'y') {
					if (word.charAt(0) == 'y'){
						consonantIndex = i;
						i = word.length() + 1;
					} else if(word.charAt(i + 1) == 'a' || word.charAt(i + 1) == 'e' || word.charAt(i + 1) == 'i' || word.charAt(i + 1) == 'o' || word.charAt(i + 1) == 'u'){
						consonantIndex = i;
						i = word.length() + 1;
					} else if (word.charAt(i - 1) == 'a' || word.charAt(i - 1) == 'e' || word.charAt(i - 1) == 'i' || word.charAt(i - 1) == 'o' || word.charAt(i - 1) == 'u'){
						consonantIndex = i;
						i = word.length() + 1;
					} else
					{
						// No code needed
					}
				}else
				{
					consonantIndex = i;
					i = word.length() + 1;
				}
			}
		}
		return consonantIndex;
	}

	//endOfFirstConsonantCluster
	public static int endOfFirstConsonantCluster(String word){
		int firstC = startOfFirstConsonantCluster(word);

		int turn2 = firstC;
		for(int x = firstC + 1; x < word.length() ; x++) {
			if(isV(word.charAt(x))) {
				return (turn2 == firstC || firstC == -1)? firstC: turn2;
			} else if ((word.charAt(x) == 'y')) {
				if (x - 1 >= 0 || x + 1 <= word.length()) {
					//Code: Got in if before character is greater than 0 and if index +1 if less than word.Length

					if(isV(word.charAt(x + 1)) || isV(word.charAt(x -1))) {
						// y is a consonant  
						turn2 +=1;
					} else {
						// y is a vowel 
						return (turn2 == firstC || firstC == -1)? firstC: turn2;
					}
				}
			}
			else {
				turn2 +=1;
			}
		}

		return (turn2 == firstC || firstC == -1)? firstC: turn2;
	}

	//wordToPigLatin
	
	//This code is only one not working others should be fine
	public static String wordToPigLatin(String word){
		word = word.trim();
		word = word.toLowerCase();


		if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){

			return word + "way";

		} else if(!Character.isLetter(word.charAt(0))){
			return word;
		}else
		{
			String trimedFirstPart  = word.substring(0, endOfFirstConsonantCluster(word) );
			System.out.println(trimedFirstPart);
			String trimedLastPart = word.substring(endOfFirstConsonantCluster(word), word.length());
			System.out.println(trimedLastPart);
			return trimedLastPart + trimedFirstPart + "ay";		
		}

	}
	public static boolean isV(char z) {
		
		return z != 'a' && z != 'e' && z != 'i' && z != 'o' && z != 'u' && Character.isLetter(z);
	}


	public static int findStartOfEndingPuncSeq(String word) {

		if (!Character.isLetter(word.charAt(word.length() - 1)) && !Character.isDigit(word.charAt(word.length() - 1))) {
			for(int i = word.length() -2; i >= 0; i --) {
				if(!Character.isLetter(word.charAt(i)) && !Character.isDigit(word.charAt(i))) {

				}else {
					return i + 1;
				}
			}
		}
		return -1;
	}	
	public static int findEndOfStartingPuncSeq(String word) {
		if(!Character.isLetter(word.charAt(0)) && !Character.isDigit(word.charAt(0))){
			for( int i = 1; i < word.length(); i++) {
				if(!Character.isLetter(word.charAt(i)) && !Character.isDigit(word.charAt(i))) {

				}else {
					return i-1 ;
				}
			}
		}
		return -1;
	}
	public static void fileToPigLatin(String fileName) throws FileNotFoundException, UnsupportedEncodingException{
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		Formatter formatter = new Formatter(fileName.substring(0,fileName.length()-5)+ "_PL.txt");
		
		
		while( input.hasNext()) {
			String word = input.next();
			int start = (findEndOfStartingPuncSeq(word) == -1)? 0: findEndOfStartingPuncSeq(word);
			int end = (findStartOfEndingPuncSeq(word) == -1)? word.length() - 1: findStartOfEndingPuncSeq(word);
			word = wordToPigLatin(word.substring(start , end));
			formatter.format("%s", word + " ");
		}
		

	}
}
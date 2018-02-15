package net.mrpaul.ads.csid.ps07;

public class VoterFileRecovery {
	//an int called n and two Strings called sub and line
	public static int nthInstance(int n, String sub, String line) {
	// find the nth instance of the string sub in the larger string line.  It returns an int value that is the index of that item in the string, or -1 if it does not appear n times.
		for(int i = 0; i <= line.length(); i++) {
			if(line.charAt(i) == sub.charAt(0)) {
				if(line.charAt(i + 1) == sub.charAt(1)) {
					return i;
				} else {
					return i;
				}
			}
		}
		
		return -1;
		
	}
	

}

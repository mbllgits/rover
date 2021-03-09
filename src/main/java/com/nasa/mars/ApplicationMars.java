package com.nasa.mars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ApplicationMars {

	public static void main(String[] args) throws Exception {
		String input = args[0];
		File file = new File(input);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// first line of input
		String linePlateau;
		if ((linePlateau = br.readLine()) != null) {
			try {
			Plateau plateau = new Plateau();
			
			String first = linePlateau;
			plateau.setPlateau(first);
			String lineOne;
			while ((lineOne = br.readLine()) != null) {
				Rover rover = new Rover();
				rover.setPlateau(plateau);
				rover.put(lineOne);
				// actions
				String lineTwo;
				if ((lineTwo = br.readLine()) != null) {
					char[] actions = lineTwo.toCharArray();
					rover.doActions(actions);
					
					
				}
				else
					System.err.println("rover without actions");
			}
			
			}catch (Exception e) {
				System.out.println("cannot place rover");
			}
		}
		else
			System.out.println("empty input");
	}
}

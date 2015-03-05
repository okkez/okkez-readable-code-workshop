package net.okkez.recipe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Recipe {

	public static void main(String[] args) {
		File file = new File("recipe-data.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String recipe = reader.readLine();
			reader.close();
			System.out.println(recipe);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

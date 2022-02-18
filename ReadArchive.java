package controller;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class ReadArchive {

	public static void main(String[] args) {
		
		Path path = Paths.get("C:/Test.txt");
		
		try {
			byte [] text = Files.readAllBytes(path);
			String content = new String(text);
			JOptionPane.showMessageDialog(null, content);
			
		} catch (NoSuchFileException n) {

			JOptionPane.showMessageDialog(null, "The file at the specified path does not exist. "
					+ "\nCreate and change the file in the Desktop before running the program.");
					
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null, "An unexpected error was encountered. "
					+ "Description: "+error);
		}
	}
}
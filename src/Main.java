/**
 * @author Carlos Chew
 * @author Otto Trujillo
 *
 */

//Packages
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.StringTokenizer;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
	
		ArrayList<String> dictionary = new ArrayList<String>();
		
		BinaryTree<String, String> word = new BinaryTree<String,String>();
		
		String translate = "";
		String direction ="";
		System.out.println("Choose the file ");
		keyboard.nextLine();
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("./src"));
		chooser.setDialogTitle("Choose the file");
		chooser.setFileFilter(new FileNameExtensionFilter("DIC (.dic", "dic"));
		int value = chooser.showOpenDialog(null);
		if(value == JFileChooser.APPROVE_OPTION) {
			try {
			
				FileInputStream stream = new FileInputStream(chooser.getSelectedFile().getAbsolutePath());
				BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
				String line;
				while((line = reader.readLine()) != null) {
					dictionary.add(line);
				}
				for(int i = 0; i<dictionary.size(); i++) {
					String data = dictionary.get(i).substring(i, dictionary.get(i).length() - 1);
					String[] charsequence = data.split("");
					word.insert(charsequence[0], charsequence[1]);
				}
			} catch(Exception e) {
				System.err.println("El .txt esta vacio");
			}
		}
		System.out.println("Choose the file to translate");
        keyboard.nextLine();
        JFileChooser chooser2 = new JFileChooser(System.getProperty("java.class.path"));
        chooser2.setDialogTitle("Seleccione su archivo");
        chooser2.setFileFilter(new FileNameExtensionFilter("Text  (.txt)", "txt"));
        int returnVal2 = chooser2.showOpenDialog(null);
        if(returnVal2 == JFileChooser.APPROVE_OPTION) {
            try {
                Scanner inputFile2 = new Scanner(new File(chooser2.getSelectedFile().getAbsolutePath()));
                direction = chooser2.getSelectedFile().getAbsolutePath();
            }
            catch (FileNotFoundException e) {
                System.out.println("No file selected");

            }
        }
        try
        {
            BufferedReader info = new BufferedReader(new FileReader(direction));  
            String rawText = info.readLine(); 
            /*en caso de punto al final*/
            rawText = rawText.substring(0, rawText.length()-1);
            String textoATraducir = rawText.toLowerCase();
            info.close();  
            System.out.println("Text:: \n" + textoATraducir);
            String englishLanguage, spanishLanguage;	
            StringTokenizer st = new StringTokenizer (textoATraducir);

        
            while (st.hasMoreTokens())
            {
                englishLanguage = st.nextToken();
                spanishLanguage = word.find(englishLanguage);
                if (spanishLanguage != null){
                	translate = (translate +" "+ spanishLanguage);
                }
                else{
                	translate = (translate + " *"+englishLanguage+"*");
                }

            }
            System.out.println("TRanslate: \n");
            translate = translate + ".";
            System.out.println(translate);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Wrong file");
        }
        System.out.println("\nNo content of words");
        System.out.println("inside the file: \n");
        word.display(word.root);


		
	}

}
				
				
	
		

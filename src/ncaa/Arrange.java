package ncaa;


import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Arrange {
	static ArrayList<String[]> west = new ArrayList<String[]> (); 
	static ArrayList<String[]> midwest = new ArrayList<String[]> (); 
	static ArrayList<String[]> east = new ArrayList<String[]> (); 
	static ArrayList<String[]> south = new ArrayList<String[]> (); 

  public static void main() {

	Arrange obj = new Arrange();
	obj.run();

  }

  public void run() {

	String csvFile = "ncaa_data_2016.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		br = new BufferedReader(new FileReader(csvFile));
		String headerLine = br.readLine();
		while ((line = br.readLine()) != null) {

		        // use comma as separator
			String[] team = line.split(cvsSplitBy);
		
			if (team[2].equals("West")){
				west.add(team);
			}
			else if (team[2].equals("East")){
				east.add(team);
			}
			else if (team[2].equals("Midwest")){
				midwest.add(team);
			}
			else if (team[2].equals("South")){
				south.add(team);
				
			}
			else{
				System.out.println("error");
			}
			

		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
  }
  public static ArrayList<String[]> west(){
	return west;  
  }
  public static ArrayList<String[]> midwest(){
		return midwest;  
	  }
  public static ArrayList<String[]> east(){
		return east;  
	  }
  public static ArrayList<String[]> south(){
		return south;  
	  }

  
}
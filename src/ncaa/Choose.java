package ncaa;

import java.util.ArrayList;

public class Choose {
	static ArrayList<String[]> west = new ArrayList<String[]> ();
	static ArrayList<String[]> midwest = new ArrayList<String[]> ();
	static ArrayList<String[]> east = new ArrayList<String[]> ();
	static ArrayList<String[]> south = new ArrayList<String[]> ();
	
	static ArrayList<String[]> west1 = new ArrayList<String[]> ();
	static ArrayList<String[]> midwest1 = new ArrayList<String[]> (); 
	static ArrayList<String[]> east1 = new ArrayList<String[]> (); 
	static ArrayList<String[]> south1 = new ArrayList<String[]> (); 
	
	static ArrayList<String[]> west2 = new ArrayList<String[]> (); 
	static ArrayList<String[]> midwest2 = new ArrayList<String[]> (); 
	static ArrayList<String[]> east2 = new ArrayList<String[]> (); 
	static ArrayList<String[]> south2 = new ArrayList<String[]> (); 
	
	static ArrayList<String[]> west3 = new ArrayList<String[]> (); 
	static ArrayList<String[]> midwest3 = new ArrayList<String[]> (); 
	static ArrayList<String[]> east3 = new ArrayList<String[]> (); 
	static ArrayList<String[]> south3 = new ArrayList<String[]> ();
	
	

	
	public static void main(String[] args){
		Arrange.main();
		
		
		System.out.println("The winner of the 2016 National Championship is " + compete());
		
	}
	
	public static String compete(){
		String[] west4;
		String[] south4;
		String[] midwest4;
		String[] east4;
		String[] prelim1;
		String[] prelim2;
		String[] winner;

		
		
		
		
		
		west = Arrange.west();
		midwest = Arrange.midwest(); 
		east = Arrange.east(); 
		south = Arrange.south(); 
		for(int i = 0; i < west.size()/2; i++){
			Float pa = Float.parseFloat(west.get(i)[1])/100;
			Float pb = Float.parseFloat(west.get(15 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				west1.add(west.get(i));
			}
			else{
				west1.add(west.get(15-i));
			}
		}
		for(int i = 0; i < west1.size()/2; i++){
			Float pa = Float.parseFloat(west1.get(i)[1])/100;
			Float pb = Float.parseFloat(west1.get(7 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				west2.add(west1.get(i));
			}
			else{
				west2.add(west1.get(7-i));
			}
		}
		for(int i = 0; i < west2.size()/2; i++){
			Float pa = Float.parseFloat(west2.get(i)[1])/100;
			Float pb = Float.parseFloat(west2.get(3 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				west3.add(west2.get(i));
			}
			else{
				west3.add(west2.get(3-i));
			}
		}
		
		Float pa1 = Float.parseFloat(west3.get(0)[1])/100;
		Float pb1 = Float.parseFloat(west3.get(1)[1])/100;
		Float pab1 = (pa1 - (pa1*pb1))/(pa1 + pb1 - 2*(pa1*pb1));
		Double rand1 = Math.random(); 
		if (pab1 <= rand1){
			west4 = west3.get(0);
		}
		else{
			west4 = west3.get(1);
		}
		
		
		for(int i = 0; i < midwest.size()/2; i++){
			Float pa = Float.parseFloat(midwest.get(i)[1])/100;
			Float pb = Float.parseFloat(midwest.get(15 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				midwest1.add(midwest.get(i));
			}
			else{
				midwest1.add(midwest.get(15-i));
			}
		}
		for(int i = 0; i < midwest1.size()/2; i++){
			Float pa = Float.parseFloat(midwest1.get(i)[1])/100;
			Float pb = Float.parseFloat(midwest1.get(7 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				midwest2.add(midwest1.get(i));
			}
			else{
				midwest2.add(midwest1.get(7-i));
			}
		}
		for(int i = 0; i < midwest2.size()/2; i++){
			Float pa = Float.parseFloat(midwest2.get(i)[1])/100;
			Float pb = Float.parseFloat(midwest2.get(3 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				midwest3.add(midwest2.get(i));
			}
			else{
				midwest3.add(midwest2.get(3-i));
			}
		}
		
		Float pa2 = Float.parseFloat(midwest3.get(0)[1])/100;
		Float pb2 = Float.parseFloat(midwest3.get(1)[1])/100;
		Float pab2 = (pa2 - (pa2*pb2))/(pa2 + pb2 - 2*(pa2*pb2));
		Double rand2 = Math.random(); 
		if (pab2 <= rand2){
			midwest4 = midwest3.get(0);
		}
		else{
			midwest4 = midwest3.get(1);
		}
		
		
		for(int i = 0; i < south.size()/2; i++){
			Float pa = Float.parseFloat(south.get(i)[1])/100;
			Float pb = Float.parseFloat(south.get(15 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				south1.add(south.get(i));
			}
			else{
				south1.add(south.get(15-i));
			}
		}
		for(int i = 0; i < south1.size()/2; i++){
			Float pa = Float.parseFloat(south1.get(i)[1])/100;
			Float pb = Float.parseFloat(south1.get(7 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				south2.add(south1.get(i));
			}
			else{
				south2.add(south1.get(7-i));
			}
		}
		for(int i = 0; i < south2.size()/2; i++){
			Float pa = Float.parseFloat(south2.get(i)[1])/100;
			Float pb = Float.parseFloat(south2.get(3 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				south3.add(south2.get(i));
			}
			else{
				south3.add(south2.get(3-i));
			}
		}
		
		Float pa3 = Float.parseFloat(south3.get(0)[1])/100;
		Float pb3 = Float.parseFloat(south3.get(1)[1])/100;
		Float pab3 = (pa3 - (pa3*pb3))/(pa3 + pb3 - 2*(pa3*pb3));
		Double rand3 = Math.random(); 
		if (pab3 <= rand3){
			south4 = south3.get(0);
		}
		else{
			south4 = south3.get(1);
		}
		
		
		
		for(int i = 0; i < east.size()/2; i++){
			Float pa = Float.parseFloat(east.get(i)[1])/100;
			Float pb = Float.parseFloat(east.get(15 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				east1.add(east.get(i));
			}
			else{
				east1.add(east.get(15-i));
			}
		}
		for(int i = 0; i < east1.size()/2; i++){
			Float pa = Float.parseFloat(east1.get(i)[1])/100;
			Float pb = Float.parseFloat(east1.get(7 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				east2.add(east1.get(i));
			}
			else{
				east2.add(east1.get(7-i));
			}
		}
		for(int i = 0; i < east2.size()/2; i++){
			Float pa = Float.parseFloat(east2.get(i)[1])/100;
			Float pb = Float.parseFloat(east2.get(3 - i)[1])/100;
			Float pab = (pa - (pa*pb))/(pa + pb - 2*(pa*pb));
			Double rand = Math.random(); 
			if (pab <= rand){
				east3.add(east2.get(i));
			}
			else{
				east3.add(east2.get(3-i));
			}
		}
		
		Float pa4 = Float.parseFloat(east3.get(0)[1])/100;
		Float pb4 = Float.parseFloat(east3.get(1)[1])/100;
		Float pab4 = (pa4 - (pa4*pb4))/(pa4 + pb4 - 2*(pa4*pb4));
		Double rand4 = Math.random(); 
		if (pab4 <= rand4){
			east4 = east3.get(0);
		}
		else{
			east4 = east3.get(1);
		}
		
		
		Float pa5 = Float.parseFloat(south4[1])/100;
		Float pb5 = Float.parseFloat(west4[1])/100;
		Float pab5 = (pa5 - (pa5*pb5))/(pa5 + pb5 - 2*(pa5*pb5));
		Double rand5 = Math.random(); 
		if (pab5 <= rand5){
			prelim1 = south4;
		}
		else{
			prelim1 = west4;
		}
		
		Float pa6 = Float.parseFloat(east4[1])/100;
		Float pb6 = Float.parseFloat(midwest4[1])/100;
		Float pab6 = (pa6 - (pa6*pb6))/(pa6 + pb6 - 2*(pa6*pb6));
		Double rand6 = Math.random(); 
		if (pab6 <= rand6){
			prelim2 = east4;
		}
		else{
			prelim2 = midwest4;
		}
		
		Float pa7 = Float.parseFloat(prelim1[1])/100;
		Float pb7 = Float.parseFloat(prelim2[1])/100;
		Float pab7 = (pa7 - (pa7*pb7))/(pa7 + pb7 - 2*(pa7*pb7));
		Double rand7 = Math.random(); 
		if (pab7 <= rand7){
			winner = prelim1;
		}
		else{
			winner = prelim2;
		}
		return winner[0];
		
		
		
		
		
	}
}

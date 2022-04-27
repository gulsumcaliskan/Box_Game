
public class Main {
	public static void main(String[] args){
		Fighter f1 = new Fighter("Johnny Cage", 10, 120, 100, 30, 50);
		Fighter f2 = new Fighter("Reiko", 20, 85, 85, 40, 50);
		
		Match match = new Match(f1, f2, 85, 100);
		match.run();
	}
	

}

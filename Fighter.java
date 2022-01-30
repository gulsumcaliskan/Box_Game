
public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	double startUp;
	
	Fighter(String name, int damage, int health, int weight, int dodge, double startUp){
		this.name = name; // metottan gelen name eþitlendi
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if (dodge >= 0 && dodge <= 100){
			this.dodge = dodge;
		}else {
			this.dodge = 0;
		}
		this.startUp = startUp;
		
	}
	
	int hit(Fighter foe){
		System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
		
		if(foe.isDodge()){
			System.out.println(foe.name + " gelen hasarý blokladý!!");
			System.out.println("***************");
			return foe.health;
		}
		
		
		if (foe.health - this.damage < 0){
			return 0;
		}
		return foe.health - this.damage;
	}
	
	boolean isDodge(){
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge; 
	}
	
	boolean startUp(){
		double randomStartUp = Math.random() * 100;
		return randomStartUp <= this.startUp;
	}

}


public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}
	
	void run(){
		if (isCheck()){
			while (this.f1.health > 0 && this.f2.health > 0){
				System.out.println("*******YEN� ROUND********");
				
				if(f1.startUp()){
					System.out.println(f1.name + " Round'a ba�l�yor");
					this.f2.health = this.f1.hit(this.f2);	
				}
				if (isWin()){
					break;
				}else if(f2.startUp()){
					System.out.println(f2.name + " Round'a Ba�l�yor!!");
				}
				this.f1.health = this.f2.hit(this.f1);
				if (isWin()){
					break;
				}
				System.out.println(this.f1.name + " Sa�l�k : " + this.f1.health);
				System.out.println(this.f2.name + " Sa�l�k : " + this.f2.health);
			}
		}else {
			System.out.println("Sporcular�n sikletleri uymuyor");
		}
	}
	
	boolean isCheck(){
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
		
	}
	
	boolean isWin(){
		if (this.f1.health == 0){
			System.out.println(f2.name + " kazand�");
			return true;
		}
		
		if(this.f2.health == 0){
			System.out.println(this.f1.name + " kazand�");
			return true;
		}
		return false;
	}
	

}

package m3.task1;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Doberman");
		d1.setWeight(70);
		d1.setAge(23);
		
		d1.doFeedAnimal();
		System.out.println(d1.getName()+" - "+d1.getWeight()+" - "+d1.isStatus());
		for(int i = 0;i < 5;i++) {
		d1.playGames();
		}
		System.out.println(d1.getName()+" - "+d1.getWeight()+" - "+d1.isStatus());
		
		Dog d2 = new Dog();
		d2.setName("Puppy");
		d2.setWeight(25);
		d2.setAge(6);
		
		
		d2.doFeedAnimal();
		System.out.println(d2.getName()+" - "+d2.getWeight()+" - "+d2.isStatus());
		d2.playGames();
		System.out.println(d2.getName()+" - "+d2.getWeight()+" - "+d2.isStatus());
		
		
		Dog d3 = new Dog();
		d3.setName("Daizy");
		d3.setWeight(1);
		d3.setAge(42);
		
		d3.doFeedAnimal();
		System.out.println(d3.getName()+" - "+d3.getWeight()+" - "+d3.isStatus());
		d3.playGames();
		System.out.println(d3.getName()+" - "+d3.getWeight()+" - "+d3.isStatus());
	}

}

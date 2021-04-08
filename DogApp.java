package m3.task1;

import java.util.Scanner;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Doberman");
		d1.setWeight(70);
		d1.setAge(23);
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enetr your choice:\n1 Dog is fed\n2 Dog is playing\n3 Exit");
			
			int choice = sc.nextInt();
			
			
			switch(choice) {
			    case 1:
			    	d1.doFeedAnimal();
			    	System.out.println(d1.getName()+" - "+d1.getWeight()+" - "+d1.isStatus());
			    	System.out.println("Dog is eating");
			    	break;
			    case 2:
			    	d1.playGames();
					System.out.println(d1.getName()+" - "+d1.getWeight()+" - "+d1.isStatus());
					if(d1.isStatus()) {
						System.out.println("Dog is playing");
					}else {
						System.out.println("Dog is not playing as its weight is not in the given range");
					}
					break;
			    case 3:
			    	System.exit(0);
			    	
			}
		}
		
		
	}

}

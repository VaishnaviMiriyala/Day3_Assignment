package m3.task1;
public class CarApp {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
        c1.setColor("Black");
        c1.setCost(120000);
        c2.setColor("Blue");
        c2.setCost(20000);
        c3.setColor("Blue");
        c3.setCost(30000);
        System.out.println(+c1.getCost());
	}

}
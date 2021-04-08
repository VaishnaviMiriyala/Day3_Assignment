package m3.task1;
public class Car{
    private int cost;
	private String color;
    Car(){
    	System.out.println("Successfully Default constructor is created");
    }
	Car(int cost, String color) {
		this.cost = cost;
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
		System.out.println(this);
	}
    

}
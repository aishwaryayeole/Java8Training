
public class VehicleMainApp {
	
	public static void main(String[] args) {
		
		//Anonymous class
		Vehicle vehicle =new Car();
		vehicle.accelerate();
		
		Vehicle scooty = new Vehicle() {

			@Override
			public void accelerate() {
				System.out.println("acc");
			}

			@Override
			public void brake() {
				// TODO Auto-generated method stub
				
			}
			
		};	
		
		scooty.accelerate();
	} 
}

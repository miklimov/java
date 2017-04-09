package clinic;
/***
*Запуск приложения
*/
public class RunnerClinic{
	public static void main(String[] args) {
		final Clinic clinic = new Clinic(10);

		clinic.addClient(0,new Client("Jonny", new Cat("Klaus")));
		clinic.addClient(1,new Client("Mary", new Dog("Pshok")));
		
		//System.out.println(clinic.findClientsByPetName("Mary"));
		
	}
}
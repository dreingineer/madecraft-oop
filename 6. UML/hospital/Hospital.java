package hospital;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		Surgeon surgeon = new Surgeon();
		GeneralPractitioner gp = new GeneralPractitioner();
		
		doctor.doMedicine();
		surgeon.doMedicine();
		gp.doMedicine();
	}

}

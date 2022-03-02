package fr.tetiana.partage;

public class Instagram implements IPartage {

	@Override
	public void partage(String message) {

		 System.out.println("VOTRE MESSAGE :\n" + message + "\n\n a été partagé à Instagram.");
		 

	}

}

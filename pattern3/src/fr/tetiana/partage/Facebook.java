package fr.tetiana.partage;

public class Facebook implements IPartage {

	@Override
	public void partage(String message) {
		 System.out.println("VOTRE MESSAGE :\n" + message + "\n\n a été partagé à Facebook.");
		 
		 

	}

}

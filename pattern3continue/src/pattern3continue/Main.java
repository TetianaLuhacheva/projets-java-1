package pattern3continue;

import fr.tetiana.partage.Facebook;
import fr.tetiana.partage.IPartage;
import fr.tetiana.partage.Twitter;

public class Main {

	public static void main(String[] args) {
		IPartage facebook = new Facebook();
		facebook.partage("J'ai dormi");
		
		IPartage twitter = new Twitter();
		facebook.partage("J'ai dormi");
		
		
	}

}

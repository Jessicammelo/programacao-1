package ultra;

public class UltraEmoji {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6]; 
		l[0]= new Lutador("João", "Brasil", 26, 1.70f, 68f, 11, 2, 1);
		l[1]= new Lutador("paulo", "Brasil", 26, 1.70f, 68f, 11, 2, 1);
		l[2]= new Lutador("will", "Brasil", 26, 1.70f, 68f, 11, 2, 1);
		l[3]= new Lutador("teo", "Brasil", 26, 1.70f, 68f, 11, 2, 1);
		l[4]= new Lutador("joca", "Brasil", 26, 1.70f, 68f, 11, 2, 1);
		l[5]= new Lutador("marlon", "Brasil", 26, 1.70f, 68f, 11, 2, 1);
		
		l[3].status();
	}

}

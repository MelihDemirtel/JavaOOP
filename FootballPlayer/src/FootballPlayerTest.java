
public class FootballPlayerTest {

	public static void main(String[] args) {
		
		FootballPlayer alex = new FootballPlayer();
		
		alex.setNo(10);
		alex.setName("Alex de Souza");
		alex.setMinutes(90);
		alex.setisInPlay(true);
		alex.setNumberOfGoals(24);
	
		System.out.println("Alex Number : "+alex.getNo());
		System.out.println("Alex Full Name : "+alex.getName());
		System.out.println("Alex Minutes : "+alex.getMinutes());
		System.out.println("Alex Number : "+alex.isInPlay());
		System.out.println("Alex Number of Goals : "+alex.getNumberOfGoals());
		
		FootballPlayer messi = new FootballPlayer();
		
		messi.setNo(10);
		messi.setName("Messi");
		messi.setMinutes(90);
		messi.setisInPlay(true);
		messi.setNumberOfGoals(30);
	
		System.out.println("Messi Number : "+messi.getNo());
		System.out.println("Messi Full Name : "+messi.getName());
		System.out.println("Messi Minutes : "+messi.getMinutes());
		System.out.println("Messi Number : "+messi.isInPlay());
		System.out.println("Messi Number of Goals : "+messi.getNumberOfGoals());


	}
	
}

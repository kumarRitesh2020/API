package RandomNumber;

import java.util.Random;

public class RandomNum {
	
	public int random() {
		Random r=new Random();
		int ran=r.nextInt(1000);
		return ran;
	}

}

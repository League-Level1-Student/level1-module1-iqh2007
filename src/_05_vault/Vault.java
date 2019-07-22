package _05_vault;

import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Vault {

	int secretCode = new Random().nextInt(100001);

	public boolean tryCode (int guess) {
			if(secretCode == guess) {
				return true;
				}
			
			
			
				else {
					return false;
				}	
		}

}

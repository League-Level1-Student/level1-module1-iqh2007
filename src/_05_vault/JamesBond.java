package _05_vault;

public class JamesBond {
	

	 int findCode (Vault v2) {
		 for(int i =0; i<100001; i++) {
			 if(v2.tryCode(i) == true) {
				 return i;
			 }
		 }
		 
		 return -1;
	 }
		
		
		
		
	}


package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	
	Vault v1 = new Vault();
	
	v1.tryCode(9);
	
	JamesBond j1 = new JamesBond();
	
int number = j1.findCode(v1);
	
	System.out.println(number);
	
}
}

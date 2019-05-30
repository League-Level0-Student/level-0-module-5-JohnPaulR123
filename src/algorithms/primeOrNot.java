package algorithms;

import javax.swing.JOptionPane;

public class primeOrNot {
	static boolean isPrime = true;
public static void main(String[] args) {
	String prime = JOptionPane.showInputDialog("Type A Number");
	int primer=Integer.parseInt(prime);
	for(int i=2; i<primer;i++) {
		if(primer%i==0) {
			isPrime=false;
		}
	}
	if (isPrime==true) {
		JOptionPane.showMessageDialog(null, primer+" Is A Prime");
	}
	else {
		JOptionPane.showMessageDialog(null, primer+" Is Not A Prime");
	}
}
}

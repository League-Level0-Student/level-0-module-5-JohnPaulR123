package algorithms;

public class fibonacci {
public static void main(String[] args) {
	int x = 0;
	int y =1;
	int sum;
	System.out.println(x);
	System.out.println(y);
	for(int num=0;num<11;num++){
		sum=x+y;
		System.out.println(sum);
		x=y;
		y=sum;
	}
}
}

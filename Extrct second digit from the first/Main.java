import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int l=0;
        int f=0;
      	while(n>0){
          	l=f;
        	f=n;
          	n=n/10;
        }
      	l=l%10;
      	System.out.println(l);
	}
}
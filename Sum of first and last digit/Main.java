import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int l=n%10;
        int f=0;
      	while(n>0){
        	f=n;
          	n=n/10;
        }
      	f=f+l;
      	System.out.println(f);
	}
}
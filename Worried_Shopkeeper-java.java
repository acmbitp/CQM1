import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int q=0;q<t;q++)
		{
			String s[]=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			long ans=0;
			if(gcd(a,b)==1)
				 ans=(long)a*(long)b-a-b+1;
			else
				 ans=-1;
			if(ans==0)
				System.out.println(1);
			else
			    System.out.println(ans);
		}
	}
  static int gcd(int a,int b)
    {
	  if(b==0)
	     { return a; } 
	  return gcd(b,a%b);

	 
    }
}

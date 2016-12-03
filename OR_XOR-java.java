import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int q=0;q<t;q++)
		{
			String a = br.readLine();
			String b = br.readLine();

			int n = a.length();
			int m = b.length();
			
			if(n!=m) System.out.println("NO");

			else
			{
  				int ca=0,cb=0;
   				for(int i=0;i<n;i++)
				{
      					if(a.charAt(i)=='0') ca++;
      					if(b.charAt(i)=='0') cb++;
   				}
   				if(ca==n || cb==n)
				{
     					if(ca==cb) System.out.println("YES");
     					else System.out.println("NO");
   				}
   				else System.out.println("YES");
			}
}
}
}

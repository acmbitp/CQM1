import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;
  
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s;
            s = br.readLine();
            int x=s.length();
            int ind=0,sum=1,c=0,ans=0;
             
            for(int i=0;i<x;i++)
            {
                if(s.charAt(i)=='1')
                {
                    ind=i;
                    break;
                }
            }
             
            for(int i=ind+1;i<x;i++)
            {
                if(s.charAt(i)=='0')
                    c++;
                     
                else if(s.charAt(i) == '1')
                {
                    ans=Math.max(c,ans);
                    c=0;
                }
            }
             
            System.out.println(ans);
          
   }
  
}
}
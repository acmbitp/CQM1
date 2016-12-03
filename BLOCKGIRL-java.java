import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int count=0;
            for(int i=0;i<n;i++){
            String s=br.readLine();
            char a[]=s.toCharArray();
            if(a[0]=='V'){
                count++;
            }
            }
            System.out.println(count);
                 
         
   }
 
}
}
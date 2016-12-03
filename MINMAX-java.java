import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            String s[]=br.readLine().split(" ");
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(s[i]);
            Arrays.sort(arr);
            int ans=arr[n-1]-arr[0];
            System.out.println(ans);
         
   }
 
}
}
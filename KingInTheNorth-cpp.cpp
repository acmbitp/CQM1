#include<bits/stdc++.h>
using namespace std;
int main()
{
int t;
cin>>t;
while(t--){
string s;
cin>>s;
int x=s.size();
int ind,sum=1,c=0,ans=0;
for(int i=0;i<x;i++)
    if(s[i]=='1'){
        ind=i;
        break;
    }
 for(int i=ind+1;i<x;i++){

         if(s[i]=='0')
            c++;
         else if(s[i] == '1'){
            ans=max(c,ans);
            c=0;
         }
}
cout<<ans<<endl;
}

return 0;
}

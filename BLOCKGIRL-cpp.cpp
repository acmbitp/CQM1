#include<bits/stdc++.h>
#define ll long long int

 
using namespace std;
 
 
int main(){
int t;
    cin>>t;
    while(t--){
       int n;
        cin>>n;
        int ans=0;
        for(int i=0;i<n;i++){
           string s;
            cin>>s;
            if(s[0]=='V') ans++;
        }
      cout<<ans<<endl;
    }
 
return 0;
}
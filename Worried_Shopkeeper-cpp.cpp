#include<bits/stdc++.h>
#define ll long long int

 
using namespace std;
 
char a[1000002],b[1000002];
int main(){
 int t;
 si(t);
 while(t--){
    int x,y;
    cin>>x>>y;
         int ans=-1;
    if(__gcd(x,y)==1){
        ans=max(1,x*y-x-y+1);
    }
 
    cout<<ans<<endl;
 
 }
return 0;
}
#include<bits/stdc++.h>
#define ll long long int
#define mp make_pair
#define pb push_back
#define si(x) scanf("%d",&x)
#define pi(x) printf("%d\n",x)
#define s(x) scanf("%I64d",&x)
#define p(x) printf("%I64d\n",x)
#define sc(x) scanf("%s",x)

using namespace std;

int a[100002],d[100002];
int main(){
int t;
cin>>t;
while(t--){
int n,i;
si(n);
for(i=0;i<n;i++) s(a[i]);

memset(d,0,sizeof(d));

int ans=0,val;
for(i=n-1;i>=0;i--){
    val=d[a[i]];
    for(int j=2;j*j<=a[i];j++){
        if(a[i]%j==0){
            val=max(max(val,d[j]),d[a[i]/j]);
        }
    }
    d[a[i]]=val+1;
    for(int j=2;j*j<=a[i];j++){
        if(a[i]%j==0){
            d[j]=d[a[i]/j]=val+1;
        }
    }
    ans=max(ans,val+1);
}
pi(ans);
}
return 0;
}

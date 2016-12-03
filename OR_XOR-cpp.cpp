#include<bits/stdc++.h>
#define ll long long int
#define mp make_pair
#define pb push_back
#define si(x) scanf("%d",&x)
#define pi(x) printf("%d\n",x)
#define s(x) scanf("%I64d",&x)
#define p(x) printf("%I64d\n",x)
#define sc(x) scanf("%s",x)
#define pc(x) printf("%s",x)
#define F first
#define S second
#define M 1000000007

using namespace std;

char a[1000002],b[1000002];
int main(){
 int t;
 si(t);
 while(t--){
sc(a);sc(b);
int n=strlen(a),m=strlen(b);
if(n!=m) printf("NO\n");
else{
   int ca=0,cb=0;
   for(int i=0;i<n;i++){
      if(a[i]=='0') ca++;
      if(b[i]=='0') cb++;
   }
   if(ca==n || cb==n){
     if(ca==cb) printf("YES\n");
     else printf("NO\n");
   }
   else printf("YES\n");
}
 }
return 0;
}

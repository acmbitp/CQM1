#include<bits/stdc++.h>
#define ll long long int

using namespace std;

int main()
{
    int t;
    cin >> t;

    while(t--)
    {
        int n;
        cin >> n;

        int a[n];

        for(int i=0; i<n; i++)
        {
            cin >> a[i];
        }

        sort(a, a+n);

        ll ans = a[n-1] - a[0];

        cout << ans << endl;
    }
}

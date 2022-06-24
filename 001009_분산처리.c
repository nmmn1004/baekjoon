#include <stdio.h>
#include <math.h>

int check10(int x);
int check4(int x);

int main()
{
    int a, b, n;
    scanf("%d", &n);
    unsigned int data[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d %d", &a, &b);
        b = check4(b);
        data[i] = pow(a, b);
        data[i] = check10(data[i]);
    }
    for(int j = 0; j < n; j++)
    {
        printf("%d\n", data[j]);
    }
}

int check10(int x)
{
    x %= 10;
    if(x == 0)
        return 10;
    else return x;
}
int check4(int x)
{
    x %= 4;
    if(x == 0)
        return 4;
    else return x;
}

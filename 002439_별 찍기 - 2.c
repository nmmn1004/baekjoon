#include <stdio.h>

int main(void)
{
    int N, i, j;
    scanf("%d", &N);
    int k;
    
    for(i = 1; i <= N; i++)
    {
        for(k = 1; k <= (N - i); k++)
        {
            printf(" ");
        }
        for(j = 1; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

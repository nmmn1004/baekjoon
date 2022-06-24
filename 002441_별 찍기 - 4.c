#include <stdio.h>

int main(void)
{
    int N, i, j, k;
    scanf("%d", &N);
    
    for(i = 0; i < N; i++)
    {
        for(k = 1; k <= i; k++)
        {
            printf(" ");
        }
        for(j = 1; j <= N - i; j++)
        {
            printf("*");
        }
        printf("\n");
        
    }
}

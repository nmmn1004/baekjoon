#include <stdio.h>

int main(void)
{
    int N, i, j, k;
    scanf("%d", &N);
    
    for(i = 1; i <= N; i++)
    {
        for(j = 0; j < N - i; j++)
            printf(" ");
        for(k = 1; k <= i; k++)
            printf("*");
        for(k = 1; k < i; k++)
            printf("*");        
            
        printf("\n");
    }
}

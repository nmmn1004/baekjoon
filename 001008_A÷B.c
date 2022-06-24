#include <stdio.h>

int main(void)
{
    double A, B, result;
    scanf("%lf %lf", &A, &B);
    result = A / B;
    
    printf("%.9lf", result);
    return 0;
}

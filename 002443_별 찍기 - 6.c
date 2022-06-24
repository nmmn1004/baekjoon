#include <stdio.h>

int main(void)
{
   int n, i, j, k;

   scanf("%d", &n);

   for (i = 1; i <= n; i++)
   {
      for (k = 1; k < i; k++)
      {
         printf(" ");
      }
      for (j = 0; j < (2 * n) - ((2 * i) - 1); j++)
      {
         printf("*");
      }
      printf("\n");
   }
}

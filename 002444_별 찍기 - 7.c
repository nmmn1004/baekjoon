#include <stdio.h>

int main(void)
{
	int n, i, j, k, l;

	scanf("%d", &n);

	for (i = 1; i < n; i++)
	{

		for (k = 0; k < (n - i); k++)
		{
			printf(" ");
		}

		for (l = 0; l < ((2 * i) - 1); l++)
		{
			printf("*");
		}

		printf("\n");
	}

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

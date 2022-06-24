#include <stdio.h>

int main(void)
{
	int n;

	int k = 0;

	scanf("%d", &n);

	for (int i = 1, m = 0; i <= n; i++, m = 0)
	{
		scanf("%d", &m);

		if (m == 1)
		{
			k++;
		}
		else
		{
			k--;
		}
	}
	if (k > 0)
		printf("Junhee is cute!");
	else
		printf("Junhee is not cute!");
}

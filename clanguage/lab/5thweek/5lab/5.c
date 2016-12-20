#include <stdio.h>

void odd_even_sum(int n, int sums[]) {
	int odd = 0 ;
	int even = 0;
	int cnt = 0;
	int i = 1, j = 2;
	int sum1 = 0;
	int sum2 = 0;
	for (cnt = 0, i = 1, j = 2; cnt < n; ++cnt, i += 2, j += 2){
		sum1 += i, sum2 += j; 	
		
	}
	sums[1] = sum1; sums[0] = sum2;
	/*for (cnt=0;cnt<n;++cnt){	
		sum1 += i, sum2 += j;
		i += 2, j += 2;	
	}
	sums[1] = sum1, sums[0] = sum2;*/
	/* while (cnt<n){
		sum1 += i, sum2 += j;
		i += 2, j += 2;
		++cnt;	
	}
	sums[1] = sum1, sums[0] = sum2;*/
}

int main() {
	int sums[2] = {0, 0};

	odd_even_sum(0, sums);
	printf("Odd = %d Even = %d\n", sums[1], sums[0]); /* 0 0 */
	odd_even_sum(1, sums);
	printf("Odd = %d Even = %d\n", sums[1], sums[0]); /* 1 2 */
	odd_even_sum(2, sums);
	printf("Odd = %d Even = %d\n", sums[1], sums[0]); /* 4 6 */
	odd_even_sum(3, sums);
	printf("Odd = %d Even = %d\n", sums[1], sums[0]); /* 9 12 */
	odd_even_sum(4, sums);
	printf("Odd = %d Even = %d\n", sums[1], sums[0]); /* 16 20 */
	odd_even_sum(5, sums);
	printf("Odd = %d Even = %d\n", sums[1], sums[0]); /* 25 30 */


}

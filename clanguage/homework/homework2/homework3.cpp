#include <stdio.h>
unsigned circular_shift(unsigned x, int n){
	unsigned a = x<<n;
	unsigned b = x>>(32-n);
	return a|b;
}
	
void print_bin(unsigned x) {
    const int SIZE = sizeof(x) * 8;     
	printf("decimal : %u\n", x);
	printf("binary : ");     
	for (int i = 0; i < SIZE; i++){
	    printf("%c", (x>>(SIZE-i-1)&1) + 48);
	}
	printf("\n");
}
	    
int main(){
	unsigned x = 25;
	print_bin(x);
	print_bin(circular_shift(x, 30));
	return 0;
}

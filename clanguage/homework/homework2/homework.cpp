
#include <stdio.h> 
void print_bin(unsigned x) {
    const int SIZE = sizeof(x) * 4;     
	printf("%u\n", x);
   
	for (int i = 0; i < SIZE; i++)    
	    printf("%c", (x>>(SIZE-i-1)&1) + 48);
}
int main(){
	unsigned short x = 2016*2*2;
	print_bin(x);
	return 0;
} 

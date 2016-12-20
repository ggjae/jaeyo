#include <stdio.h> 
void print_bin(unsigned x) {
    const int SIZE = sizeof(x) * 8;     
	printf("decimal : %u\n", x);
	printf("binary : ");     
	for (int i = 0; i < SIZE; i++)    
	    printf("%c", (x>>(SIZE-i-1)&1) + 48);

void print_oct(unsigned x){
	unsigned a,b,c,d,e;
	a=1;b=0;c=0;d=0;e=0;
	const int SIZE = sizeof(x) * 8;
	printf("decimal : %u\n", x);
	printf("octal : ");
	for(int i = 0;i<SIZE ; i++){
		a++;
		if(a%3==0){
			if(((x>>(SIZE-i-1)&1))== 1){
				b = 1;
			}
			e = b+c+d;
			b=0;c=0;d=0;
			printf("%c",e+48);
			e=0;
		}
		else if(a%3==1){
			if(((x>>(SIZE-i-1)&1))== 1){
				c = 4;
			}
			
		}
		else if(a%3==2){
			if(((x>>(SIZE-i-1)&1))== 1){
				d = 2;
			}
		}
	}
}

	// 만약에.. 8진수라면. 25가 들어오면..
	///
void print_hex(unsigned x){
	unsigned a,b,c,d,e,g;
	a=0;b=0;c=0;d=0;e=0;g=0;
	const int SIZE = sizeof(x) * 8;
	printf("decimal : %u\n", x);
	printf("hexadecimal : ");
	for(int i = 0;i<SIZE ; i++){
		a++;
		if(a%4==0){
			if(((x>>(SIZE-i-1)&1))== 1){
				b = 1;
			}
			e = b+c+d+g;
			b=0;c=0;d=0;g=0;
			if(e>9){
				printf("%c",e+55);
				e=0;
			}else if(e<=9){
				printf("%c",e+48);
				e=0;
			}
			
		}
		else if(a%4==1){
			if(((x>>(SIZE-i-1)&1))== 1){
				c = 8;
			}
			
		}
		else if(a%4==2){
			if(((x>>(SIZE-i-1)&1))== 1){
				d = 4;
			}
		}
		else if(a%4==3){
			if(((x>>(SIZE-i-1)&1))== 1){
				g = 2;
			}
			
		}
		
	}
}
int main() {
	unsigned x = 15;
	print_oct(x);
	return 0;
} 

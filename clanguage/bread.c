#include <stdio.h>
void ans(char *s[]){
	printf("%s\n", *s);
	printf("%s\n", *++s);
	printf("%s\n", *++s);
}

int main(){
	char *s[] = {"Jaehoon", "Captain", "OurBrother"}; // 포인터배열
  char **x = s;
  printf("%s\n", *x);
  printf("%s\n", *++x);
  printf("%s\n", *++x);
  // printf("%s\n", s);
  // printf("%s\n", s);
  // printf("%s\n", ++s);
}

#include <stdio.h>
#include <string.h>

/* reverse: reverse string s in place */
void reverse(char *s) {
  int c, i, j;

  for (i = 0, j = strlen(s)-1; i < j; j--, i++) {
    c = *(s+i);
    *(s+i) = *(s+j);
    *(s+j) = c;
  }
}

void myreverse(char *s){

}

int main(void){
  char s[100] = "HANYANG";
  reverse(s);
  printf("%s\n", s); // GNAYNAH
}

#include <stdio.h>
int main(int argc, char *argv[]){
  int i;
  char a;
  char asaeki;
  FILE *fp;
  FILE *fopen(plain.txt, "r");
  FILE *fopen(cipher.txt, "w");
  n = argv[1];
  while(true){
    a = getc(plain.txt);
    if(a != '\0'){
      asaeki = a+n;
      putc(asaeki,cipher.txt);
    } else {
      break;
    }
  }
  return 0;
}

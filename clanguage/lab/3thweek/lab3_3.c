#include <stdio.h>

void bin(unsigned x){
  short size = sizeof(x)*8;
  char o[sizeof(x)*8] = {'0'};
  o[size+1]='\0';
  int i;
  for(i=0;i<=size;i++)o[size-i] = (x>>i&1)+48;
  printf("binary : %s, dec : %u\n",o+1,x);
}
int main() {
  unsigned a = 0xF0F0FAF7;
  unsigned b = 0xAAAA;
  bin(a);
  bin(b);
  return 0;
}

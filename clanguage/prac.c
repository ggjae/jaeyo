#include <stdio.h>

int main(){
  printf("char = %lu\n", sizeof(char));
  printf("short = %lu\n", sizeof(short));
  printf("int = %lu\n", sizeof(int));
  printf("long = %lu\n", sizeof(long));
  printf("float = %lu\n", sizeof(float));
  printf("double = %lu\n", sizeof(double));
  printf("char* = %lu\n", sizeof(char*));
  printf("int* = %lu\n", sizeof(int*));
  struct point {
    int x;
    int y;
  } pt;
  printf("struct point = %lu\n", sizeof(struct point));
  return 0;
}

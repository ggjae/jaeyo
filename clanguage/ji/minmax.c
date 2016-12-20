#include <stdio.h>
#include <string.h>
int main() {

  char s0[128];
  char s1[128];
  int i = 0;
  gets(s0);
  gets(s1);
  // while(1){
  //   scanf("%s",&s1);
  //   if(s1=='\n'){
  //     break;
  //   } if (s1 == ' ')
  //     continue;
  // } // 두번째문장 받은거.
  printf("%s\n%s",s0,s1);
  return 0;

}

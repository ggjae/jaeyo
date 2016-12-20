#include <stdio.h>
void sum(int *x, int *y, int *s){
  int i,j,k;
  int q,w;

  q = x;
  w = y;
  x++,y++;
  s=q+w;
  for(i = 0; i < 9; printf("%2d\n", *(s+i++)));
  // for(k=0;k<8;k++)
  //   printf("%d",*s++);

  //   for(int j=0;j<3;j++)
  // }
}
int main(){
  int a[3][3]={1,2,3,4,5,6,7,8,9};
  int b[3][3]={4,2,3,6,5,1,2,3,4};
  int s[3][3]={0,0,0,0,0,0,0,0,0};
  int p[3][3]={0,0,0,0,0,0,0,0,0};
  sum(*a,*b,*s);
}

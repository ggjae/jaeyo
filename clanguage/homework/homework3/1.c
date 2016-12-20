#include <stdio.h>
void sum(int *x, int *y, int *s){
  int i,j,k;
  int a,b,c;

  for(i=0;i<9;i++){
    a = *x++;
    b = *y++;
    *s = a+b;
    printf("%d ",*s++);

  }
}
// void product(int **x, int **y, int **p){
//   int i,j,k;
//   int a,b,c,d,e,f,g;
//
//   for(i=0;i<3;i++){
//     for(j=0;j<3;j++){
//       if(i==0 & j==0){
//         a = *x++;
//         b = *y++;
//         *p += a*b;
//       }
//       printf("%d ", *p++);
//
//     }
//   }
//
// }
int main(){
  int i;
  int a[3][3]={1,2,3,4,5,6,7,8,9};
  int b[3][3]={4,2,3,6,5,1,2,3,4};
  int s[3][3]={0,0,0,0,0,0,0,0,0};
  int p[3][3]={0,0,0,0,0,0,0,0,0};
  sum(*a,*b,*s);
  // product(*a,*b,*p);

  return 0;
}

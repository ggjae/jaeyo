#include <stdio.h>
#include <stdlib.h>
#define RAND_MAX 9

int main(){
  int i,j,k,l;
  int max = 0;
  int count[10] = {0,0,0,0,0,0,0,0,0,0};
  for(i=0;i<100;i++){
    j = rand();
    if(j == 0){
      count[0]++;
    }
    else if(j == 1){
      count[1]++;
    }
    else if(j == 2){
      count[2]++;
    }
    else if(j == 3){
      count[3]++;
    }
    else if(j == 4){
      count[4]++;
    }
    else if(j == 5){
      count[5]++;
    }
    else if(j == 6){
      count[6]++;
    }
    else if(j == 7){
      count[7]++;
    }
    else if(j == 8){
      count[8]++;
    }
    else if(j == 9){
      count[9]++;
    }
  }
  for (k = 0; k < 10; k++) {
    if (max <= count[k]){
      max = count[k];
      k = l;
    }
  }
  printf("%d ", l);
}

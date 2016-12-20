#include <stdio.h>

int main() 
{ 
      int   a, b, c, d, sum, avg, n; 

      printf("A  B  C  D  SUM  AVGn"); 
      printf("\n--------------------"); 

      for  (n = 3; n > 0; n = n -1) { 
         scanf("%d,%d,%d,%d", &a, &b, &c, &d); 
         sum = a + b + c + d; 
         avg = sum / 4; 
         printf("\n%3d%3d%3d%3d%3d%3d", 
                        a, b, c, d, sum, avg); 
      } 
      return 0; 
} 

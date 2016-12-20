#include <stdio.h>

/* count digits, white space, others */
int main() {
    int c, i, nwhite, nother;
    int ndigit[10];
   int a;
   int j;
    nwhite = nother = 0;
    for (i = 0; i < 10; ++i)
        ndigit[i] = 0;
   
    while ((c = getchar()) != EOF)
        if (c >= '0' && c <= '9')
            ++ndigit[c-'0'];
        else if (c == ' ' || c == '\n' || c == '\t')
            ++nwhite;
        else
            ++nother;

    for (i = 0; i < 10; ++i){
       printf("%d ",i);
        for (a=0;a<ndigit[i];++a)
      {
           printf("%s","*");    
      }
         printf("\n");
   }
   printf("w");
   for (j=0;j<nwhite;++j){
      printf("%s","*");
   }
   printf("\n");
   
   printf("o");
   for (j=0;j<nother;++j){
      printf("%s","*");
   }
   printf("\n");   
}

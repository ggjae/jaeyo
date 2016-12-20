#include <stdio.h>

/* count digits, white space, others */
int main() {
    int c, i, j, nwhite, nother;
    int ndigit[10];

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

	for(i=0;i<10;i++){
		printf("%d",i);
		for(j=ndigit[i];j>0;j--){
			printf("*");
		}
		printf("\n");
	}
	printf("w ");
	for(i=nwhite;i>0;i--){
		printf("*");
	}
	printf("o "); 
	for(i=nother;i>0;i--){
		printf("*");
	}
}

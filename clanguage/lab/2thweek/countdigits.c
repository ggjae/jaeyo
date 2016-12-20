#include <stdio.h>

/* count digits, white space, others */
int main() {
    int c, i, nwhite, nother;
    int ndigit[10];

    nwhite = nother = 0;
    for (i = 0; i < 10; ++i)
        ndigit[i] = 0;
	
    while ((c = getchar()) != EOF)
        if (c >= '0' && c <= '9'){
            ++ndigit[c-'0'];
			printf("");
		}
        else if (c == ' ' || c == '\n' || c == '\t'){
		
            ++nwhite;
    	}
		else{
		
            ++nother;
            printf("*");
		}
    printf("digits =");
    for (i = 0; i < 10; ++i)
        printf("%d", ndigit[i]);
        printf(((int) ndigit[i])*"*");
    printf("\nwhite space = %d\nother = %d\n",
           nwhite, nother);
}

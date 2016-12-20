/* strindex: return index of t in s, -1 if none */
#include <string.h>
#include <stdio.h>
int strindex(char s[], char t[]) {
	int i, j, k;
	int pos = -1;
	for (i = strlen(s)-1; i>-1; i--) {
		for (j = i, k = strlen(t)-1; k > -1 && s[j] == t[k]; j--, k--)
		;
			if (k == -1)
				return j+1;	
			
	}
}
int main(){
	printf("%d",strindex("Hanyang","an"));
}

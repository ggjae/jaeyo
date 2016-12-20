#include <stdio.h>
#include <string.h>

#define MAXLINES 5000

char *lineptr[MAXLINES];

int readline(char s[], int lim) {
	int c, i;

	i = 0;
	while (--lim > 0 && (c = getchar()) != '\0' && c != '\n')
		s[i++] = c;
	if (c == '\n')
		s[i++] = c;
	s[i] = '\0';
	return i;
}

int readlines(char *lineptr[], int maxlines) {
	int len, nlines;
	char *p, line[MAXLINES];

	nlines = 0;
	while ((len = readline(line, MAXLINES)) > 0)
		if (nlines >= MAXLINES || (p = malloc(len)) == '\0')
			return -1;
		else {
			line[len-1] = '\0';
			strcpy(p, line);
			lineptr[nlines++] = p;
		}
	return nlines;
}

void writelines(char *lineptr[], int nlines) {
	int i;

	while (nlines-- > 0)
		printf("%s\n", *lineptr++);
	/*
	for (i = 0; i < nlines; i++)
		printf("%s\n", lineptr[i]);
	*/
}
void qsort(char v[], int left, int right) {
	int i, last, pivot;

	if (left >= right)
		return;
	swap(v, left, (left + right)/2);
	pivot = left;
	for (i = left+1; i <= right; i++)
		if (v[i] < v[left])
			swap(v, ++pivot, i);
	swap(v, left, pivot);
	qsort(v, left, pivot-1);
	qsort(v, pivot+1, right);
}
int main() {
	int nlines;

	if ((nlines = readlines(lineptr, MAXLINES)) >= 0) {
		qsort(lineptr, 0, nlines-1);
		writelines(lineptr, nlines);
		return 0;
	}
	else {
		printf("error: input too big to sort\n");
		return 1;
	}
	return 0;
}

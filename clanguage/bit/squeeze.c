/* squeeze: delete all c from s */
char s1[],s2[];
squeeze(s1, s2);
printf("%c\n",s1);
void squeeze(char s1[], char s2[]) {
	int i, j;

	for (i = j = 0; s1[i] != '\0'; i++)
		 for (;s1[i] != s2[j];)
			s1[j++] = s1[i];
		s1[j] = '\0';
}

/* atoi: convert s to integer */
int atoi(char s[]) {
    int i, n;

    n = 0;
    for (i = 0; s[i] >= '0' && s[i] <= '9'; ++i)
        n = 10 * n + (s[i] - '0');
    return n
}

int htoi(char s[]){
	int i,n;
	n=0;
	for(i=0;s[i]>='0'&& s[i]<'9'){
		n = (s[i]-'0')	
		} else if(s[i]>='a' && s[i]<='f'){
		n = s[i]-'a'+10
		}
}

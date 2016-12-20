#include <stdio.h>

int palindrome(char *, int);

int main() {
  int ans;
  ans = palindrome("abccba",6);
  printf("%d --\n", ans);
  ans = palindrome("rotator",7);
  printf("%d --\n", ans);
  ans = palindrome("abczabc",7);
  printf("%d --\n", ans);

  return 0;
}


int palindrome(char *s, int l) {
  int i;
  int ans = 1;
  for(i = 0; i*2 <= l; i++)
    ans &= (*(s+i) == *(s+l-i-1));
  return ans;
}
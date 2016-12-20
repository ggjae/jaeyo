#include <stdio.h>
struct tnode {
  char *word;
  int count;
  struct tnode *left;
  struct tnode *right;
}
struct tnode *addtree(struct tnode *, char *);
void treeprint(struct tnode *);
int getword(char *, int);
/* word frequency count */
int main() {
  struct tnode *root;
  char word[MAXWORD];
  root = NULL;
  while (getword(word, MAXWORD) != EOF)
    if (isalpha(word[0]))
      root = addtree(root, word);
  treeprint(root);
  return 0;
}

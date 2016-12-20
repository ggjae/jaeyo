#include <stdio.h>
#include <stdlib.h>    /* for atof() */
#include "calc.h"

#define MAXOP   100    /* max size of operand or operator */
#include <stdio.h>
#include "calc.h"
#define MAXVAL   100    /* maximum depth of val stack */

static int sp = 0;             /* next free stack position */
static double val[MAXVAL];     /* value stack */

/* push: push f onto value stack */
void push(double f) {
	if (sp < MAXVAL)
		val[sp++] = f;
	else
		printf("error: stack full, can't push %g\n", f);
}

/* pop: pop and return top value from stack */
double pop(void) {
	if (sp >0)
		return val[--sp];
	else {
		printf("error: stack empty\n");
		return 0.0;
	}
}
void top(void){
	printf("%f",pop());
	push(pop());
}
void duplicate(void){
	//push(push(pop()));
	double a = pop();
	push(a);
	push(a);
}
void swap(void){
	double a = pop();
	double b = pop();
	push(a);
	push(b);
}
/* reverse Polish calculator */
int main() {
	int type;
	double op2;
	char s[MAXOP];

	while ((type = getop(s)) != EOF) {
		switch (type) {
			case NUMBER: 
			    push(atof(s)); 
			    break;
			case '+': 
			    push(pop() + pop()); 
			    break;
			case '*': 
			    push(pop() * pop()); 
			    break;
			case '-':
			    op2 = pop();
			    push(pop() - op2);
			    break;
			case '/':
			    op2 = pop();
			    if (op2 != 0.0)
			    	push(pop() / op2);
			    else
			    	printf("error: zero divisor\n");
			    break;
			case '\n':
			    printf("\t%.8g\n", pop());
			    break;
			case '~':
				push(-pop());
				
			case '%':
				op2 = pop();
				if(op2 != 0.0)
					push((int) pop() % (int) op2);		
				else{
					printf("error : zero divisor\n"){
						
					}
				}
				break;				
			default:
			    printf("error: unknown command %s\n", s);
			    break;
		}
	}
	return 0;
}

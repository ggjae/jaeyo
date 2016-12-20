#include <stdio.h>

/* print Fahrenheit-Celsius table
   for fahr = 0, 20, …, 300; floating-point version */
int main() {
    float fahr, celsius;
    int lower, upper, step;

    lower = -30;    /* lower limit of temperature table */
    upper = 50;  /* upper limit */
    step = 10;    /* step size */

    fahr = lower;
	printf("  C\tF\n");
    while (fahr <= upper) {
        celsius = fahr*9/5+32;
        printf("%3.0f %6.1f\n", fahr, celsius);
        fahr = fahr + step;
    }
}

#include <stdio.h>
#include <string.h>
static char daytab[2][13] = {
	{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
};

/* day_of_year: set day of year from manth & day */
int day_of_year(int year, int month, int day) {
	int i, leap;
	leap = (year%4 == 0 && year%100 != 0) || year%400 == 0;
	
	if(leap && daytab[2][month] <= day && year>0 && 1<=month<=12){
		for (i = 1; i < month; i++)
			day += daytab[leap][i];
	}
	else if(!leap && daytab[1][month] <= day && year>0 && 1<=month<=12){
		for (i = 1; i < month; i++)
			day += daytab[leap][i];
	} else {
		fprintf(stderr, "year>0 and 1<month<12, day not appropriate");
	}
	
	return day;
}

/* month_day: set month, day from day of year */
void month_day(int year, int yearday, int *pmonth, int *pday) {
	int i, leap;
	leap = (year%4 == 0 && year%100 != 0) || year%400 == 0;
	if(year>0 && 1<=yearday<=365){
		for (i = 1; yearday > daytab[leap][i]; i++)
			yearday -= daytab[leap][i];
		*pmonth = i;
		*pday = yearday;
	} else if (year>0 && yearday==366 && leap){
		for (i = 1; yearday > daytab[leap][i]; i++)
			yearday -= daytab[leap][i];
		*pmonth = i;
		*pday = yearday;
	} else {
		fprintf(stderr, "year >0 , 1<=yearday<=365");
	}
	
}

/* month_name: return name of n-th month */
char *month_name(int n) {
	static char *name[] = {
		"Illegal month",
		"January", "February", "March",
		"April", "May", "June",
		"July", "August", "September",
		"October", "November", "December"
	};

	return (n < 1 || n > 12) ? name[0] : name[n];
}

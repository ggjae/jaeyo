#include <stdio.h>
#include <algorithm>

using namespace std;

int num[9]={1,8,3,5,6,7,4,2,9};

int main(){
	std::sort(num,num+9);
	for (int i=0;i<9;i++){
		printf("%d",num[i]);
	}
}

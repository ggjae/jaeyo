#include <stdio.h>
#include <algorithm>
using namespace std;
int main(){
	int a[1001];
	int b[1001];
	int N;
	int temp[1001];
	scanf("%d",&N);
	for(int i=0;i<N;i++){	
		scanf("%d",&a[i]);
	}
	for(int p=0;p<N;p++)
		temp[p] = a[p];
	sort(temp,temp+N);
	
	for(int j=0;j<N;j++){
		printf("%d ",a[j]);
		printf("%d ",temp[j]);
	}
	
	
	return 0;
}

#include <stdio.h>

void main(){
	int N,S;
	scanf("%d", &N);
	for(int i=0; i<N; i++){
		scanf("%d",&S);
	}
	if(S%10==0){
		printf("Yes");
	}
	else{
		printf("No");
	}
}
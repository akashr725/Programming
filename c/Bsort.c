#include<stdio.h>

int main(){

    // sorting in ascending order

int n,i,j,temp;

printf("Enter the size of an array:..");
scanf("%d",&n);

int arr[n];

printf(" \nEnter the element of an array:..");

for(i =0; i<n; i++){
     scanf("%d",&arr[i]);
}


for(i=0; i<n; i++){
    for(j=i+1; j<n; j++ ){

        if(arr[i]>arr[j]){
            temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }

    }
}


printf("Sorting element is:");

for(i =0 ; i<n; i++){
    printf("%d ",arr[i]);
}

return 0;

}
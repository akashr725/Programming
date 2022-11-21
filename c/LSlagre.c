#include<stdio.h>

int main(){

int n,i,largest,SecLargest;



printf("Enter the size of an array:..");
scanf("%d",&n);

int arr[n];


printf(" \nEnter the element of an array:..");

for(i =0; i<n; i++){
     scanf("%d",&arr[i]);
}

largest = arr[0];

SecLargest= arr[1];


for(i =0; i<n; i++){


    if(arr[i]>largest){

        SecLargest = largest;

        largest = arr[i];
    }

    else if (arr[i]>SecLargest && arr[i]!=largest)
    {
        /* code */

        SecLargest = arr[i];
    }

   


 
    
}


 printf("Largest = %d, SecLargest = %d",largest,SecLargest);

   return 0;



}
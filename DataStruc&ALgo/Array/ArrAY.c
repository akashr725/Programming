#include<stdio.h>


void insertValue(int arr[],int n, int k, int ln,int p){
    if(ln>=n){
        printf("You dont have enogh space");
      
    }
        for(int i = ln-1; i >= p; i--){
            arr[i+1] = arr[i];
         }
         arr[p] = k;

   printf("After inserted value array is :");

   for(int i = 0; i < ln; i++){
    printf("%d ",arr[i]);
   }

}

int posiTion(int arr[],int k,int ln){

   for(int i = 0; i < ln; i++){
    if(arr[i]<=k && arr[i+1]>=k){
        return i+1;
    }
    
   }

   return -1;
}

void userInput(){
    int n,k;
    printf("Enter the array size: ");
    scanf("%d",&n);

    int arr[n];
    int lnt = n/5;
    printf("Enter the sorted element of an  array: ");
    for(int i = 0; i < lnt; i++){

        scanf("%d",&arr[i]);
    }

     printf("The sorted elements are : ");
    for(int i = 0; i < lnt; i++){

        printf("%d ",arr[i]);
    }

    printf("\nEnter the element you want to insert: ");

    scanf("%d",&k);

    int pos = posiTion(arr,k,lnt);

    lnt++;

    insertValue(arr,n,k,lnt,pos);

    

    
}

int main(){

    userInput();

    return 0;

}
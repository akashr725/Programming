#include <stdio.h>

int main()
{

int a;

printf("Enter the size of array  \n");
scanf("%d",&a);

int arr[a];
printf("Enter the %d element of array  \n",a);

for(int i = 0; i < a; i++){

    scanf("%d",&arr[i]);
}

int max = arr[0];
for(int i = 1; i < a; i++){

    if(max<arr[i]){
        max = arr[i];
    }
}

printf("The max element is = %d ",max);





return 0;
}
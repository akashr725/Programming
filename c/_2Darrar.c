#include<stdio.h>

// 2D Array

void main(){

  int m,n,i,j;

  printf("Enter the size of an array: ");

  scanf("%d %d",&m,&n);  // input size from user

  int arr[m][n];  // declare the size of an array
     
      

  for(i=0; i<m; i++){
    for(j=0; j<n; j++){

        printf("The Element of an array [%d][%d] is: ",i,j);

        scanf("%d",&arr[i][j]);  // input array element from the user
    }
  }


  printf("\n Printing Element is :  \n");


  for(i=0; i<m; i++){

    printf("\n");
    for(j=0; j<n; j++){

        printf("%d\t",arr[i][j]);
    }
  }

  printf("\n");



  printf("Enter the size of an array: ");

  scanf("%d %d",&m,&n);  // input size from user

  int arr2[m][n];  // declare the size of an array
     
      

  for(i=0; i<m; i++){
    for(j=0; j<n; j++){

        printf("The Element of an array [%d][%d] is: ",i,j);

        scanf("%d",&arr2[i][j]);  // input array element from the user
    }
  }


  printf("\n Printing Element is :  \n");


  for(i=0; i<m; i++){

    printf("\n");
    for(j=0; j<n; j++){

        printf("%d\t",arr2[i][j]);
    }
  }

   printf("\n The Addition of matrix  is :  \n");


  int res[m][n];


  for(i=0; i<m; i++){

    printf("\n");
    for(j=0; j<n; j++){

         res[i][j]=arr[i][j]+arr2[i][j];

        printf("%d\t",res[i][j]);
    }
  }

}
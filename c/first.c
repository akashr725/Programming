#include <stdio.h>
int main()
{

int marks;

printf("Enter the marks ..");

scanf("%d",&marks);

if(marks >= 420){
    printf("First Division..");
}
else if(marks >= 315 && marks < 420){
    printf("Second Division..");
}
else if(marks >= 175 && marks < 315){
    printf("Third Division..");

}

else{
     printf("you are fail...");
}

    return 0;
}


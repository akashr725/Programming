#include<stdio.h>
#include<stdlib.h>

int main(){

    char str[100];
    int i,words =0;

    printf("Enter the String: \n");
    gets(str);

    for(i =0; str[i] != '\0'; i++){

        if(str[i]==' ' && str[i+1]!=' '){
            words++;
        }

        
    }

    printf("Total number of string = %d",words);

return 0;
}
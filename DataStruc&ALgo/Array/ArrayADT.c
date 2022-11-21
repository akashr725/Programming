#include<stdio.h>
#include<stdlib.h>


struct myArrayADT
{
   

    int total_size;
    int use_size;
    int *ptr;
};


void createArray(struct myArrayADT *a,int tSize,int uSize){

    (*a).total_size = tSize;
    (*a).use_size = uSize;
    (*a).ptr = (int *)malloc(tSize * sizeof(int));
}

void setValue(struct myArrayADT *a){
    
    int n;
    for(int i =0; i < (*a).use_size; i++){

        printf("Enter the element of %d: ",i);
       
        scanf("%d",&n);

        (*a).ptr[i] = n;

    }
}
void showValue(struct myArrayADT *a){
   
    for(int i =0; i < (*a).use_size; i++){

        printf("%d ", (*a).ptr[i]);

    }
}


int main(){

    struct myArrayADT marks;

    createArray(&marks,20,4);

    setValue(&marks);
    showValue(&marks);


    


    return 0;
}
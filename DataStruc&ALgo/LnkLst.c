#include<stdio.h>
#include<stdlib.h>

struct LnkLst
{
    int data;
    struct LnkLst* next;
     
} *head,*ptr,*test,*test1;

void insert(int n){
    head =0,test=0;
  do{
    ptr =(struct LnkLst*)malloc(sizeof(struct LnkLst));
    printf("Enter the data: ");

    scanf("%d",&ptr->data);

    ptr->next=0;
    if(head==0){
        head = ptr;
        test = head;
    } 

    else{
        test->next = ptr;
        test = ptr;
    }
    n--;
  }while (n!=0);
  
  
}

void printData(){
    test1 = head;
 do{
    if(test1==0){
        printf("List id empty");
    }
    else{
        printf("%d ",test1->data);
        test1 = test1->next;
    }
 }while (test1->next!=NULL);

   printf("%d ",test1->data);
 
}

int main(){
    int n;
     printf("Enter the data: ");

    scanf("%d",&n);

    insert(n);
    printData();

    return 0;
}

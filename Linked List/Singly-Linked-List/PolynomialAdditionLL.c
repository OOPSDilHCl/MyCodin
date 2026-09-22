//Polynomial Addition using Linked List.
#include <stdio.h>
#include <stdlib.h>
struct Node{
  int coeff,power;
  struct Node* next;
};
struct Node* createNode(int ,int );
struct Node* addPolynomial(struct Node* head1, struct Node* head2){
  struct Node* temp1=head1,*temp2=head2;
  struct Node* dummy=createNode(0,0);
  struct Node* temp=dummy;
  while(temp1!=NULL && temp2!=NULL){
    if(temp1->power>temp2->power){
      temp->next=temp1;
      temp=temp1;
      temp1=temp1->next;
    }
    else if(temp2->power>temp1->power){
      temp->next=temp2;
      temp=temp2;
      temp2=temp2->next;
    }
    else{
  temp1->coeff=temp1->coeff+temp2->coeff;
      if(temp1->coeff!=0){
        temp->next=temp1;
        temp=temp1;
      }
      temp1=temp1->next;
      temp2=temp2->next;
    }
  }
  if(temp1!=NULL){
    temp->next=temp1;
  }
  if(temp2!=NULL){
    temp->next=temp2;
  }
  return dummy->next;
}
struct Node* createNode(int c,int p){
  struct Node* newNode=malloc(sizeof(struct Node));
  newNode->coeff=c;
  newNode->power=p;
  newNode->next=NULL;
  return newNode;
}
void printList(struct Node* head){
  if(head!=NULL){
    struct Node* curr=head->next;
printf("%dx^%d",head->coeff,head->power);
    while(curr!=NULL){
        printf("+%dx^%d",curr->coeff,curr->power);
        curr=curr->next;
    }
    printf("\n");
  }
}
int main(){
  struct Node* head1=createNode(5,2);
  head1->next=createNode(4,1);
  head1->next->next=createNode(2,0);
  struct Node* head2=createNode(-5,1);
  head2->next=createNode(-5,0);
  struct Node* head=addPolynomial(head1,head2);
  printList(head);
}
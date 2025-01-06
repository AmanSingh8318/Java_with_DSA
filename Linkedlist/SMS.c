#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void create();
// void insert_spec();
void insert_begin();
void insert_end();
void delete_begin();
void delete_end();
void display();
struct node
{
    int roll_no;

    char  name[100] ;
    struct node *next;
    };
    typedef struct node t;
    t *start,*temp,*n ,*ptr;
    void main()
    {
        int choice ,ch;
        do{
            printf("Welcome in Student Management System\n");
            printf("Enter your choice\n");
            printf("Press 1  for Student data\n");
            printf("press 2  for Display\n ");
            printf("Press 3 for insert at begin\n");
            printf("Press 4 for insert at end\n");
            printf("Press 5 for insert at specified position\n");
            printf("Press 6 for delete at begin \n");
            printf("Press 7 to delete at end\n");
            printf("Press 8 to delete the element at specified position\n");
            scanf("%d",&choice);
            switch(choice)
            {
                case 1:
                create();
                break;
                case 2:
                display();
                break;
                case 3:
                insert_begin();
                break;
                 case 4:
                insert_end();
                 break;
                 case 5:
                //  insert_spec();
                 break;
                 case 6:
                 delete_begin();
                 break;
                 case 7:
                 delete_end();
                 break;
                 case 8:
                 delete_spec();
                 break;
                  default:
                printf("Invalid Inputs");
            }
            printf("Press 1 for continue\n");
            scanf("%d",&ch);

        } while(ch==1);
        getch();
    }    
          void create()
          {
            printf("Enter the Student Roll no\n");
            n=(t*)malloc(sizeof(t));
            scanf("%d",&n->roll_no);       
            printf("Enter the Student Name\n");
            scanf("%s",&n->name);
            if(start==NULL)
            {
                start=temp=n;
            }
            else
            {
                temp->next=n;
                temp=n;
            }
            temp->next=NULL;
            }
             
             void display()
             {
                temp=start;
                printf("ROLL NO         STUDENT NAME\n");
                while(temp!=NULL)
                {
                    printf("%d\t\t", temp->roll_no);
                    printf("%s\n",temp->name);
                    temp=temp->next;
                }
             }

             void insert_begin()
             {
                printf("Enter the student  data to insert at begin \n");
                n=(t*)malloc(sizeof(t));
                scanf("%d",&n->roll_no);
                printf("enter the student name");
                scanf("%s",&n->name);
                 if(start==NULL)
                {
                  //  start=temp=n;
                  printf("overflow");
                  return ;
                }
                else
                {
                    n->next=start;
                    start=n;
                }
             }
             


             void insert_end()
             {
                
                printf("Enter the student  data to insert at end \n");
                n=(t*)malloc(sizeof(t));
                scanf("%d",&n->roll_no);
                printf("enter the student name");
                scanf("%s",&n->name);
                if(start==NULL)
                {
                    start=temp=n;
                    return ;
                }
                temp=start;
                while(temp->next!=NULL)
                {
                    temp=temp->next;
                }
                    temp->next=n;
                    n->next=NULL;
                
             }
             
                        void delete_begin()
                        {

                            if(start==NULL)
                            {
                                printf("Overflow");
                            }
                            else{
                                temp=start;
                                start=start->next;
                                    free(temp);
                            }
                            
                        }
              
        void delete_end()
        {
            if(start==NULL)
            {
                printf("underflow\n");
            }
            else {
                temp=start;
                while(temp!=NULL && temp->next!=NULL)
                {
                    ptr=temp;
                    temp=temp->next;
                }
                ptr->next=NULL;
                free(temp);
            }
        }
                    void delete_spec()
                    {
                        int i,loc;
                        if(start==NULL)
                        {
                            printf("Undeflow");
                        }
                        else
                        {
                            printf("Enter the location to delete the data\n");
                            scanf("%d",&loc);
                            for(i=0;i<loc;i++)
                            {
                         temp=start;
                              
                            temp=temp->next;

                         }
                         ptr->next=temp->next;
                         free(temp);

                        }
                    }
                    
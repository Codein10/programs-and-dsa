import javax.xml.crypto.Data;

import org.w3c.dom.Node;

public class Linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

//add element begining in the linked list

    public  void addfirst(int data){
    //creating node
   Node newNode=new Node(data);
   size++;
   if(head==null){
    head=tail=newNode;
    return;
   }
   //new node next in head value
   newNode.next=head;
   //now new node is head
   head=newNode;
}

//add element in last in the linked list
public  void addlast(int data){
    Node newNode=new Node(data);
    size++;
    if (head==null) {
        newNode=head=tail;
        return;
    }
    tail.next=newNode;
    tail=newNode;

}
//add element in midle of the linked list
public void addmidle(int idx,int data){
    if (idx==0) {
        addfirst(data);
        return;
    }

    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while (i<idx-1) {
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}
public void print(){
   Node temp=head;
   while (temp!=null) {
    System.out.print(temp.data+"-->");
    temp=temp.next;
   }
   System.out.println("null");
}
//remove from linked list
//first remove
public int removefirst(){
    if(size==0){
        System.out.println("linked list is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
}
public int removelast(){
    if (size==0) {
        System.out.println("linked list is empty");
        return Integer.MIN_VALUE;

    } else if (size==1) {
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    //make previous data
    Node prev=head;
    for(int i=0;i<size-2;i++){
     prev=prev.next;
    }
    //make tail data
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
}

//search key in linked list itretive method

public int  itrsearch(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;

    }//key is not found
    return -1;
}
//srearch key using recursive method
public int helperfun(Node head,int key){
    if (head==null) {
        return-1;
    }
    if (head.data==key) {
        return 0;
    }
    int idx=helperfun(head.next, key);
    if (idx==-1) {
        return-1;
    }
    return idx+1;
}
public int recsearch(int key){
    return helperfun(head, key);

} 
//reverse Linkedlist iterative
public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;

}
//find and remove nth node from end
public void deletnthfromend(int n){
 //calculate size    
 int size=0;
 Node temp=head;
while(temp!=null){
    temp=temp.next;
    size++;
}
if (n==size) {
    head=head.next;
    return;
}
int i=1;
int itofind=size-n;
Node prev=head;
while(i<itofind){
    prev=prev.next;
    i++;
}
prev.next=prev.next.next;
return;


}

//check Linkedlist is pelindromo

public Node findmid(Node head){
    Node slow=head;
    Node fast=head;
    while (fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

//pelindromo 
public boolean pelindromo( Node head){
    if (head==null||head.next==null) {
        return true;
    }
    Node mid=findmid(head);
    //reverse second half
    Node curr=head;
    Node prev=null;
    while (curr!=null) {
        Node next=curr.next;
        curr.next =prev;
        prev=curr;
        curr= next;    
    }
     Node right=prev;
     Node left=head;
//step three check left half and right half
while (right!=null) {
     if (left.data!=right.data) {
        return false;
    }
    left=left.next;
    right=right.next;
}
return true;
}
//detect loop in /cycle in likedlist
public static boolean checkloop(){
Node slow=head;
Node fast=head;
while (fast!=null&&fast.next!=null) {
    slow=slow.next;
    fast=fast.next.next;
    if (slow==fast) {
        return true;
    }
}
return false;
}
//remove loop from linked list
//check cycle
public void remocycl(Node head){
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while (fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            cycle=true;
            break;
        }
    }
    if (cycle==false) {
        return;
    }
    //find meeting point
    slow =head;
    Node prev=null;
    while (slow!=null) {
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }
    prev.next=null;
}

//merge sort on linkedlist

private Node getmid(Node head){
    //mid calculaiton
     Node slow =head;
     Node fast=head;
    while (fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
private Node merge(Node head1,Node head2){
    Node mergedll=new Node(-1);
    Node temp=mergedll;
    while (head1!=null&&head2!=null) {
        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
          
        }}
    while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
}
return mergedll.next;
}
public Node mergesort(Node head){
    if (head==null||head.next==null) {
      return head;  
    }
    //find mid
    Node mid=getmid(head);
    //left & right ms
    Node righthead=mid.next;
    mid.next=null;
    Node newleft=mergesort(head);
    Node newright=mergesort(righthead);
    //merge
    return merge(newleft,newright);
}


    public static void main(String[] args) {
      Linkedlist ll=new Linkedlist();
      ll.addfirst(5);    
      ll.addfirst(4);
     ll.addfirst(3);
     ll.addfirst(2);
      ll.addfirst(1);
      ll.print();
      ll.mergesort(head);
      //ll.head=ll.mergesort(head);
     // ll.print();
      //ll.print();
      //ll.addmidle(2, 9);

      //creat loop
    // head=new Node(1);
    // head.next=new Node(2);
    // head.next=
    // head.next.next=new Node(3);
     //head.next.next.next=temp;
    // head.next=new Node(5);
    // ll.checkloop();
 //   System.out.println(checkloop());  
     // ll.print();
     // System.out.println(size);
     // ll.removefirst();
     // ll.print();
      
    // ll.removelast();
     //ll.print();
    // System.out.println(size);
     
  //  System.out.println(ll.itrsearch(4));

   // System.out.println(ll.recsearch(5));
   // ll.reverse();
   // ll.print();
  // ll.deletnthfromend(3);

// ll.pelindromo(head);
   //ll.print(ll.pelindromo());
//ll.print();
    }
}

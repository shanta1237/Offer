package Shishir;

public class Week2 {
    int size=0;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    Node head=null;
    Node tail=null;
    public void addNode(int data){
        size++;
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
//            Node current=head;
//            while(current.next!=null){
//                current=current.next;
//            }
//            current.next=newnode;
        }
    }

    public void printlist(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public Node linkedlist(){
        Node current=head;

        return current;
    }
    //if initial pos is 0
    public int getDataAtAnyPos(int pos){
        Node current=head;
        for(int i =1;i<pos;i++){
            current = current.next;
        }
        return current.data;
    }
    //if initial pos is 1
//    public int getdataatAnypos(int pos){
//        Node current=head;
//        for(int i =2;i<=pos;i++){
//            current = current.next;
//        }
//        return current.data;
//    }
    public void mergelists(Week2 l1){
        if (head==null) {
            head=l1.head;
        }
        else {
            Node current=head;
            while(null != current.next) {
                current=current.next;
            }
            current.next=l1.head;
        }
    }
    public void sort() {
        Node current=head;
        Node index=null;
        int temp;
        if (head==null) {
            return;
        }
        else {
            while (current != null) {

                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    public int sumcheck(Node list){
        int sum=0;
        Node current=list;
        while(current.next!=null){

            sum=sum+current.data;
            current= current.next;


        }

        System.out.println(sum);
        return sum;
    }
    public void removeDataAtAnyPos(int pos) {
        if(pos>size){
            System.out.println("index out of bound");
        }
        else if (pos == 1) {
            size--;
            Node temp = head;
            head = temp.next;
            temp.next = null;
        }
        else {
            Node current = head;
            size--;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            if (current.next == tail) {
                Node temp = current.next;
                current.next = temp.next;
                tail = current;
            } else {
                Node temp = current.next;
                current.next = temp.next;
                temp.next = null;
            }

        }
    }

}

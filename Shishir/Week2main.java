package Shishir;


public class Week2main {
    public static void main(String[] args){
        Week2 list=new Week2();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.linkedlist();
//        list.printlist();
        Week2 lost=new Week2();
        lost.addNode(90);
        lost.addNode(40);
        lost.addNode(70);


        Week2 lest=new Week2();
        lest.mergelists(list);
        lest.mergelists(lost);

        lest.sort();

        lest.printlist();
        lest.sumcheck(lest.linkedlist());


    }
}

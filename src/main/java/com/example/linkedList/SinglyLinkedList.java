package com.example.linkedList;

public class SinglyLinkedList {

   public static int length = 0 ;
   public Node head ;

    /**
     * <b>Node : </b>It contain <b>Data</b> and <b>pointing to next Node / Hold address of next Node</b> .
     */
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data=data ;
            length++ ;

        }
    }

    /**
     *{@link #display()} : This method is for display all data in <b>Linked-List</b>
     */
    public void display(){
        Node temp =head ;

        System.out.print("[");
        while (temp != null){
            System.out.print(temp.data+" ,");
            temp=temp.next ;
        }
        System.out.print("]");
    }

    public void recursive_Display(){
        System.out.print("[");
        recursiveDisplay(head) ;
        System.out.print("]\n");
    }

    /**
     * {@link #recursiveDisplay(Node)} :this method display all method in LinkedList using "Recursive Function" <br/>
     *
     * <b>Note :</b> If Recursive Function <b>"travers a Linked-List Once"</b> then Time-Complexity = O(n+1) means O(n)
     *
     * @param node
     */
    private void recursiveDisplay(Node node){
        if (node != null){
            System.out.print(node.data+",");
            recursiveDisplay(node.next);
        }
    }

    /**
     * {@link #findMaxValue()} : Finding the Minimum Value in LinkedList using <b>Loop</b>
     * @return int
     */
    public int findMaxValue(){
        int min = Integer.MIN_VALUE;
        Node temp=head ;
        while (temp != null){

            if (temp.data>min){
                min=temp.data ;
            }

            temp=temp.next ;
        }

        return min;
    }


    public int find_max_value_Recursive(){
       return findMaxValueRecursive(head) ;
    }

    /**
     * {@link #findMaxValueRecursive(Node)}:  Finding the Minimum Value in LinkedList using <b>Recursion</b>
     * @param node
     * @return int
     */
    private int findMaxValueRecursive(Node node){

        int x = 0 ;

        if (node == null){
            return Integer.MIN_VALUE ;
        }else{

            x= findMaxValueRecursive( node.next );

            return x>node.data ? x : node.data ;


        }
    }




    /**
     * {@link #findMinValue()} : Finding the Minimum Value in LinkedList using <b>Loop</b>
     * @return int
     */
    public int findMinValue(){
        int min = Integer.MAX_VALUE;
        Node temp=head ;
        while (temp != null){

            if (temp.data<min){
                min=temp.data ;
            }

            temp=temp.next ;
        }

        return min;
    }


                                         /* Searching */

    /**
     * Note : <b>Only Linear Search can perform in Linked-List</b>
     * Note : <b> Binary Search can-not</b> perform in <b>Linked-List</b>
     */


    public boolean search(int key){
        Node temp=head ;

        while (temp!= null){
            if(temp.data==key){
               return true;
            }
            temp=temp.next;
        }
        return false;
    }


    /**
     * inserting :
     *
     * There are 2 possibility
     * 1st , add data at first of node means '0 - index' ,
     * 2nd , add data at any-index of node means 'n-index'
     *
     */

    public void insert(int index,int data){

        /**
         * This is 1st Step , if we insert data in '0-index' of 'first-index'
         * then we show take 3 simple step
         * 1. create a 'New Node' with data
         * 2.linking the 'head' with 'New Node'
         * 3. change the 'head' with 'New Node'
         */
        if(index==0){
            Node newData = new Node(data) ;
            newData.next=head ;
            head=newData;
        }else{

            /**
             * This is 2nd Step , if we insert data in 'Any-index' of 'n-index'
             * then we show take 3 simple step
             * 1. create a 'New Node' with data
             * 2. if 'index' is n then we show loop 'n-1' to get actual 'Node'
             * 2.linking the 'head' with 'New Node'
             * 3. change the 'head' with 'New Node'
             */

            Node newData = new Node(data) ;
            Node temp =head ;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next ;
            }

            newData.next=temp.next ; //----
                                    // these two line is Very Important
            temp.next=newData ;    // -----



        }

    }

}

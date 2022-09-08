package com.example.linkedList;

import com.example.linkedList.SinglyLinkedList.Node ;
public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList() ;

        // Here we created Nodes

        Node first = new Node(1);
        Node second = new Node(2) ;
        Node third = new Node(-9) ;
        Node fourth = new Node(16);

        // Now Setting Head in Linked-List

        /**
         *          list.head
         *             |
         *             |
         *         +----+------+
         *         | 1  |  o-------->
         *         +----+------+
         */

        list.head=first ; // <-- Here we setting up "Head"


        /**
         *          list.head        second
         *             |                |
         *             |                |
         *         +----+------+     +----+------+
         *         | 1  |  o-------->| 2  |  o-------->
         *         +----+------+     +----+------+
         */

        first.next=second ; // liking "First-Node" with "Second-Node"


        /**
         *          list.head        second              third
         *             |                |                  |
         *             |                |                  |
         *         +----+------+     +----+------+     +----+------+
         *         | 1  |  o-------->| 2  |  o-------->| -9 |  o-------->
         *         +----+------+     +----+------+     +----+------+
         */

        second.next=third ; // liking "Second-Node" with "Third-Node"


         /**          list.head        second              third            fourth
         *             |                |                  |                   |
         *             |                |                  |                   |
         *         +----+------+     +----+------+     +----+------+      +----+------+
         *         | 1  |  o-------->| 2  |  o-------->| -9 |  o--------> | 16 |  null
         *         +----+------+     +----+------+     +----+------+      +----+------+
         */

        third.next=fourth; // liking "Third-Node" with "Fourth-Node"





        //list.display(); // <-- Node display all elements (using while loop)


        list.recursive_Display(); // <-- Node display all elements (using while Recursive)


       int max_element= list.findMaxValue() ;// <-- finding the Maximum Value inside linked-list (using while loop)
      // System.out.println(" Max-Element : "+max_element);

       int max_element_recursively= list.find_max_value_Recursive(); // <-- finding the Maximum Value inside linked-list (using Recursively)
      // System.out.println(" Max-Element Recursively :  "+max_element_recursively);

       int min_element= list.findMinValue() ;// <-- finding the Minimum Value inside linked-list (using while loop)
      // System.out.println(min_element);

       list.insert(0,30);
       list.display();
       list.insert(3,53);
        list.display();
    }
}

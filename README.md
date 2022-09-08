
### DS & Algo Recap 

#### What is Data-Structure ?
**Ans :** Data-Structure means arrangement of Data and **efficient operations** on 
data inside the Main-Memory when the program is executing .

#### What is Time-Complexity ?
**Ans :** To execute a block of code , how many times is taken is called Time-Complexity .
It can represent as O(n) , Ω(n) , θ(n)

#### What is Space-Complexity ?
**Ans :** To execute a block of code , how many space is taken is called Space-Complexity .
It cas represent as O(n) , Ω(n) , θ(n)

<Hr/>


#### What is Recursion ?
**Ans :** When a function is called it-self then that function is called **Recursion** .

>Note 1: Recursion always used **Stack**

>Note 2: Recursive Function is always **Memory Consuming Function**


##### Basic term of Recursive Function :

**What is Recursive-Call ?**

**Ans :** Just see the Example 

```
    private static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1); // This is called 'Recursive-Call' of fun(int n) .
        }
    }

    public static void main(String[] args) {
        fun(3);
    }

```


##### Types of Recursive Functions : 

- Tail Recursion
- Head Recursion
- Tree Recursion
- Indirect Recursion
- Nested Recursion


**What is `Tail-Recursion` ?**

**Ans :** If **Recursive-Call** is the **Last-Statement** of a Recursive Function then that Recursive Function called TailRecursion

**Example :** 

```
 private static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1); // This is called 'Recursive-Call' and this 'Recursive-Call' is 'Last Statement' of fun(int n) so it is Tail-Recursion
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
```

> `Note :` Which Recursive Function is **not `Tail-Recursion`** ?

**Ans :** In Recursive function , If **Recursive-Call** is the **Last-Statement** of a Recursive Function
and **Extra operation (eg: Addition , minus , or-something else)**
is performing with that **Recursive-Call** then the function **not `Tail-Recursion`**


```
    private static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1) * 3 ; // This is Not Tail-Recursion because extra (* 3 ) operation is added 
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
```
 
 


**What is `Head-Recursion` ?**

**Ans :**  This Opposite of `Tail-Recursion` and `condition of Tail-Recusion` is same as `Head-Recursion`

`Example :`

```
 private static void fun(int n){
        if (n>0){
            fun(n-1); // This is called 'Recursive-Call' and this 'Recursive-Call' is 'First Statement' of fun(int n) so it is Head-Recursion
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        fun(3);
    }

```

What is `Tree- Recursion` ?

**Ans :** Which Recursive Function calling itself more than 1 time means More than 1 **Recursive-Call** present in that Recursive Function  is called `Tree- Recursion`

`Example :`

```
  private static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1); // -----+
                         //      |  ----- See this "Recursive-Call" appears more than 1 time that's is Tree Recustion
            fun(n-1); // -----+

        }
  }

  public static void main(String[] args) {
        fun(3);
  }

```

What is `Indirect- Recursion` ?

**Ans :** More than 1 function calling Each-Other in a Circular Manner is Called **Indirect-Recursion**

```
 
static void funA (int n){
    if( n > 0){
        System.out.println(n);
        funB(n-1) ;  //  ---------------+
    }               //                  | calling eachother
 }

static void funB (int n){

    if( n > 1){
        System.out.println(n); //       | calling eachother
        funA( n/2 ) ; // ----------------+
    }

}

```

What is `Nested- Recursion` ?
 **Ans :** A recursive function passed as `parameter` of **Recursive-Call** then it called `Nested- Recursion` .

```

int fun (int n){
    if( n > 100) {
        return n-10 ;
    }else{
        return fun ( fun(n+11)) ; <-- see here you can realized .
    }
 }   

```

<Hr/>

## Array :

#### We will analyse 2 things 
- Searching
- Sorting 

   <h3 style="text-align:center">  Searching   </h3>

There are mainly **2 Types** of Searching Technique
- Linear Search
- Binary Search

####  Linear Search :

**Linear Search**  means simple searching Technique . 

```
    private static boolean search(int[] arr , int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) return true;
        }
        return false ;
    }

    public static void main(String[] args) {
        search(new int[]{1,3,9,2,4,7,0}, 4);
    }

```

Time Complexity
- Best Case : O(n)
- Avg Case :  O(n) [All Possible Cases : ( n + 1) / 2]
- Worst Case : O(1) `note:` **in DS & Algo ( weather it is `searching` , `sorting` , `graph` , `tree` ... `whatever` ) Most case we always analyse worst case**


#### Binary Search :

> `Note :`
> - For performing Binary Search , Condition is **The array/List should be Sorted** 
> - Binary Search , is **not checking Every Element**

**Example :**

`Using Loop :`

``` 

 private static int usingLoopBinarySearch(int[] arr , int key ){

        int l=0 , r=arr.length-1  ;  // arr =[ 1, 3, 5, 7, 9, 11 ,13]

        int mid ;                    //        l         mid       r    ( 'l' means 'left' and 'r' means 'right' )

        while (l <= r){

            mid= (r+l)/2 ;

            if (key == arr[mid]) return arr[mid] ;

            if (key < arr[mid]) { r = mid - 1; }

            if (key > arr[mid] ){ l=mid+1 ; }
        }

        return -1 ;

    }

```


`Using Recursion :`

```

    private static int usingRecursionBinarySearch(int[] arr, int key  ,  int left , int right ){

        int mid = (left+right)/2;

        if(left <= right) {

            if (key == arr[mid]) return arr[mid];

            if (key < arr[mid]) return usingRecursionBinarySearch(arr, key, left, mid - 1);

            if (key > arr[mid]) return usingRecursionBinarySearch(arr, key, mid + 1, right);
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11 ,13};
        
        int result = usingRecursionBinarySearch(arr,111,0,arr.length-1) ;
        System.out.println(result);
    }

```

Time Complexity
- Best Case : O(1)
- Avg Case :  O(n log n)  

> `sorting` has show after **Linked Lists**


### Linked-List 

<Hr/>

#### Q . Why we will use `Linked-List` instead of Array ?

**Ans :** Array is fixed Sized . It is easy it `insert` , `deletion` instead of Array 


#### difference between `Array` vs `Linked-List` ?

| Topic                                            | Array                                                                 | Linked-List                                                                                                               |
|--------------------------------------------------|-----------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| size                                             | fixed                                                                 | not fixed                                                                                                                 |
| operation (means : addition , insertion , etc .) | add element , removing element these operations are `costly` in array | add element , removing element these operations are `not costly` in Linked-List                                           |
| Searching                                        | `Linear` & `Binary` both **Searching** can performed in **Array**     | **Only** `Linear` **Searching** can perform in **Linked-List** . `Binary-Search` **Can not** performed in **Linked-List** |



#### What is Linked-Lists ? 

**Ans :** Linked-Lists are `Nodes` . Each `Node` contains **data** and Pointing to **Next Node**

> ##### Some terms in Linked-Lists :
> `Head :` **The entry point into a linked list** is called the `head` . 
> 
> `Tails :` **The last node of a linked list** is called the `Tails` .
> 
> `Node :` It contain **Data** and **pointing to next Node / Hold address of next Node** .
>
> `Searching :` `Binary-Search` **Can-not** perform in **Linked-List**


    +---------+-----------------------+ 
    |         |                       |
    |   Data  | Adress of Next Node   |
    |         |                       |
    +---------------------------------+ 
           Simple Diagram of Node



```

public class SinglyLinkedList {

   public Node head ;

    /**
     * <b>Node : </b>It contain <b>Data</b> and <b>pointing to next Node / Hold address of next Node</b> .
     */
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data=data ;

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
        recursiveDisplay(head) ;
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
            System.out.println(node.data);
            recursiveDisplay(node.next);
        }
    }

}



// This Main Function

main(){

SinglyLinkedList list = new SinglyLinkedList() ;

        // Here we created Nodes

        Node first = new Node(1);
        Node second = new Node(2) ;
        Node third = new Node(-9) ;
        Node fourth = new Node(3);

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
         *         | 1  |  o-------->| 2  |  o-------->| -9 |  o--------> | 3 |  null
         *         +----+------+     +----+------+     +----+------+      +----+------+
         */

        third.next=fourth; // liking "Third-Node" with "Fourth-Node"

 
        //list.display(); // <-- Node display all elements (using while loop)


        list.recursive_Display(); // <-- Node display all elements (using while Recursive)

 
}

```






























[//]: # (<h3 style="text-align:center ;">  Sorting  </h3>)

[//]: # (<div/>)

[//]: # ()
[//]: # (> `Note :`)

[//]: # (>There are various Sorting Techniques . Each sorting techniques has own purpose . We )

[//]: # (>can not say that - " xyz sorting Techniques is the best" . )

[//]: # ()
[//]: # (**The Sorting Techniques are :**)

[//]: # ()
[//]: # (- Bubble sort)

[//]: # (- Insertion sort)

[//]: # (- Selection sort)

[//]: # (- Heap sort)

[//]: # (- Merge sort)

[//]: # (- Quick sort)

[//]: # (- Tree sort)

[//]: # (- Shell sort)

[//]: # (- Count sort)

[//]: # (- Bucket / Bin sort)

[//]: # (- Radix sort )



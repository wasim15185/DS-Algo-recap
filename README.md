
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

#### What is Recursion ?
**Ans :** When a function is called it-self then that function is called **Recursion** .

>Note 1: Recursion always used **Stack**

>Note 2: Recursive Function is always **Memory Consuming Function**

##### Basic term of Recursive Function :

**what is Recursive-Call**

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


**What is `Head-Recursion` ?**

**Ans :** 

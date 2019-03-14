package ListDemo;

import java.util.ArrayList;//Utility is a framework which already developed

public class ArrayListDemo {

    //What is the Need of ArrayList Why cant we use Array
    //What is List and ArrayList
    // How to write List
    // Get values from ArrayList
    // Some Operation on List
    // What is Generic in Collection (it is very important Interview question)

    //When we talk about the Array
    //consider Type / Size problem
    //Why we saying problem and why we cant use Array means
    //e.g. If we want to get the data from the Student Application form
    //Then if we use array we have to use many different types of array and limitations
    //for e.g. Student name - String array, Student number - int array, Phone number - Double array
    //To avoid these different types of array we use ArrayList which we can handle all the different type of data
    //also the Size of the array increase gradually but we give fixed size when we use Array to handle the memory

    //To avoid this Size issue Java introduce the concept called COLLECTION

    //Collection - It is a Dynamic Data Structure

    //It added after JAVA 1.5

    //Collections in Java Definition - It is a Framework that provides an architecture
    // to store and manipulate the group of objects
    //Handle by objects means - we don't have to worry about which data type it is - collection handle all as an objects

    //Collection also offers - All the operation that we perform on a data such as
    // Searching, Sorting, Insertion, Manipulation, Deletion etc. can be performed by java Collections

    //Java collection simply means a Single unit of objects

    //Java Collection Framework provides many interfaces
    /* Set
    List
    queue
    Deque etc
     */
    //and classes
    /*
    ArrayList
    Vector
    LinkedList
    PriorityQueue
    HashSet
    LinkedHashSet
    TreeSet etc
     */

    //List - List is an Interface
    //ArrayList - is a class and implements List

    public static void main(String[] args) {

        //What is Array List


        //Java ArrayList is a class uses a dynamic array for storing

        //Java ArrayList is a class can contain or accept duplicate elements (Note: In Set Interface not accept duplicate elements)
        //Java Array List class maintain insertion (means it works as per the Index) order
        //Java ArrayList allows random access because array works at the index basis (so we can call any random value with index)

        //In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occured
        // if any element is removed from the array list
        //for e.g. if we access index[50] - it will go from index 0, 1, 2 .... 50 - so it bit slow
        //for e.g. same time if we remove index[50] value - again it delete and refresh the index order
        //so this is the reason this ArrayList is bit slow especially handling huge amount of data

        ArrayList obj1 = new ArrayList(); //N number of values u can add - there is no limit in Size or Type in this ArrayList

        obj1.add(676767);

        obj1.add("Male");

        obj1.add("Selenium WebDriver");

        obj1.add(1245434.544);

        System.out.println(obj1);

        System.out.println(obj1.get(3));
    }
}

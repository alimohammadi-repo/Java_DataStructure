package ir.mindsheets;

import ir.mindsheets.queue.ArrayQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ArrayQueue arrayQueue=new ArrayQueue(5);

       arrayQueue.add("a");
       arrayQueue.add("b");
       arrayQueue.add("c");
       arrayQueue.add("d");
         
       arrayQueue.print();

       arrayQueue.remove();

       arrayQueue.print();

       arrayQueue.peek();

       arrayQueue.print();
        

    }
}

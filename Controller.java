
package app;

import analyze.DataAnalyzer;
import util.StopWatch;
import java.util.Stack;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

public class Controller {
  
    public static void main(String[] args) {
      
        // create a DataAnalyzer object named dataAnalyzer
        DataAnalyzer dataAnalyzer = new DataAnalyzer();

        // find the first 35 fibonacci numbers
 
        for(int n = 1; n<=8; n++){
            
            // create a Stack object 
            Stack stack = new Stack<>();
            
            // create a StopWatch object
            StopWatch stopWatch = new StopWatch();

            // start the stopWatch
            stopWatch.start();
            
            // find the fibonacci index at n and save the value in fibValue
            // also pass the stack object so it can record the recursive method calls
            
            int fibValue = fib(n,stack);
              
            // create a map object <String, Integer> name map that is
            // constructed using a TreeMap constructor
            Map<String, Integer> map = new TreeMap<>();
            
            // to figure out here how  many times a fib(n) was called and store this 
            // information in the map with fib(m) as the key and the times it was called 
            // as the value for this key
             for(int i=1; i<=n; i++){
                 Iterator<Integer> stackIterator = stack.iterator();
                             int index = 0;
                 while(stackIterator.hasNext()){
                  if(stackIterator.next()==i) {
                      index++;} 
                }//end of while
             map.put("Fib (" + i + ") ",index);
              
           }//end for
            
    
            // stop the stopWatch object
           stopWatch.stop();
            
            // create an ExecutionInfo object name executionInfo
            // with correct inputs for the constructor
            // use stopWatch.getElapsedTime() for the last input
            
            ExecutionInfo executionInfo = new ExecutionInfo(map,n,fibValue,stopWatch.getElapsedTime());
            
            // add the executionInfo object to the dataAnalyzer arraylist
            dataAnalyzer.getData().add(executionInfo);
            
    
 
        }//end of for loop
              
        // run the displayInfo method on each executionInfo object
        for(ExecutionInfo executionInfo: dataAnalyzer.getData()){
            executionInfo.displayInfo();
        }
        
        // call the dataAnalyzer findGrowthRate method
        dataAnalyzer.findGrowthRate();
    }
    
     
    public static int fib(int n, Stack stack){
        stack.push(n);
        
         if(n ==1 ) {
            return 1;}
        if(n ==2 ) {
            return 2;
        }
        
        return fib(n-1,stack) +  fib(n-2,stack);
    }
}
    


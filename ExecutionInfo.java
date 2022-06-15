package app;

import java.util.Map;
import java.util.Set;


public class ExecutionInfo {
    
    private Map<String, Integer> fibMap;
    private int fibIndex;
    private int fibValue;
    private long executionTime;
    private double totalMethodCalls;

    public ExecutionInfo(Map<String, Integer> fibMap, 
                          int fibIndex, 
                          int fibValue,
                          long executionTime) {
        this.fibMap = fibMap;
        this.fibIndex = fibIndex;
        this.fibValue = fibValue;
        this.executionTime = executionTime;
        
          
           Set<String> keySet = fibMap.keySet();
            
           // calculate the totalMethodCalls 
           for(String key: keySet){
               
              totalMethodCalls = totalMethodCalls + fibMap.get(key);  
           
           }
           
    }

    public Map<String, Integer> getFibMap() {
        return fibMap;
    }

    public void setFibMap(Map<String, Integer> fibMap) {
        this.fibMap = fibMap;
    }

    public int getFibIndex() {
        return fibIndex;
    }

    public void setFibIndex(int fibIndex) {
        this.fibIndex = fibIndex;
    }

    public int getFibValue() {
        return fibValue;
    }

    public void setFibValue(int fibValue) {
        this.fibValue = fibValue;
    }

    public double getTotalMethodCalls() {
        return totalMethodCalls;
    }
    
    
    
    public void displayInfo(){
        
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("ExecutionInfo: fib(" + fibIndex + ")" );
        System.out.println("-------------------------------------------");
        System.out.printf("%-20s %-15d\n", "fibIndex:", fibIndex);
        System.out.printf("%-20s %-15d\n", "Fib Value:", fibValue);
        System.out.printf("%-20s %-15d\n", "Method Calls:", (int)totalMethodCalls);
        System.out.printf("%-20s %-15d\n", "Execution Time:", executionTime);
        
        Set<String> keySet = fibMap.keySet();
        
        
        // used the keySet variable to loop throught all the keys to output the following
        //System.out.printf("%-20s %-5d \t %-10.3f\n" , key +":" ,fibMap.get(key), (fibMap.get(key)/ totalMethodCalls));
     
        for(String key: keySet){
          System.out.printf("%-20s %-5d \t %-10.3f\n" , key +":" ,fibMap.get(key), (fibMap.get(key)/ totalMethodCalls));
         
        }

       System.out.println("\n");
    }
 
    
}//end class

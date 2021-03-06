package analyze;

import app.ExecutionInfo;
import java.util.ArrayList;
import java.lang.Math;

public class DataAnalyzer {
    
    private ArrayList<ExecutionInfo> data; 

    public DataAnalyzer() {
        
        data = new ArrayList<>();
    }

    public ArrayList<ExecutionInfo> getData() {
        return data;
    }
    
    public void findGrowthRate(){
          System.out.println("");
          
         System.out.println("-------------------------------------------------");
         System.out.println("Data Analyzer Growth Rate");
         System.out.println("-------------------------------------------------");
         
         for(ExecutionInfo p: data){
            
           System.out.printf("%-3s %-3d %-5s %-10d %-5s %-10d %-8s %-3.3f\n","Index: ",p.getFibIndex(), "Fib value:",p.getFibValue(),
                   "Calls:",(int)p.getTotalMethodCalls(), "Exponent:", 
                  Math.log(p.getTotalMethodCalls()));
            
         }
        

    }
    
}// end class

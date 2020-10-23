import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class OutputSorter {
    public static void OutputSorter(ArrayList<String> AL, ArrayList<String> AL2, String arg1, String arg2){
        try {
            FileWriter f = new FileWriter(new File(arg2)); //instantiated Filewriter for 3rd argument(argv[2])

            f.write(AL2.size()+ " objects in class Obj\n"); //print object count only

            Map<String, Integer> counterMap = new LinkedHashMap<>(); //we shall be using map to count the elements

            for(int i = 0; i < AL.size(); i++){  //for loop is designed to traverse through AL and add values into counterMap as well as map those values to a count
                if(counterMap.containsKey(AL.get(i))){
                    counterMap.put(AL.get(i), counterMap.get(AL.get(i))+1);
                }
                else{
                    counterMap.put(AL.get(i), 1);
                }
            }

            //System.out.println(counterMap); //this should show each unique element of AL and the number count

            ArrayList<String> orderedProperly = new ArrayList<>(); //orderedProperly is the arraylist that will arrange elements of AL in descending frequency

            //using the built in libraries of Maps and Collections, this algorithm starts the sorting process
            counterMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(stringIntegerEntry -> {
                for(int i = 1; i <= stringIntegerEntry.getValue(); i++)
                    orderedProperly.add(stringIntegerEntry.getKey());
            });

            //at this stage, orderedProperly should be ordered in Descending frequency
            //System.out.println(orderedProperly);

            ArrayList<String> clonedOrder = new ArrayList<String>(); // clonedOrdered will contain all the elements of orderedProperly but will remove duplicates
            //this for loop shall only enter unique elements into clonedOrder from orderedProperly
            for(String i: orderedProperly){
                if(!clonedOrder.contains(i)) {
                    clonedOrder.add(i);
                }
            }

            //System.out.println(clonedOrder); //clonedOrder should just be distinct elements only now

            for(String i : clonedOrder){ //for each entry of cloned order, we will be able to print out the total number of elements that matches clonedOrder and orderedProperly
                f.write(Collections.frequency(orderedProperly, i) + " objects of class " + i + "\n");
            }
            //what this essentially does is it prints out a Descending ordered list of all the objects based on highest frequency and the total number of objects of its respective element
            f.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(arg1 + " AND " +arg2 + " HAS BEEN CREATED");
    }
}

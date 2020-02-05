import java.io.*;
import java.util.*;

class answer {
   public static final String delimiter = ",";
   //passing the csv file to the function
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         //reading data 
         BufferedReader br = new BufferedReader(fr);

         String[] line = " ";
         String[] Arr;
         int k=0;
         //take input from csv array file
         //create main array
         //String[] arr1 = new String[]{"a","b","c"};
         // String[] arr2 = new String[]{"i","j"};
        //String[] arr3 = new String[]{"x","y"};
       // String[][] arr ={arr1,arr2,arr3};
        //System.out.println(arr[0][0]); //*
         while((line[k] = br.readLine()) != null) {
            Arr = line[k].split(delimiter);
            StringBuilder so = new StringBuilder();
            int i=0,j=0;
            for(int s=0;s<Arr[k].length();s++) {
            
              // System.out.print(tempStr + " ");
               so.append(Arr[i].charAt(j));
               i++;
               j++;
            }
            System.out.println(so);
            System.out.println();
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
   }
   public static void main(String[] args) {
   // csv file to read
      String csvFile = "Read.csv";
      Solution.read(csvFile);
   }
}
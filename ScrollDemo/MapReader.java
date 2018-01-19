import java.io.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MapReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapReader  
{
    // instance variables - replace the example below with your own
    private String fileName;
    private String path;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    String line = null;
    /**
     * Constructor for objects of class MapReader
     */
    public MapReader()
    {
        fileName = "map.txt";
        path = "";
        try{
            fileReader = new FileReader(fileName);
        } catch(FileNotFoundException err){
            System.out.println(err);
        }
   }
   
   public char[][] readFile(){
       char[][] rtrn;
       bufferedReader = new BufferedReader(fileReader);
       int lineLength = readFirstLine(bufferedReader);
       if(lineLength==0){
       return new char[0][0];
       }
       rtrn = new char[lineLength][lineLength];
       //grrr got to stop but I might need the charMarker as well so need to think about that
   }
   
   private int readFirstLine(BufferedReader bufferedReader){
       try{
           String firstLine = bufferedReader.readLine();
           List<Character> charMarkers = new ArrayList<Character>();
           int charCount = 0;
           char[] firstLineArray = firstLine.toCharArray();
           boolean charMarkersSet = false;
           char firstChar = firstLineArray[0];
           for(char c:firstLineArray){
               if(!charMarkersSet){
                   if(charCount>0 && c!=firstChar){
                       charMarkers.add(c);
                   } else {
                       charMarkersSet = true;
                   }
               } else {
                   int charStep = charCount%charMarkers.size();
                   if(c!=charMarkers.get(charStep)){
                       throw new IOException("Invalid file: character markers not consistent");
                   }
               }
               charCount++;
           }
           return firstLine.length();
      } catch (IOException err){
           System.out.println(err);
      }
      return 0;
    }
}

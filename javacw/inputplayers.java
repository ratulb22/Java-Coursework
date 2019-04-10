import java.io.File;
import java.util.Scanner;
import java.io.FileWriter; 
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class inputplayers {
	public static void main(String[] args) {
    

	  String findWord = null;
    String findWord1 = null;
    String findWord2 = null;
    String findWord3 = null;
    String findWord4 = null;
    String findWord5 = null;
    String findWord6 = null;
    String findWord7 = null;
    String findWord8 = null;
    String filePath = null;


      if( args.length == 10 ){
        findWord = args[0];
        findWord1 = args[1];
        findWord2 = args[2];
        findWord3 = args[3];
        findWord4 = args[4];
        findWord5 = args[5];
        findWord6 = args[6];
        findWord7 = args[7];
        findWord8 = args[8];
        filePath= args[9];

      } else {
        System.out.println( "You need to supply 9 valid arguments" );
        System.exit(1);
      }
	  
	  try(FileWriter fw = new FileWriter("pb1.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter out = new PrintWriter(bw))
      {
      out.println(findWord + "," + findWord1 + "," + findWord2 + "," + findWord3 + "," +findWord4 + "," + findWord5 + "," + findWord6 + "," + findWord7 + "," + findWord8);
      
      

    
    //more code
      
    //more code
      out.close();
      } catch (IOException e) {
    //exception handling left as an exercise for the reader
}
	  
  
	}
}
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;

public class input2 {
	public static void main(String[] args) {

    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = false;
    boolean b4 = false;
    boolean b5 = false;
    boolean b6 = false;
    boolean b7 = false;
    boolean b8 = false;
    boolean b9 = false;

    
    String temp = "";
	  String playerName = "";
    String playerID = "";
    String carrAttempts = "";
    String teamName = "";
    String playerTeamID = "";
    String homeStad = "";
    String homeStr = "";
    String stadTown = "";
    String stadPostcode = "";




      Scanner in = new Scanner (System.in);
      FileWriter fw = new FileWriter("pb1.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter out = new PrintWriter(bw);

    


      




      do {

      if ( b1==false ){
        System.out.println("Please enter Player Name " );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern playerName = Pattern.compile("^[a-zA-Z\\s]*$");
            Matcher playerNameMatcher = playerName.matcher(temp);
            b1 = playerNameMatcher.matches();
            System.out.println(b1);
            if (b1 == false){
                System.out.println("Player Name entry invalid" );
             }else{

             }
        }        

      }      
      
      if ( b2==false ){
        System.out.println("Please enter Player ID " );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolplayerID = Pattern.compile("RFU\\d\\d\\d\\d\\d");
            Matcher playerIDMatcher = playerID.matcher(temp);
            b2 = playerIDmatcher.matches();
            System.out.println(b2);
            if (b2 == false){
                System.out.println("Player ID entry invalid" );
             }else{

             }
        }        

      }

      if ( b3==false ){
        System.out.println("Please enter Player Career Attempts " );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolcarrAttempts = Pattern.compile("\\d+");
            Matcher carrAttemptsMatcher = carrAttempts.matcher(temp);
            b3 = carrAttempts.matches();
            System.out.println(b3);
            if (b3 == false){
                System.out.println("Player ID entry invalid" );
             }else{

             }
        }        

      }     

      if ( b4==false ){
        System.out.println("Please enter Team Name" );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolteamName = Pattern.compile("^[a-zA-Z\\s]*$");
            Matcher teamNameMatcher = teamName.matcher(temp);
            b4 = teamNamematcher.matches();
            System.out.println(b4);
            if (b4 == false){
                System.out.println("Team Name entry invalid" );
             }else{

             }
        }        

      }


      if ( b5==false ){
        System.out.println("Please enter Player Team ID" );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolplayerTeamID = Pattern.compile("[A-Z]{3}\\d{4}");
            Matcher playerTeamIDMatcher = playerTeamID.matcher(temp);
            b5 = playerTeamIDmatcher.matches();
            System.out.println(b5);
            if (b5 == false){
                System.out.println("Team ID entry invalid" );
             }else{

             }
        }        

      }          

      if ( b6==false ){
        System.out.println("Please enter Home Stadium" );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolhomeStad = Pattern.compile("^[a-zA-Z\\s]*$");
            Matcher homeStadMatcher = homeStad.matcher(temp);
            b6 = homeStadmatcher.matches();
            System.out.println(b6);
            if (b6 == false){
                System.out.println("Home Stadium entry invalid" );
             }else{

             }
        }        

      } 

      if ( b7==false ){
        System.out.println("Please enter Home Street" );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolhomeStr = Pattern.compile("^[a-zA-Z\\s]*$");
            Matcher homeStrMatcher = homeStr.matcher(temp);
            b7 = homeStrmatcher.matches();
            System.out.println(b7);
            if (b7 == false){
                System.out.println("Home Street entry invalid" );
             }else{

             }
        }        

      } 

      if ( b8==false ){
        System.out.println("Please enter Player ID" );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolstadTown = Pattern.compile("^[a-zA-Z\\s]*$");
            Matcher stadTownMatcher = stadTown.matcher(temp);
            b8 = stadTownmatcher.matches();
            System.out.println(b8);
            if (b8 == false){
                System.out.println("Stadium Town entry invalid" );
             }else{

             }
        }        

      } 

      if ( b9==false ){
        System.out.println("Please enter Stadium Postcode" );
        temp = in.nextLine();
        if (temp == "exit" | temp == "Exit"){
          System.out.println("Exiting");
          break;
        }else{
            Pattern coolstadPostcode = Pattern.compile("[A-Z]{1}\\d{1}[A-Z]{3}");
            Matcher stadPostcodeMatcher = stadPostcode.matcher(temp);
            b9 = stadPostcodematcher.matches();
            System.out.println(b9);
            if (b9 == false){
                System.out.println("Stadium Postcode entry invalid" );
             }else{

             }
        }        

      } 


    }while (b1 == false|b2 == false|b3 == false|b4 == false|b5 == false|b6 == false|b7 == false|b8 == false|b9 == false);

    if (b == true & b2 == true & b3 == true& b4 == true& b5 == true& b6 == true& b7 == true& b9 == true){
        System.out.println("Saving????");
        out.println(playerName + " " + playerID + " " + carrAttempts + " " + teamName + " " + playerTeamID + " " + homeStad + " " + homeStr + " " + stadTown + " " + stadPostcode);
    }





	    //try(FileWriter fw = new FileWriter("pb1.txt", true);
      //BufferedWriter bw = new BufferedWriter(fw);
      //PrintWriter out = new PrintWriter(bw))
      
      //out.println(PlayerName + "," + PlayerID + "," + CarrAttempts + "," + TeamName + "," +PlayerTeamID + "," + HomeStad + "," + HomeStr + "," + StadTown + "," + StadPostcode);
      

    
      
      

    
    //more code
      
    //more code
      out.close();
      

    //exception handling left as an exercise for the reader

	  
  
	}
}
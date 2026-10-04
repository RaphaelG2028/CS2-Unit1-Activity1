import java.util.Scanner;


public class Main {

   public static void main(String []args) {

// Ms. Dinko teaches the ADJECTIVE Comp-Sci class! She teaches it in PLACE. To effectively
// teach, she VERB. In our ADJECTIVE class we prob learn. When she takes us to PLACE, we
// learn the most and we also VERB. The class might not be the best though... It is also
// described as ADJECTIVE. The students like to sneak off to the PLACE. When they get there,
// they always VERB. The class is amazing for sure though, I would say it's ADJECTIVE, and
// we always learn in our PLACE. Together we will VERB!

      String adjective1 = "best";
      String place1 = "BWL";
      String verb1 = "yells";
      String adjective2 = "fantastical";
      String place2 = "outer space";
      String verb2 = "burp";
      String adjective3 = "preposterous";
      String place3 = "local jail";
      String verb3 = "sing";
      String adjective4 = "perfect";
      String place4 = "school";
      String verb4 = "succeed";

      String sentence1 = "Ms. Dinko teaches the " + adjective1 + " Comp-Sci class! She teaches it in " + place1 + ". To effectively teach, she " + verb1 + "!";
      
      String sentence2 = "In our " + adjective2 + " class we prob learn. When she takes us to " + place2 + ", we learn the most and we also " + verb2 + ".";

      String sentence3 = "The class might not be the best though... It is also described as " + adjective3 + ". The students like to sneak off to the " + place3 + ". When they get there, they always " + verb3 + ".";

      String sentence4 = "The class is amazing for sure though. I would say it's " + adjective4 + ". And we always learn in our " + place4 + ". Together we will " + verb4 + "!";


      System.out.println(sentence1);
      System.out.println(sentence2);
      System.out.println(sentence3);
      System.out.println(sentence4);

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter an adjective: ");
      adjective1 = scan.nextLine();
      System.out.print("Enter another adjective: ");
      adjective2 = scan.nextLine();
      System.out.print("Enter a third adjective: ");
      adjective3 = scan.nextLine();
      System.out.print("Enter a fourth adjective: ");
      adjective4 = scan.nextLine();



   
   }
}

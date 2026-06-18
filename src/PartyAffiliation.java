import java.util.Scanner;
//Class PartyAffiliation
//  main()
//      String partyAffiliation
//      output "Please enter your party affiliation: "
//      input partyAffiliation
//      if (partyAffiliation == "D")
//          output "Donkey"
//      else if (partyAffiliation == "R")
//          output "Elephant"
//      else if (partyAffiliation == "I")
//          output "Person"
//      else
//          output "Other"
//      endif
//  return
//EndClass
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAffiliation;
        System.out.println("Please enter your party affiliation (D, R, I, or other party): ");
        partyAffiliation = in.nextLine();
        if (partyAffiliation.equals("D")) {
            System.out.println("Donkey");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("Elephant");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("Person");
        } else {
            System.out.println("Other");
        }
    }
}


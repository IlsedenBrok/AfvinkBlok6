package aminohashmap;

import java.util.*;
import java.util.Map.Entry;

public class AminoHashmap {

    public static void main(String[] args) {
        HashMap<String, String> oneThreeMap = new HashMap<>();
        oneThreeMap.put("A", "Ala");
        oneThreeMap.put("R", "Arg");
        oneThreeMap.put("N", "Asn");
        oneThreeMap.put("D", "Asp");
        oneThreeMap.put("C", "Cys");
        oneThreeMap.put("Q", "Gln");
        oneThreeMap.put("E", "Glu");
        oneThreeMap.put("G", "Gly");
        oneThreeMap.put("H", "His");
        oneThreeMap.put("I", "Ile");
        oneThreeMap.put("L", "Leu");
        oneThreeMap.put("K", "Lys");
        oneThreeMap.put("M", "Met");
        oneThreeMap.put("F", "Phe");
        oneThreeMap.put("P", "Pro");
        oneThreeMap.put("S", "Ser");
        oneThreeMap.put("T", "Thr");
        oneThreeMap.put("W", "Trp");
        oneThreeMap.put("Y", "Tyr");
        oneThreeMap.put("V", "Val");
        HashMap<String, String> oneNameMap = new HashMap<>();
        oneNameMap.put("A", "Alanine");
        oneNameMap.put("R", "Arginine");
        oneNameMap.put("N", "Asparagine");
        oneNameMap.put("D", "Aspartic acid");
        oneNameMap.put("C", "Cysteine");
        oneNameMap.put("Q", "Glutamine");
        oneNameMap.put("E", "Glutamic acid");
        oneNameMap.put("G", "Glycine");
        oneNameMap.put("H", "Histidine");
        oneNameMap.put("I", "Isoleucine");
        oneNameMap.put("L", "Leucine");
        oneNameMap.put("K", "Lysine");
        oneNameMap.put("M", "Methionine");
        oneNameMap.put("F", "Phenylalanine");
        oneNameMap.put("P", "Proline");
        oneNameMap.put("S", "Serine");
        oneNameMap.put("T", "Threonine");
        oneNameMap.put("W", "Tryptophan");
        oneNameMap.put("Y", "Tyrosine");
        oneNameMap.put("V", "Valine");
        HashMap<String, String> threeNameMap = new HashMap<>();
        threeNameMap.put("Ala", "Alanine");
        threeNameMap.put("Arg", "Arginine");
        threeNameMap.put("Asn", "Asparagine");
        threeNameMap.put("Asp", "Aspartic acid");
        threeNameMap.put("Cys", "Cysteine");
        threeNameMap.put("Gln", "Glutamine");
        threeNameMap.put("Glu", "Glutamic acid");
        threeNameMap.put("Gly", "Glycine");
        threeNameMap.put("His", "Histidine");
        threeNameMap.put("Ile", "Isoleucine");
        threeNameMap.put("Leu", "Leucine");
        threeNameMap.put("Lys", "Lysine");
        threeNameMap.put("Met", "Methionine");
        threeNameMap.put("Phe", "Phenylalanine");
        threeNameMap.put("Pro", "Proline");
        threeNameMap.put("Ser", "Serine");
        threeNameMap.put("Thr", "Threonine");
        threeNameMap.put("Trp", "Tryptophan");
        threeNameMap.put("Tyr", "Tyrosine");
        threeNameMap.put("Val", "Valine");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter an amino acid 1 letter code, 3 letter code or full name:  ");
        String input = myObj.nextLine();
        if (input.length() == 1) {
            System.out.println("You chose the 1 letter code " + input);
            String fullName = oneNameMap.get(input);
            String threeLetters = oneThreeMap.get(input);
            System.out.println("This translates to the full name " + fullName);
            System.out.println("and the 3 letter code " + threeLetters);
        } else if (input.length() == 3) {
            System.out.println("You chose the 3 letter code " + input);
            String fullName = threeNameMap.get(input);
            System.out.println("This translates to the full name " + fullName);
            for (Entry<String, String> entry : oneThreeMap.entrySet()) {
                if (entry.getValue().equals(input)) {
                    String oneLetter = entry.getKey();
                    System.out.println("and the 1 letter code " + oneLetter);
                }
            }
        } else if (input.length() > 3) {
            System.out.println("You chose the full name " + input);
            for (Entry<String, String> entry : oneNameMap.entrySet()) {
                if (entry.getValue().equals(input)) {
                    String oneLetter = entry.getKey();
                    System.out.println("This translates to the 1 letter code " + oneLetter);
                }
            }
            for (Entry<String, String> entry : threeNameMap.entrySet()) {
                if (entry.getValue().equals(input)) {
                    String threeLetter = entry.getKey();
                    System.out.println("and the 3 letter code " + threeLetter);
                }
            }
        } else {
            System.out.println("You seem to not have entered anything! Please start again...");
        }

    }
}

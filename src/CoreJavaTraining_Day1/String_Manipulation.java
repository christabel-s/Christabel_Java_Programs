package CoreJavaTraining_Day1;

public class String_Manipulation {

	public static void main(String[] args) {
		// How to replace/remove any number or letter from a given string
		
		
				// (1) replacing/ removes all alphabets from a to z in my string 
				String fName = "christabel12345";
				String replaced_fName = fName.replaceAll("[a-z]", "");
				System.out.println(replaced_fName);
				
				
				// (1) Removes capital letters from  my string 
				String seconName = "Christabel Samuel";
				String fulName = seconName.replaceAll("[A-Z]", " ");
				System.out.println(fulName);
				
				// (1) Replaces capital letter with small letter
				String sName = "Samuel";
				String ReplaceCap = sName.replace("S", "s");
				System.out.println(ReplaceCap);
				
				// (1) Replaces character with a different character
				String replaceCharacter = "Samuel";
				String ReplaceCha = replaceCharacter.replace("S", "C");
				System.out.println(ReplaceCha);
				
				
				//Removing all numeric values from a string
				String numeric = "chioma2345";
				String numericReplaced = numeric.replaceAll("[0-9]", "");
				System.out.println(numericReplaced);
				
				
		
				
				
	}

}

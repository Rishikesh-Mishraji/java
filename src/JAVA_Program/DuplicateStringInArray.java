package JAVA_Program;

public class DuplicateStringInArray {

    public static void main(String[] args) {
        String[] aaa = {"Rishi", "Rishikesh", "Ram", "Rishi"};
        boolean flag = false;

        for (int i = 0; i < aaa.length; i++) {
            for (int j = i + 1; j < aaa.length; j++) {
                // Check for duplicates
                if (aaa[i].equals(aaa[j])) {
                    System.out.println("Duplicate value from the array: " + aaa[i]);
                    flag = true;
                    break; // Break inner loop after finding the duplicate to avoid printing multiple times
                }
            }
        }

        // If no duplicates were found
        if (!flag) {
            System.out.println("There is no duplicate value in the given array");
        }
    }
}

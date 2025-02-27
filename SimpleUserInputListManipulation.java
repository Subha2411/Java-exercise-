import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class SimpleUserInputListManipulation {
public static void main(String[] args) {
// Create a linked list and an array list
LinkedList<Integer> linkedList = new LinkedList<>();
ArrayList<Integer> arrayList = new ArrayList<>();
List<Integer> commonList;
// Get the list of integers from the user
Scanner scanner = new Scanner(System.in);
System.out.print("Enter integers separated by spaces: ");
String input = scanner.nextLine();
// Parse the input string and add elements to both lists
String[] elements = input.split("\\s+");
for (String element : elements) {
int number = Integer.parseInt(element);
linkedList.add(number);
arrayList.add(number);
}
// Display initial lists
System.out.println("Initial Linked List: " + linkedList);
System.out.println("Initial Array List: " + arrayList);
// Get elements to be added from the user
System.out.print("Enter elements to be added (separated by spaces): ");
String elementsToAddInput = scanner.nextLine();
String[] elementsToAdd = elementsToAddInput.split("\\s+");
// Add elements at the beginning and end of both lists
linkedList.addFirst(Integer.parseInt(elementsToAdd[0]));
arrayList.add(0, Integer.parseInt(elementsToAdd[0]));
linkedList.addLast(Integer.parseInt(elementsToAdd[1]));
arrayList.add(Integer.parseInt(elementsToAdd[1]));
// Display the final lists
System.out.println("Final Linked List: " + linkedList);
System.out.println("Final Array List: " + arrayList);
// Close the scanner to avoid resource leaks
scanner.close();
}
}

OUTPUT
  Enter integers separated by spaces: 45 66 76 
Initial Linked List: [45, 66, 76]
Initial Array List: [45, 66, 76]
Enter elements to be added (separated by spaces): 90 55
Final Linked List: [90, 45, 66, 76, 55]
Final Array List: [90, 45, 66, 76, 55]

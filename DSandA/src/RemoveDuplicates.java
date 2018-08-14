import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class RemoveDuplicates {
  public static void main(String[] args) {

    LinkedList<Integer> list = new LinkedList<>();
    list.add(5);
    list.add(3);
    list.add(5);
    list.add(3);
    list.add(5);
    list.add(3);
    list.add(5);
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(9);
    list.add(1);
    list.add(6);
    list.add(8);
    list.add(1);

    System.out.println(list.toString());
    removeDuplicates(list);
    System.out.println(list.toString());

  }

  public static void removeDuplicates(LinkedList<Integer> list) {

    Stack<Integer> stack = new Stack<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    // Set all map values to zero
    for (int i = 0; i < list.size(); i++) {
      map.put(list.get(i), 0);
    }

    // Increment HashMap values for every occurrence. Push onto stack.
    // If value > 1, pop from stack. Create new list from stack.
    for (int i = 0; i < list.size(); i++) {
      Integer element = list.get(i);
      map.put(element, map.get(element) + 1);
      stack.push(element);
      if (map.get(element) > 1) {
         stack.pop();
      }
    }

    list.clear();
    list.addAll(stack);

  }

}

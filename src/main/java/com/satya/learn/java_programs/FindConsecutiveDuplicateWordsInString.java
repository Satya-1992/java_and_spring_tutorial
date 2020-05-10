package main.java.com.satya.learn.java_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindConsecutiveDuplicateWordsInString {


  public static void main(String[] args) {
    String str = "I cg cg dfskjhfsj gdgdfgf gfdgdggd e e";
    String[] strArr = str.split(" ");
    int len = strArr.length;
    Set<String> set = new LinkedHashSet<>();
    for (int i = 0; i < len - 1; i++) {

      if (strArr[i].equals(strArr[i + 1])) {
        set.add(strArr[i]);
        i+=2;
      }
    }
    System.out.println(set);
  }
}

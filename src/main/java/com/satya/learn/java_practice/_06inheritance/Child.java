package main.java.com.satya.learn.java_practice._06inheritance;

import main.java.com.satya.learn.java_practice._06inheritance.Parent;

public class Child extends Parent {
  public String name = "Reyaansh";
  public String age = "2";
  public String job = "children";

  public void showInfo() {
    System.out.println("Child{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", job='" + job + '\'' +
            '}');
  }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class NonEnumerate {

  private class Person {

    String role;
    String name;

    public Person(String name, String role) {
      this.name = name;
      this.role = role;
    }

    @Override
    public String toString() {
      return this.name + " (" + this.role + ')';
    }
  }

  public static void main(String[] args) {
    NonEnumerate enumerates = new NonEnumerate();
    enumerates.start();
  }

  public void start() {
    Person instructor = new Person("Phil", "teacher");
    Person student = new Person("Joe", "manager");
    System.out.println(instructor.toString());
    System.out.println(student.toString());
  }

}

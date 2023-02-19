package com.demoqa.pages.elements;

import com.github.javafaker.Faker;

public class User {

  Faker faker = new Faker();

  //most be private
  String name;

  String lastName;

  int age;
  int salary;
  String department;
  String email;
  public User(String name, String lastName, String email, int age, int salary, String department) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
    this.salary = salary;
    this.department = department;
  }

  public void setFaker(Faker faker) {
    this.faker = faker;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public int getSalary() {
    return salary;
  }

  public String getDepartment() {
    return department;
  }

  public String getEmail() {
    return faker.internet().emailAddress();
  }

  @Override
  public String toString() {
    return """
        %s
        %s
        %s
        %d
        %d
        %s
        """.formatted(name, lastName, email, age, salary, department);
  }
}

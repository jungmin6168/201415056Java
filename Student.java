import java.util.ArrayList;
import java.util.Collections;
class Student{//p14_Student{
private String name;
private int number;
Student(String name, int number){
this.name = name;
this.number = number;
}
public String getName(){
return name;
}
 static void studentSort() {
 ArrayList<String> studentNameList = new ArrayList<String>();
Student s1 = new Student("sm 4",1);
Student s2 = new Student("sm 5",2);
Student s3 = new Student("sm 3",2);
Student s4 = new Student("sm 2",2);
Student s5 = new Student("sm 1",2);
Student s6 = new Student("sm 6",2);
studentNameList.add(s1.getName());
studentNameList.add(s2.getName());
studentNameList.add(s3.getName());
studentNameList.add(s4.getName());
studentNameList.add(s5.getName());
studentNameList.add(s6.getName());
Collections.sort(studentNameList);
System.out.println(studentNameList);
 }
public static void main(String[] args) {
 studentSort();
 }
 }
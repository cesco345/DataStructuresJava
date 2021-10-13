import java.util.Scanner;
 2
 3
 4 class Person {
 5
 6     private String name;
 7     private int birthYear;
 8     public  Person bestFriend;
 9
10     public Person(String name, int birthYear) {
11         this.birthYear = birthYear;
12         this.name = new String(name);
13     }
14
15     public void setFriend(Person friend) {
16         bestFriend = friend;
17     }
18    @Override
19     public String toString() {
20         return name;
21   }
22 }
23
24 public class MemoryTest {
25     public static void main(String args[]) {
26         // make one person
27         Person p1 = new Person("Alice Anderson", 1997);
28
29         // make another person
30         Person p2 = new Person("Bill Barber", 1998);
31
32         // set them as each other's friend
33         p1.setFriend(p2);
34         p2.setFriend(p1);
35
36         // println() prints the following line to the output screen
37         System.out.println("Person 1 is " + p1);
38         System.out.println("Person 1 is " + p2);
39         System.out.println("Person 1 is " + p2.bestFriend);
40         System.out.println("Person 1 is " + p1.bestFriend);
41
42     }
43 }

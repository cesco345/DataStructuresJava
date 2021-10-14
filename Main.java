 1 import java.util.Scanner;
 2 import java.util.Random;
 3
 4 public class Main{
 5
 6 public static void main(String[] args) {
 7     Scanner in = new Scanner(System.in);
 8
 9     // get user throw
10     System.out.println("Enter throw (1)Rock, (2)Paper, (3)Scissors");
11     int user = in.nextInt();
12
13     // get computer throw
14     Random rng = new Random();
15     int comp = rng.nextInt(3) + 1;
16
17     // figure winner
18     int difference = user - comp;
19     switch (difference) {
20         case 0:
21             System.out.println("Tie!");
22             break;
23         case 1:
24         case -2:
25             System.out.println("You won!");
26             break;
27         case -1:
28         case 2:
29             System.out.println("You lost :(");
30             break;
31     }
32 }
33 }
34

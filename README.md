[Program 1: Program to create  a calculator in java.](#Code1)

[Program 2: Program to find greatest of two numbers.](#Code2)

[Program 3: Program for the addition of two distances where each distance is given in meter and centimeter.](#Code3)

[Program 4: Program for the addition of two distances where each distance is given in meter, centimeter and millimeters.](#Code4)

[Program 5: Program for the addition of two times where each time is given in hours, minutes and seconds.](#Code5)

[Program 6: Program for reversing 1-D array using objects and classes.](#Code6)

[Program 7: Program for transpose of 3x3 matrix using classes and objects.](#Code7)

[Program 8: Program for multiplication of two 3x3 matrices using classes and objects.](#Code8)

[Program 9: Program for addition of two 3x3 matrices using classes and objects.](#Code9)

[Program 10: Program for sum of all elements in each row, each column and the diagonal in a 3x3 matrix  using classes and objects.](#Code10)

[Program 11a: Collect the code from the internet for any five programs in the C language and convert them to Java. (Factorial).](#Code11a)

[Program 11b: Collect the code from the internet for any five programs in the C language and convert them to Java. (Armstrong).](#Code11b)

[Program 11c: Collect the code from the internet for any five programs in the C language and convert them to Java. (Palindrome).](#Code11c)

[Program 11d: Collect the code from the internet for any five programs in the C language and convert them to Java. (Fibonacci).](#Code11d)

[Program 11e: Collect the code from the internet for any five programs in the C language and convert them to Java. (Pattern).](#Code11e)

[Program 12: Write a program using three classes to print 1–100, 1–100, 1–100 without a thread, and analyse the output, and repeat the same program using the Runnable interface.](#Code12)

[Program 13: Write a program using three classes to print 1–100, 1–100, 1–100 with a thread and analyse the output, and repeat the same program using the Runnable interface.](#Code13)

[Program 14:  Using the concept of multithreading, the output of all three threads must be synchronised (use the join method).](#Code14)

[Program 15: Addition of 2 numbers using Swing.](#Code15)

[Program 16: Make one calculator in Swing.](#Code16)

[Program 17: Matrix Addition using swing class.](#Code17)

## Code1
~~~
public class Calc {
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        add(a,b);
        sub(a,b);
        multi(a,b);
        div(a,b);
    }
    public static void add(int a,int b)
    {
        System.out.println("Addition="+(a+b));
    }
    public static void sub(int a,int b)
    {
        System.out.println("Subtraction="+(a-b));
    }
    public static void multi(int a,int b)
    {
        System.out.println("Multiplication="+(a*b));
    }
    public static void div(int a,int b)
    {
        System.out.println("Division="+(a/b));
    }
}
~~~
<img width="840" height="274" alt="image" src="https://github.com/user-attachments/assets/e9335dd4-951d-4206-9a2d-0d84449f072a" />

## Code2
~~~
public class Max {
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if(a>b)
        {
            System.out.println("Greatest is "+a);
        }
        else if(a==b)
        {
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Greatest is "+b);
        }
    }
    
}
~~~
<img width="484" height="226" alt="image" src="https://github.com/user-attachments/assets/889f0581-23cc-4ea6-991a-7802e6af04ce" />

## Code3
~~~
import java.util.Scanner;
public class Distance
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int m1,m2,cm1,cm2;
    int meter,centimeter;
    System.out.println("Enter first Distance(meter and centimenter):");
    m1=sc.nextInt();
    cm1=sc.nextInt();
    System.out.println("Enter second distance(meter and centimeter):");
    m2=sc.nextInt();
    cm2=sc.nextInt();
    meter=m1+m2;
    centimeter=cm1+cm2;
    if(centimeter>=100)
    {
      meter=meter+(centimeter/100);
      centimeter=centimeter%100;
    }   
    System.out.println("Total Distance:"+meter+"m "+centimeter+"cm");
  }
}
~~~
<img width="324" height="152" alt="image" src="https://github.com/user-attachments/assets/5be78abc-b814-4037-9474-25e70387f024" />

## Code4
~~~
import java.util.Scanner;
public class Distance
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int m1,m2,cm1,cm2,mm1,mm2;
    int meter,centimeter,millimeter;
    System.out.println("Enter first Distance(meter,centimenter and millimeter):");
    m1=sc.nextInt();
    cm1=sc.nextInt();
    mm1=sc.nextInt();
    System.out.println("Enter second distance(meter,centimeter and millimeter):");
    m2=sc.nextInt();
    cm2=sc.nextInt();
    mm2=sc.nextInt();
    meter=m1+m2;
    centimeter=cm1+cm2;
    millimeter=mm1+mm2;
    if(millimeter>=10)
    {
      centimeter=centimeter+(millimeter/10);
      millimeter=millimeter%10;
    }  
    if(centimeter>=100)
    {
      meter=meter+(centimeter/100);
      centimeter=centimeter%100;
    } 
    System.out.println("Total Distance:"+meter+"m "+centimeter+"cm "+millimeter+"mm");
  }
}
~~~
<img width="408" height="173" alt="image" src="https://github.com/user-attachments/assets/7138e3b0-2c5b-47bc-b9d2-e02854b5741a" />

## Code5
~~~
import java.util.Scanner;

class Time {
    int hours, minutes,seconds;

    void addTime(int h1, int m1, int h2, int m2, int sec1, int sec2) {
        hours = h1 + h2;
        minutes = m1 + m2;
        seconds= sec1 + sec2;
        
        if (seconds >= 60){
            minutes =  minutes + seconds / 60;
            seconds = seconds % 60;
        } 

        if (minutes >= 60) {
            hours = hours + minutes / 60;
            minutes = minutes % 60;
        }
    }

    void display() {
        System.out.println("Total Time = " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int h1, m1, h2, m2, sec1, sec2;

        System.out.print("Enter first time (hours,minutes and seconds): ");
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        sec1=sc.nextInt();
        
        System.out.print("Enter second time (hours,minutes and seconds): ");
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        sec2=sc.nextInt();
        
        Time t = new Time();   // object creation
        t.addTime(h1, m1, h2, m2, sec1, sec2);
        t.display();
    }
}
~~~
<img width="353" height="154" alt="image" src="https://github.com/user-attachments/assets/8b3f5a10-d330-40a5-8426-bc7df2734396" />

## Code6
~~~
import java.util.Scanner;

class RevArray
{
  void ReverseArray()
  {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter size of array:");
    n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter elements of the array:\n");
    for(int i=0 ; i < n; i++)
    { 
      System.out.println("Enter "+ (i+1) +"th element:");
      arr[i] = sc.nextInt();
    }

    System.out.println("Original Array:-");
    for(int i=0; i < n; i++)
    { 
      System.out.print(arr[i]+" ");
    }

    System.out.println("\nReversed Array:-");
    for(int i=0; i < n/2; i++)
    {
      int temp = arr[i];
      arr[i] = arr[n-i-1];
      arr[n-i-1] = temp;
    }
    for(int i=0; i < n; i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}

public class MainRevArray
{
  public static void main(String[] args)
  {
    RevArray obj = new RevArray();
    obj.ReverseArray();
  }
}
~~~
<img width="334" height="298" alt="image" src="https://github.com/user-attachments/assets/ffc63198-b74b-42aa-a22a-4401e313066e" />

## Code7
~~~
import java.util.Scanner;
class TransposeMatrix
{
  void Transpose()
  {
    Scanner sc = new Scanner(System.in);    
    int[][] arr = new int[3][3];
    System.out.println("Enter elements of 3x3 matrix:-");
    for(int i=0; i < 3; i++)
    {  
      for(int j=0; j <3; j++)
      { 
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("\nOriginal Matrix:-");
    for(int i=0; i < 3; i++)
    {
      for(int j=0; j < 3; j++)
      { 
        System.out.print(arr[i][j]+" ");
      }
      System.out.print("\n");
    }

    System.out.println("Transpose of Matrix:-");
    for(int i=0; i < 3; i++)
    { 
      for(int j=0; j < 3; j++)
      { 
        System.out.print(arr[j][i]+" ");
      }
      System.out.print("\n");
    }
  }
}

public class MainTranspose
{
  public static void main(String[] args)
  { 
   TransposeMatrix obj = new TransposeMatrix();
    obj.Transpose();
  }
}
~~~
<img width="318" height="317" alt="image" src="https://github.com/user-attachments/assets/6ed5fe0a-66a7-40f9-9d81-3687175dac78" />

## Code8
~~~
import java.util.Scanner;
class Multiplication
{ 
   void mulmatrix()
   { 
      Scanner sc = new Scanner(System.in);
      int[][] arr1 = new int[3][3];
      int[][] arr2 = new int[3][3];
      int[][] arr = new int[3][3];

      System.out.println("Enter elements of first matrix:-");
      for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            arr1[i][j]=sc.nextInt();
          }
       }
      System.out.println("Enter elements of second matrix:-");
      for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            arr2[i][j]=sc.nextInt();
          }
       }

       System.out.println("Original first matrix:-");
       for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            System.out.print(arr1[i][j]+" ");
          }
          System.out.print("\n");
       }
       System.out.println("Original second matrix:-");
       for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            System.out.print(arr2[i][j]+" ");
          }
          System.out.print("\n");
       }

       System.out.println("Matrix Multiplication:-");
       for(int i=0; i < 3; i++)
       {
          for(int j=0; j < 3; j++)
          {
             arr[i][j]=0;
             for(int k=0; k < 3; k++)
             {
                arr[i][j] += arr1[i][k] * arr2[k][j];
             }
          }
       }
       for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            System.out.print(arr[i][j]+" ");
          }
          System.out.print("\n");
       }
   }
}

public class MatrixMultiplication
{
   public static void main(String[] args)
   {
      Multiplication obj = new Multiplication();
      obj.mulmatrix();
   }
}
~~~
<img width="331" height="413" alt="image" src="https://github.com/user-attachments/assets/9e1b4a8c-5ba4-473a-b797-2ed9ac171451" />

## Code9
~~~
import java.util.Scanner;
class Addition
{
   void additionmatrix()
   {
      Scanner sc = new Scanner(System.in);
      int[][] arr1 = new int[3][3];
      int[][] arr2 = new int[3][3];
      int[][] arr = new int[3][3];

      System.out.println("Enter elements of first matrix:-");
      for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            arr1[i][j]=sc.nextInt();
         }
      }
      System.out.println("Enter elements of second matrix:-");
      for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            arr2[i][j]=sc.nextInt();
         }
      }

      System.out.println("Original first matrix:-");
      for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            System.out.print(arr1[i][j]+" ");
         }
          System.out.print("\n");
      }
      System.out.println("Original second matrix:-");
      for(int i=0; i < 3; i++)
      { 
         for(int j=0; j < 3; j++)
         {
            System.out.print(arr2[i][j]+" ");
         }
          System.out.print("\n");
      }

      System.out.println("Addition of two matrices:-");
      for(int i=0; i < 3; i++)
      {
         for(int j=0; j < 3; j++)
         {
            arr[i][j] = arr1[i][j] + arr2[i][j];
         }
      }
      for(int i=0; i < 3; i++)
      {
         for(int j=0; j < 3; j++)
         {
            System.out.print(arr[i][j]+" ");
         }
         System.out.print("\n");
      }
   }
}

public class MatrixAddition
{
   public static void main(String[] args)
   {
      Addition obj = new Addition();
      obj.additionmatrix();
   }
}
~~~
<img width="353" height="391" alt="image" src="https://github.com/user-attachments/assets/2d5a6824-563c-40b0-bd97-01ce87b041d2" />

## Code10
~~~
import java.util.Scanner;
class Operation 
{
    void operatematrix()
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("Enter elements of 3x3 matrix:-");
        for(int i=0; i < 3; i++)
        { 
            for(int j=0; j < 3; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original matrix:-");
        for(int i=0; i < 3; i++)
       { 
         for(int j=0; j < 3; j++)
         {
            System.out.print(arr[i][j]+" ");
         }
          System.out.print("\n");
       }

        System.out.println("\nSum of elements in rows:-");
        for(int i=0; i < 3; i++)
        {
            int sum = 0;
            for( int j=0; j < 3; j++)
            {
                sum += arr[i][j];
            }
            System.out.println("Sum of elements in "+(i+1)+"th row: "+sum);
        }

        System.out.println("\nSum of elements in columns:-");
        for(int i=0; i < 3; i++)
        {
            int sum = 0;
            for( int j=0; j < 3; j++)
            {
                sum += arr[j][i];
            }
            System.out.println("Sum of elements in "+(i+1)+"th coulumn: "+sum);
        }

        System.out.println("\nSum of elements in diagonal:-");
        int sum = 0;
        for(int i=0; i < 3; i++)
        {
            sum += arr[i][i];
        }
        System.out.println("Sum of elements in the diagonal: "+sum);


    }
}

public class MatrixOperation
{
    public static void main(String[] args)
    {
        Operation obj = new Operation();
        obj.operatematrix();
    }
}
~~~
<img width="360" height="394" alt="image" src="https://github.com/user-attachments/assets/6fa503ca-3a0d-49fc-8322-fa72746f3ea7" />

## Code11a
~~~
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}
~~~
<img width="104" height="43" alt="image" src="https://github.com/user-attachments/assets/1e4e1a1f-e961-46c9-930f-c7c931d48295" />

## Code11b
~~~
import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        int n, temp, rem, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while (n > 0) {
            rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }

        if (temp == sum)
            System. out.println("Armstrong Number");
        else
            System. out.println("Not an Armstrong Number");
    }
}
~~~
<img width="251" height="52" alt="image" src="https://github.com/user-attachments/assets/fad92527-4d69-4fcb-80de-dd067c2b4878" />

## Code11c
~~~
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        int n, rev = 0, rem, temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (temp == rev)
            System. out.println("Palindrome Number");
        else
            System. out.println("Not a Palindrome Number");
    }
}
~~~
<img width="254" height="50" alt="image" src="https://github.com/user-attachments/assets/575bfc20-5047-4688-af37-a616e5698e0c" />

## Code11d
~~~
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series:");
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
~~~
<img width="266" height="67" alt="image" src="https://github.com/user-attachments/assets/0aefc0e1-4ae7-4858-8124-1371c923c075" />

## Code11e
~~~
class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
~~~
<img width="227" height="93" alt="image" src="https://github.com/user-attachments/assets/78034eab-287c-442b-8f03-63f1662874cf" />

## Code12
~~~
class PrintOneToHundred {
    void display() {
        System. out.println("Printing 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class PrintHundredToOne {
    void display() {
        System. out.println("Printing 100 to 1:");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class PrintOneToHundredAgain {
    void display() {
        System. out.println("Printing 1 to 100 again:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        PrintOneToHundred obj1 = new PrintOneToHundred();
        PrintHundredToOne obj2 = new PrintHundredToOne();
        PrintOneToHundredAgain obj3 = new PrintOneToHundredAgain();

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
~~~
<img width="817" height="161" alt="image" src="https://github.com/user-attachments/assets/d8386611-e01b-4d51-bb2a-f9430fd13abf" />

## Code13
~~~
class ThreadOne extends Thread {
    public void run() {
        System. out.println("Thread 1: Printing 1 to 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class ThreadTwo extends Thread {
    public void run() {
        System. out.println("Thread 2: Printing 100 to 1");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class ThreadThree extends Thread {
    public void run() {
        System. out.println("Thread 3: Printing 1 to 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();

        t1.start();
        t2.start();
        t3.start();
    }
}
~~~
<img width="828" height="171" alt="image" src="https://github.com/user-attachments/assets/89dcd5f7-537a-46af-81e4-62702686b240" />

## Code14
~~~
class ThreadOne extends Thread {
    public void run() {
        System. out.println("Thread 1: Printing 1 to 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class ThreadTwo extends Thread {
    public void run() {
        System. out.println("Thread 2: Printing 100 to 1");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class ThreadThree extends Thread {
    public void run() {
        System. out.println("Thread 3: Printing 1 to 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();

        try {
            t1.start();
            t1.join();   

            t2.start();
            t2.join();  

            t3.start();
            t3.join();  

        } catch (InterruptedException e) {
            System. out.println("Exception: " + e);
        }
    }
}
~~~
<img width="827" height="146" alt="image" src="https://github.com/user-attachments/assets/6387f6a8-5201-4ea0-8680-f4ab2c6544db" />

## Code15
~~~
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    Main() {
        l1 = new JLabel("Enter First Number:");
        l2 = new JLabel("Enter Second Number:");
        l3 = new JLabel("Result:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);

        b1 = new JButton("Add");
        b1.addActionListener(this);

        l1.setBounds(50, 50, 150, 30);
        t1.setBounds(200, 50, 150, 30);

        l2.setBounds(50, 100, 150, 30);
        t2.setBounds(200, 100, 150, 30);

        l3.setBounds(50, 150, 150, 30);
        t3.setBounds(200, 150, 150, 30);

        b1.setBounds(140, 220, 100, 30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1);

        setTitle("Addition of Two Numbers");
        setSize(450, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1 + num2;
        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new Main();
    }
}
~~~
<img width="326" height="259" alt="image" src="https://github.com/user-attachments/assets/7fbd92f9-e417-497e-95d1-357a6e2e1019" />

## Code16
~~~
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4, b5;

    Main() {
        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mul");
        b4 = new JButton("Div");
        b5 = new JButton("Clear");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(170, 50, 150, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(170, 100, 150, 30);

        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(170, 150, 150, 30);

        b1.setBounds(30, 220, 70, 30);
        b2.setBounds(110, 220, 70, 30);
        b3.setBounds(190, 220, 70, 30);
        b4.setBounds(270, 220, 70, 30);
        b5.setBounds(150, 270, 80, 30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2); add(b3); add(b4); add(b5);

        setTitle("Calculator Using Swing");
        setSize(400, 380);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == b1) {
                result = num1 + num2;
            } else if (e.getSource() == b2) {
                result = num1 - num2;
            } else if (e.getSource() == b3) {
                result = num1 * num2;
            } else if (e.getSource() == b4) {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Division by zero is not allowed");
                    return;
                }
                result = num1 / num2;
            } else if (e.getSource() == b5) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                return;
            }

            t3.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
~~~
<img width="290" height="281" alt="image" src="https://github.com/user-attachments/assets/2b7899df-1d3c-4fb3-b8d6-1b1a9f72fa44" />

## Code17
~~~
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    JTextField a11, a12, a21, a22;
    JTextField b11, b12, b21, b22;
    JTextField r11, r12, r21, r22;
    JButton addBtn, clearBtn;

    Main() {
        setTitle("Matrix Addition (2x2)");
        setSize(420, 320);
        setLayout(null);

        JLabel la = new JLabel("Matrix A");
        la.setBounds(60, 10, 100, 20);
        add(la);

        a11 = new JTextField(); a11.setBounds(40, 40, 50, 30);
        a12 = new JTextField(); a12.setBounds(100, 40, 50, 30);
        a21 = new JTextField(); a21.setBounds(40, 80, 50, 30);
        a22 = new JTextField(); a22.setBounds(100, 80, 50, 30);

        JLabel lb = new JLabel("Matrix B");
        lb.setBounds(250, 10, 100, 20);
        add(lb);

        b11 = new JTextField(); b11.setBounds(230, 40, 50, 30);
        b12 = new JTextField(); b12.setBounds(290, 40, 50, 30);
        b21 = new JTextField(); b21.setBounds(230, 80, 50, 30);
        b22 = new JTextField(); b22.setBounds(290, 80, 50, 30);

        JLabel lr = new JLabel("Result");
        lr.setBounds(150, 120, 100, 20);
        add(lr);

        r11 = new JTextField(); r11.setBounds(120, 150, 50, 30); r11.setEditable(false);
        r12 = new JTextField(); r12.setBounds(180, 150, 50, 30); r12.setEditable(false);
        r21 = new JTextField(); r21.setBounds(120, 190, 50, 30); r21.setEditable(false);
        r22 = new JTextField(); r22.setBounds(180, 190, 50, 30); r22.setEditable(false);

        addBtn = new JButton("Add");
        clearBtn = new JButton("Clear");
        addBtn.setBounds(90, 240, 80, 30);
        clearBtn.setBounds(200, 240, 80, 30);

        addBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        add(a11); add(a12); add(a21); add(a22);
        add(b11); add(b12); add(b21); add(b22);
        add(r11); add(r12); add(r21); add(r22);
        add(addBtn); add(clearBtn);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            try {
                int A11 = Integer.parseInt(a11.getText());
                int A12 = Integer.parseInt(a12.getText());
                int A21 = Integer.parseInt(a21.getText());
                int A22 = Integer.parseInt(a22.getText());

                int B11 = Integer.parseInt(b11.getText());
                int B12 = Integer.parseInt(b12.getText());
                int B21 = Integer.parseInt(b21.getText());
                int B22 = Integer.parseInt(b22.getText());

                r11.setText(String.valueOf(A11 + B11));
                r12.setText(String.valueOf(A12 + B12));
                r21.setText(String.valueOf(A21 + B21));
                r22.setText(String.valueOf(A22 + B22));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid integers");
            }
        }

        if (e.getSource() == clearBtn) {
            JTextField[] fields = {
                a11,a12,a21,a22, b11,b12,b21,b22, r11,r12,r21,r22
            };
            for (JTextField f: fields) f.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}
~~~
<img width="311" height="240" alt="image" src="https://github.com/user-attachments/assets/4c595c82-f986-4004-bf8a-9853ca5bae00" />


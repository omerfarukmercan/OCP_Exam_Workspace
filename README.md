# OCP_Exam_Workspace
It includes OCP exam code examples

My special notes considering book are these:

# Chapter 1

# Welcome to Java

**MAJOR COMPONENTS OF JAVA**

- The Java Development Kit (JDK) contains the minimum software you need to do Java development. Key pieces include
the compiler (javac), which converts .java files to .class files, and the launcher java, which creates the virtual machine and executes the program.
- The javac program generates instructions in a special format that the java command can run called bytecode. Then java launches the Java Virtual Machine (JVM) before running the code. The JVM knows how to run bytecode on the actual machine it is on. You can think of the JVM as a special magic box on your machine that knows how to run your .class file.
- In Java 11, the JRE is no longer available as a stand-alone download or a subdirectory of the JDK. People can use the full JDK when running a Java program.

**Identifying Benefits of Java**

1. Object Oriented
2. Encapsulation
3. Platform Independent
4. Robust: garbage collection
5. Simple
6. Secure
7. Multithreaded
8. Backward Compatibility

**Understanding the Java Class Structure**

- An object is a runtime instance of a class in memory. An object is often referred to as an instance since it represents a single representation of the class. All the various objects of all the different classes represent the state of your program. A reference is a variable that points to an object.
- The method name and parameter types are called the *method signature.*
- The *method declaration* consists of additional information such as the return type.
- /**
    
    *Javadoc multiple-line comment
    
    @author Jeanne and Scott
    */
    
- You can even put two classes in the same file. When you do so, at most one of the classes in the file is allowed to be public.
- If you do have a public class, it needs to match the filename. The declaration public class Animal2 would not compile in a file named Animal.java.

**CREATING A MAIN() METHOD**

- public static void main(String[] args)
- Even if a main() method is present, Java will throw an exception if it isn’t static.

```java
String[] args
String args[]
String... args;
```

- The characters ... are called *varargs* (variable argument lists).
- While the previous example used the common args parameter name, you can use any valid variable name you like. Example: String[] options
- All command-line arguments are treated as String objects, even if they represent another data type like a number:
- What happens if you don’t pass in enough arguments: java.lang.ArrayIndexOutOfBoundsException: Index 1 out

**RUNNING A PROGRAM IN ONE LINE**

- java SingleFileZoo.java Cleveland
- When running it directly, you pass the java command the name of
the file. This feature is called launching *single-file source-code*
programs. The name cleverly tells you that it can be used only if your program is one file. This means if your program has
two .java files, you still need to use javac.

![1](https://github.com/user-attachments/assets/77de18ee-89be-4fea-ad1d-254d0979fadd)


**Understanding Package Declarations and Imports**

- Java calls more detailed packages child packages. The package com.amazon.javabook is a child package of com.amazon.
- import java.util.*;
    
    You might think that including so many classes slows down your program execution, but it doesn’t. The compiler figures out what’s actually needed.
    
- There’s one special package in the Java world called *java.lang*. This package is special in that it is automatically imported.
- Another case of redundancy involves importing a class that is in the same package as the class importing it. Java automatically looks in the current package for other classes.
- If you explicitly import a class name, it takes precedence over any wildcards present.
- IF YOU REALLY NEED TO USE TWO
CLASSES WITH THE SAME NAME
    
    import java.util.Date;
       public class Conflicts {
          Date date;
          java.sql.Date sqlDate;
       }
    

**COMPILING AND RUNNING CODE WITH PACKAGES**

- You can use an asterisk to specify that you’d like to include all Java files in a directory.
    - javac packagea/.java packageb/.java

**USING AN ALTERNATE DIRECTORY**

- By default, the javac command places the compiled classes in the same directory as the source code. It also provides an option to place the class files into a different directory. The -d option specifies this target directory.
- Where do you think this command will create the file ClassA.class?
javac -d classes packagea/ClassA.java packageb/ClassB.java

![2](https://github.com/user-attachments/assets/19d62406-25bd-4b55-96ed-e6ed5fa50007)


- To run the program, you specify the classpath so Java knows where to find the classes.
    - java -cp classes packageb.ClassB
    java -classpath classes packageb.ClassB
    java --class-path classes packageb.ClassB
- java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar"
myPackage.MyClass
    
    The period (.) indicates you want to include the current
    directory in the classpath. The rest of the command says to
    look for loose class files (or packages) in someOtherLocation and within myJar.jar.
    

**CREATING A JAR FILE**

- jar -cvf myNewFile.jar .
jar --create --verbose --file myNewFile.jar .

![3](https://github.com/user-attachments/assets/14914f9a-0157-4d29-b966-5ceb2c685d90)


- You can use single-file source-code programs from within a package as long as they rely only on classes supplied by the JDK.
- A file is also allowed to have neither class be public. As long as there isn’t more than one public class in a file, it is okay.



# Chapter 2

# Java Building Blocks

**CALLING CONSTRUCTORS**

- There are two key points to note about the *constructor*: the name of the constructor matches the name of the class, and there’s no return type.

![1](https://github.com/user-attachments/assets/01621d58-b7e5-4252-896f-7a95f867831e)


- For the exam, remember that anytime a constructor is used, the new keyword is required.

**EXECUTING INSTANCE INITIALIZER BLOCKS**

- Sometimes code blocks are inside a method. These are run when the method is called. Other times, code blocks appear outside a method. These are called *instance initializers*.
- When you’re counting instance initializers, keep in mind that they cannot exist inside of a method.

**FOLLOWING ORDER OF INITIALIZATION**

1. Fields and instance initializer blocks are run in the order in which they appear in the file.
2. The constructor runs after all fields and instance initializer blocks have run.

**USING PRIMITIVE TYPES**

- Primitive is not an object in Java nor does it represent an object. A primitive is just a single value in memory, such as a number or character.
- A float requires the letter f following the number so Java knows it is a float.
- All of the numeric types are signed in Java. This means that they reserve one of their bits to cover a negative range. For example, byte ranges from -128 to 127. Except that char is unsigned.
- short reptile = 65535; // DOES NOT COMPILE
char fish = (short)-1; // DOES NOT COMPILE

**Writing Literals**

- When a number is present in the code, it is called a *literal*.
- Octal (digits 0–7), which uses the number 0 as a prefix—for example, 017 (017 = 15)
    
    Hexadecimal (digits 0–9 and letters A–F/a–f), which uses 0x or 0X as a prefix—for example, 0xFF, 0xff, 0XFf.
    
    Binary (digits 0–1), which uses the number 0 followed by b or B as a prefix—for example, 0b10, 0B10
    
- int million2 = 1_000_000;
We’d rather be reading the latter one because the zeros don’t run together. You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a decimal point, or right after a decimal point. You can even place multiple underscore characters next to each other

**DISTINGUISHING BETWEEN PRIMITIVES AND REFERENCE TYPES**

- Reference types can be assigned null, primitives can't.
- Reference types can be used to call methods, assuming the reference is not null. Primitives do not have methods declared on them.
- Notice that all the primitive types have lowercase type names. All classes that come with Java begin with uppercase.

**IDENTIFYING IDENTIFIERS**

- Identifiers must begin with a letter, a $ symbol, or a _ symbol.
- Identifiers can include numbers but not start with them.
- Since Java 9, a single underscore _ is not allowed as an identifier.
- You cannot use the same name as a Java reserved word.

**CREATING LOCAL VARIABLES**

- Local variables do not have a default value and must be initialized before use.

**DEFINING INSTANCE AND CLASS VARIABLES**

- An *instance variable*, often called a field, is a value defined within a specific instance of an object.
- A *class variable* is one that is defined on the class level and shared among all instances of the class.
- Instance and class variables do not require you to initialize them. As soon as you declare these variables, they are given a default value.

**INTRODUCING VAR**

- Starting in Java 10, you have the option of using the keyword *var* instead of the type for local variables under certain conditions.
    
    var name = "Hello";
    var size = 7;
    
- You can only use this feature for local variables.
- So, the type of var can’t change at runtime, but value can change.
- A var is always initialized on the same line (or statement) where it is declared.

![2](https://github.com/user-attachments/assets/0dd30a3e-fb89-4096-8132-2b738df97c7a)


- While a var cannot be initialized with a null value without a type, it can be assigned a null value after it is declared, provided that the underlying data type of the var is an object.
    
    13: var n = "myData";
    14: n = null;
    15: var m = 4;
    16: m = null; // DOES NOT COMPILE
    
- var o = (String)null; //COMPILE
- A reserved type name means it cannot be used to define a type, such as a class, interface, or enum.
- A var cannot be used in constructor parameters, method parameters, instance variables, or class variables.

**Managing Variable Scope**

- The piecesOfCheese variable is a method parameter and, as discussed earlier, it also acts like a local variable in terms of garbage collection and scope.
- Local variables can never have a scope larger than the method they are defined in. However, they can have a smaller scope.

**REVIEWING SCOPE**

- *Local variables*: In scope from declaration to end of block
- *Instance variables*: In scope from declaration until object eligible for garbage collection
- *Class variables*: In scope from declaration until program ends

**Destroying Objects**

- All Java objects are stored in your program memory’s heap. The heap, which is also referred to as the free store, represents a large pool of unused memory allocated to your Java application.
- System.gc() is not guaranteed to run or do anything, and you should be able to recognize when objects become eligible for garbage collection.
- An object is no longer reachable when one of two situations occurs:
    1. The object no longer has any references pointing to it.
    2. All references to the object have gone out of scope.
- finalize() can run zero or one times. It cannot run twice.

**EK NOTLAR:**

“”” “”” → text block. 

Essential whitespace is part of your String and is important to you. Incidental whitespace just happens to be there to make the code easier to read.

Imagine a vertical line drawn on the leftmost non-whitespace character in your text block. Everthing to the left of it is incidental whitespace and everthing to the right is essential whitespace.

![3](https://github.com/user-attachments/assets/38a268ec-fb33-44d4-92d9-1186e67c5c60)


```java
String pyramid = """
   *
  * *
 * * *
""";
```

# Chapter 3

# Operators

![1](https://github.com/user-attachments/assets/5dae98f2-0473-4474-a4bf-399f693a05cd)


- If two operators have the same level of
precedence, then Java guarantees left-to-right evaluation.
- All of the arithmetic operators may be applied to any Java
primitives, with the exception of boolean. Furthermore,
only the addition operators + and += may be applied to
String values, which results in String concatenation.

**Numeric Promotion Rules**

1. If two values have different data types, Java will automatically
promote one of the values to the larger of the two data types.
2. If one of the values is integral and the other is floating-point,
Java will automatically promote the integral value to the
floating-point value’s data type.
3. Smaller data types, namely, byte, short, and char, are first
promoted to int any time they’re used with a Java binary
arithmetic operator, even if neither of the operands is int.
4. After all promotion has occurred and the operands have the
same data type, the resulting val

Note that unary operators are excluded from this rule.
For example, applying ++ to a short value results in a short
value.

- Java will automatically promote from smaller to larger data
types, as you saw in the previous section on arithmetic
operators, but it will throw a compiler exception if it detects
that you are trying to convert from larger to smaller data types
without casting.

- float egg = 2.0 / 9; // DOES NOT COMPILE
    
    compiler 2.0 yazınca double görüyor
    
- Overflow is when a number is so large that it will no longer fit within the
data type, so the system “wraps around” to the lowest
negative value and counts up from there, similar to how
modulus arithmetic works. There’s also an analogous
underflow, when the number is too low to fit in the data
type, such as storing -200 in a byte field.
    
    System.out.print(2147483647+1); // -2147483648
    
- long goat = 10;
int sheep = 5;
sheep = sheep * goat; // DOES NOT COMPILE
    
    sheep *= goat; //compiles
    
    The compound operator will first cast sheep to a long, apply
    the multiplication of two long values, and then cast the result
    to an int.
    
- long wolf = 5;
long coyote = (wolf=3);
System.out.println(wolf); // 3
System.out.println(coyote); // 3

- Comparing two numeric or character primitive types. If the
numeric values are of different data types, the values are
automatically promoted. For example, 5 == 5.00 returns true
since the left side is promoted to a double.

- File monday = new File("schedule.txt");
File tuesday = new File("schedule.txt");
File wednesday = tuesday;
System.out.println(monday == tuesday); // false
System.out.println(tuesday == wednesday); // true

- **instanceof**: Returns true if the reference that a points to is an
instance of a class, subclass, or class that implements
a particular interface, as named in b

- Integer zooTime = Integer.valueOf(9);
Number num = zooTime;
Object obj = zooTime;
In this example, there is only one object created in memory
but three different references to it because Integer inherits
both Number and Object. This means that you can call
instanceof on any of these references with three different
data types and it would return true for each of them.

 

- System.out.print(null instanceof Object);
Object noObjectHere = null;
System.out.print(noObjectHere instanceof String);
The preceding examples both print false. It almost doesn’t
matter what the right side of the expression is. We say
“almost” because there are exceptions. The last example does
not compile, since null is used on the right side of the
instanceof operator:
System.out.print(null instanceof null); // DOES NOT
COMPILE

- The short-circuit operators are nearly identical to the logical
operators, & and |, except that the right side of the expression
may never be evaluated if the final result can be determined
by the left side of the expression.

- For the exam, you should know that there is no requirement
that second and third expressions in ternary operations have
the same data types, although it does come into play when
combined with the assignment operator.
int stripes = 7;
System.out.print((stripes > 5) ? 21 : "Zebra");
int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT
COMPILE

```java
int b = 5;
System.out.println(b = b++); //5
System.out.println(b); //5
```

- Unary operators are always executed before any
surrounding binary or ternary operators.

```java
int sample3 = 5 * (1 % 2);
System.out.println(sample3); //5
```

- You can cast a
**boolean** variable since boolean is a type

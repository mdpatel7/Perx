# SER502-Spring2018-Team33
SER 502 Project 1
This is private repository for class project: Compiler and Virtual Machine for Programming Language.

# Team Members:
1. Jay Patel
2. Vihar Bhatt
3. Meet Patel
4. Raghavendra Prasad Vemula

The name of our programming language is PERX and the detail representation of our project is given in following youtube link:

https://www.youtube.com/watch?v=ZZ1eFl-CWqE

# The basic structure of our repository :

classes: It contains the class file for all the java file of complier and runtime.

data: It contains the sample program and their sample intermediate code.

data/sampleprogram : It contains the sample source preograms.

data/sampleintermediate: It conatins the respective intermediate code of sample programs.

doc: It contains the contribution.txt and presentation.pdf files.

gen: It contains the auto generated files by antlr.

lib: It contains the jar file for antlr.

src:It contains two subdirectory: compiler and runtime.

src/compiler: It contains the source code for compiler.

src/runtime: It contains the source code for runtime.

others: Perx.g4 - contains grammar for the language
        test.perx- this file should contain the code in Perx language.
        test.perxc - this file contains intermediate code generated by test.perx

Operating System used for developing the language: Windows

Tool used for developing the language: ANTLR, Eclipse Oxygen, IntelliJ

Tool used for presentation: PowerPoint.



# Installing Language:

You can download the .zip containing the project or pull directly from Github.

# Build and run Perx

The Perx language source code to be tested is to be written in a .perx file which needs to be created in the root directory of the project.

For Mac:
To generate the intermediate code the following command is to be executed on the terminal:

```
$ java -cp "lib/*:classes" PerxRunner test.perx
```

To execute the runtime environment the following command is to be executed on the terminal:
```
$ java -cp classes PerxRuntime test.perxc
```

For Windows:
To generate the intermediate code the following command is to be executed on the terminal:
```
$ java -cp "lib/*;classes" PerxRunner test.perx
```
To execute the runtime environment the following command is to be executed on the terminal:
```
$ java -cp classes PerxRuntime test.perxc
```

# Limitation:

1. Our language execute while loop 1 more time.
Solution: At the execution of runtime.java file, at the while loop, the whileexecutionflag doesnot become false at the end of statement, due to error in counter. At this time we are not able to solve that counter problem but in future we will try to solve it.

2. Our grammar is left recursive.
Solution: During milestone 1, we have submitted non left-recursive grammar with right associativity. But, we got the comment to remove right associativity without left-recursion but we were not able to do that. But, we now have pretty good idea to remove left-recursion without right associativity. So, with more time and effort we could done it in correct way.

# Extra:

We have supported nested if_statement and print statement.

# Sequence Finder
Given sequence of 8 balls arranged horizontally numbered 1, 2, 3, 4, 5, 6, 7, 8 after N number of operations specified by the user.

### Prerequisities
1. Downlaod & install latest version of Java(JDK) from official site of <a href="http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html" target="_blank">Oracle </a>
2. Setting system environment variable(Windows Operating system) : Right Click on My Computer -> Properties -> Advance System Settings -> Environment Variables. Under System Variables select Path -> edit. Copy the location ;C:\Program Files\Java\jdk1.8.0_91\bin; and paste to the variable Value -> Ok -> Ok -> Ok. 

#### Getting Started
Download the project <a href="https://github.com/chanchal-357/assignment" target="_blank">click here</a>.
Unzip the downloaded file.

Option 1: Using Command Prompt
-> Go to the project src folder
-> Compile the java file using command : javac com/chanchal/operation/Operation.java
-> Run the program : java com.chanchal.operation.Operation

Option 2: Download & install the latest version of Eclipse
-> Import the project(Right Click on project explorer -> Import -> General -> Existing projects into workspace -> browser location -> Finish)
-> Open Operation.java file in the eclipse
-> Run the java file using key Ctrl + F11

#### Range & Constraints on user input
Input by the user : <br>N K <br>
                    A_1 B_1 <br>
                    A_2 B_2 <br>
                    .<br>
                    .<br>
                    .<br>
                    A_N B_N <br>
(Where N specify the number of Operations, K specify the number of sets)<br>
Range of N : 1â‰¦Nâ‰¦50 <br>
Range of K : 1â‰¦Kâ‰¦10^9<br>
Range of A_i, B_i : 1â‰¦(A_i,B_i)â‰¦50 <br>

#### Output
The output should be a single line with the number for each ball in their final order, with a space between
each number

#### Sample Input & Output
4 2<br>
1 2<br>
2 3<br>
3 4<br>
4 1<br>
1 4 2 3 5 6 7 8<br>

Terminal-Command-Project

This project was created to practice in using terminal with "java" "javac" commands. I used apache.commons.collections as external library for creating JAR with another one.

The first step is to compile the source files using the command below: javac -d bin -cp lib/commons-collections4-4.4.jar src/com/kaptsiug/project/Lesson.java

The second step is to run the project: java -cp "lib/commons-collections4-4.4.jar;bin" com.kaptsiug.project.Lesson

The next step is creating JAR file: jar -cfm Lesson.jar Manifest.txt bin/com/kaptsiug/project/Lesson.class

When the JAR file was created we can check it using next command: java -jar Lesson.jar

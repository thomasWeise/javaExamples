# Lesson 2: Installing Java, Compiling and Running Programs

In this lesson, we learn how to compile and run a simple Java program which just prints "Hello World!" to the console. (Lesson 01 is the introduction lesson with no examples, so we start here at 02 :-)

## 1. Installing Java

### 1.1. Under Ubuntu Linux

- open console
- type `sudo apt-get update` and press enter
- type in your passoword if asked to
- type `sudo apt-get install openjdk-8-jdk` and press enter
- type in your passoword if asked to

### 1.2. Under Microsoft Windows

- open browser
- go to http://www.oracle.com/technetwork/java/javase/downloads/index.html
- download the latest **JDK** (not the JRE!)
- after download, install

## 2. Verifying Installation

- open console
- type `java -version`
- the output should be something like:

    $ java -version
    openjdk version "1.8.0_121"
    OpenJDK Runtime Environment (build 1.8.0_121-8u121-b13-0ubuntu1.16.04.2-b13)
    OpenJDK 64-Bit Server VM (build 25.121-b13, mixed mode)

## 3. Compile and Run Programs

We use a very simple example program here, a typical [Hello World!](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program) program.

Compile:

    javac HelloWorld.java

you get a file `HelloWorld.class` which can be executed in the Java VM.

Execute (after compiling):

    java HelloWorld
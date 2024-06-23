import tools.Calc;
import tools.AdvCalc;

class main{
    public static void main(String[] args){

        Calc obj = new Calc();
        obj.show();
    }
}

/*
================================================Notes=================================================================================
    1. -- what is package ?

       -- you are using music, documents, video and you need to store in a different folder as per their use 
       to avoid confusion (Similarly in java for storing class, enum , annotations, sub package  we are using  concept of package).

       -- in song folder you have multiple songs folder e.g sad songs, romantic songs, rocking song for that we can create sub
        folders inside folders of songs ,in package also we can create package inside package
         (Syntax java.util  here java is package and util is subpackage).

       -- you can structure in which we put similar types of codes in one folder, this concept in java is known as package.

       -- for creating a package we can use a keyword called package at a top of code and code file is in that package.
       -- suppose we have AdvCalc.java and Calc.java in one folder tools  then then we can say that AdvCalc.java and Calc.java in tools package.

       -- if we create database code then you can write it in separate package i.e db package
       -- if two java file in different package then you need to import class of one package to different package.

       suppose that tools package has two files
       a)AdvCal.java b)Calc.java

       and db package has two files
       a)Demo.java b)Multiply.java

       suppose in Demo.java we want to use AdvCal object 
       for that we need to import AdvCal class from tools package

       package db;  //Demo in db folder so that we need to mention
       import tools.AdvCal;  // without importing we can get error in creating object

       class Demo{
           public static void main(String []args){
               AdvCal obj =new AdvCal(); 
           }
       }

       --  there are many package provided by oracle. 
           e.g import java.util.ArrayList -- it means we are importing ArrayList class from java.util package here 
           java is main package and util is sub package inside main package and from this we can import ArrayList class.
           java is package and util is subpackage of java then from util package we can import ArrayLis.t 
   
       -- by default we import java.lang.*; in every java file

       -- when you create library then you need to create package and package should be unique name.
       -- go to mvn repository
       -- one way to building library reversing the domain name 
       --  for google if i making package then com.google      
======================================================================================================================================
*/
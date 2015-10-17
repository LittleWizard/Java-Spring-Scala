package main.java;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class MainApp {


    private static HelloWorld helloWorld;


    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }



    public static void main(String[] args){

        System.out.println("Hello World");


       /* ApplicationContext context = new
                FileSystemXmlApplicationContext("/media/littlewizard/Resources/scala projects/Java Spring First/spring-practise/Beans.xml");*/


        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");


 /*       HelloWorld obj = (HelloWorld) context.*/


               helloWorld.getMessage();




    }



}

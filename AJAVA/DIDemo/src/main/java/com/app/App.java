package com.app;


public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Human human = context.getBean("human",Human.class);
    	human.pump();
    	
    	Heart heart = new Heart();
    	Human h = new Human(heart);
    	human.pump();
    	
    }
}

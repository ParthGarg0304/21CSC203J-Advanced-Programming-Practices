/*program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.*/


import java.util.Scanner;

class Person{
    private String name;
    private int age;

    //Constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //Get methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Print{
    public static void main(String[] args){
        System.out.println("\nRA2211003011322");
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name:");
        String name=sc.nextLine();
        System.out.print("Enter age:");
        int age=sc.nextInt();
        sc.nextLine(); //Consume the newline

        //Create instances of the Person class using input values
        Person person=new Person(name, age);
        
        System.out.println("Name:"+person.getName()+", Age:"+person.getAge()); //display name and age
        sc.close();
        
    }
}

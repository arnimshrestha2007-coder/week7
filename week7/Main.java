package week7;
import javax.swing.Box;


public class Main
{
     public static void main(String [] args){
         //quesiton 1
         System.out.println("\nQuestion 1");
         Book book1=new Book();
         Book book2=new Book();
         book1.title="Something";
         book1.author="Ram";
         book1.price=1000;
         book2.title="Atomic habits";
         book2.author="James Clear";
         book2.price=2000;
         book1.dis();
         book2.dis();
         
         //quesiton 2
         System.out.println("\nQuestion 2");
         rectangle rectangle1=new rectangle(10,20);
         rectangle rectangle2=new rectangle(30,20);
         System.out.println("Area of r1="+rectangle1.area);
         System.out.println("Area of r2 ="+rectangle2.area);
         
         //question 3
         System.out.println("\nQuestion 3");
         Employee e1=new Employee(1,"Ram",10000);
         Employee e2=new Employee(2,"Sam",50000);
         Employee e3=new Employee(3,"Ham",20000);
         e1.display();
         e2.display();
         e3.display();
         if(e1.salary>e2.salary && e1.salary>e3.salary){
             System.out.println("Highest salary employees details");
             e1.display();
         }else if(e2.salary>e1.salary && e2.salary>e3.salary){
             System.out.println("Highest salary employees details");
             e2.display();
         }else{
             System.out.println("Highest salary employees details");
             e3.display();
         }
         
         //question 4
         System.out.println("\nQuestion 4");
         laptop laptop1=new laptop("HP",16,200000);
         laptop laptop2=new laptop("Apple",16,100000);
         laptop laptop3=new laptop("Dell",4,50000);
         if(laptop1.RAM>8){
             laptop1.dispaly();
         }else if(laptop2.RAM>8){
             laptop2.dispaly();
         }else if(laptop3.RAM>8){
             laptop3.dispaly();
         }else{
             System.out.println("no laptop has RAM greater tahn 8GB");
         }
         
         //question 5
         System.out.println("\nQuestion 5");
         mobile mobile1=new mobile("Apple",80000);
         mobile mobile2=new mobile("Remidi",15000);
         mobile mobile3=new mobile("Xaiomi",10000);
         mobile1.isAffordable(mobile1.price);
         mobile2.isAffordable(mobile2.price);
         mobile3.isAffordable(mobile3.price);
         
          //question 6
         System.out.println("\nQuestion 6");
         Result student1=new Result(80,90,95.5);
         Result student2=new Result(100,100,100);
  
         // calcualting marks
         student1.calc();
         student2.calc();
  
         //dispalying 
         student1.display();
         student2.display();

    
         //Scenario 
         System.out.println("\nScenario Question");
         //creating accounts
         BankAccount account1=new BankAccount(100,"Ram",-300);
         BankAccount account2=new BankAccount(101,"Sita",30000);
         //depositing
         System.out.println("For account number "+account1.number);
         account1.deposit();
         System.out.println("For account number "+account2.number);
         account2.deposit();
         //withdrawing
         System.out.println("For account number "+account1.number);
         account1.withdraw();
         System.out.println("For account number "+account2.number);
         account2.withdraw();
         //displaying
         account1.display();
         account2.display();
         
     }
}
package week7;


public class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Id="+this.id+" Name="+this.name+" salary="+salary);
    }
}
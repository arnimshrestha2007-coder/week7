package week7;
import java.util.Scanner;


/**
 * Write a description of class BankAcc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
  int number;
  String name;
  double balance;
  BankAccount(int n,String name,double b){
      this.number=n;
      this.name=name;
      this.balance=b;
  }
  void deposit(){
      Scanner scanner=new Scanner(System.in);
      System.out.println("Deposit money");
      double tmp=scanner.nextDouble();
      this.balance=this.balance+tmp;
  }
   void withdraw(){
      Scanner scanner=new Scanner(System.in);
      System.out.println("How much do you want to withdraw");
      double tmp=scanner.nextDouble();
      this.balance=this.balance-tmp;
  }
  void display(){
      System.out.println(this.name+" your current balance is="+this.balance);
  }
}
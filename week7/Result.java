package week7;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
   double Math,Phy,Comp;
   Result(double m1,double m2,double m3){
        this.Math=m1;
        this.Phy=m2;
        this.Comp=m3;
    }
   void calc(){
       System.out.println("Total marks="+(double)(this.Math+this.Phy+this.Comp)+" Total percentage="+(this.Math+this.Phy+this.Comp)/3+"%");
   }
   
   void display(){
       System.out.println("Math="+this.Math +" Physic="+this.Phy+" Comp= "+this.Comp);
   }
   
}
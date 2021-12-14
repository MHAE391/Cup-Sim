/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import jade.core.Agent;
import java.util.Random;
import java.util.Vector;


public class Logic  extends Agent{
  Vector<String> Stadum =new Vector<String>();
  Vector<String> Refress =new Vector<String>();
  Vector<String> Teams =new Vector<String>();
  Vector<String>Wins=new Vector<String>();
  String []arr={"ACMilan",
        "Ajax",
        "Arsenal",
        "Barcelona",
        "BayernMunch",
        "BorussiaDortmund",
        "Brighton",
        "Everton",
        "InterMilan",
        "LeicesterCity",
        "Liverpool",
        "ManCity",
        "ManUnited",
        "Rangers",
        "RealMadrid",
        "WestHamUnited",
        "ACMilan"
};
  @Override
  protected void setup(){
       for(String it:arr){
           Teams.add(it);
           Stadum.add(it+"s");
           Refress.add(it+"R");
       }
       String Team1=Teams.get(Rand(Teams.size()));
       Teams.remove(Team1);
       String Team2=Teams.get(Rand(Teams.size()));
       Teams.remove(Team2);
       
       String Stad=Stadum.get(Rand(Stadum.size()));
       Stadum.remove(Stad);
       
       String Refree=Refress.get(Rand(Refress.size()));
       Refress.remove(Refree);
       System.out.println(Team1 + " "+ Team2);
       System.out.println(Stad + " "+ Refree);
       
       
  }
  
    protected int  Rand(int length){
        Random rand= new Random();
        int index=rand.nextInt();
        if(index<0)index*=-1;
        return index%length;
    }
    
}

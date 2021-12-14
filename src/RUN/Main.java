/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUN;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

/**
 *
 * @author MHAE
 */
public class Main {
    public static void main(String [] args) throws StaleProxyException{
      jade.core.Runtime RunTime = jade.core.Runtime.instance();
      Profile Prof = new ProfileImpl("localhost",1000,"Main");
      ContainerController Start = RunTime.createMainContainer(Prof);
      AgentController Napoli=  Start.createNewAgent("Logic","Logic.Logic", null);
      Napoli.start();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import application.Main;
/**
 *
 * @author 文大贝
 */
public class Test {
        Environment Env=Main.Env;
    public void change(){
        
         Env.initial_position(30, 40, 1.2);
         Env.temp_position(50,60,0.1);
    }
}

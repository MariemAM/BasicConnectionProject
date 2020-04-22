/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.GUI;

import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.TextArea;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;


/**
 *
 * @author Mariem
 */
public class Login extends Form{

    public Login() {
        
        this.setTitle("Login");
        this.setLayout(BoxLayout.yCenter());
        TextField field_name=new TextField("", "Login", 6, TextArea.ANY);
        TextField field_pwd=new TextField("", "Password",4, TextArea.PASSWORD);
        Button btn=new Button("Login");
        
        btn.addActionListener(l->{
           if(field_name.getText().equalsIgnoreCase("esprit") && field_pwd.getText().equals("1234")){
           new Menu(field_name.getText(),field_pwd.getText());}
           else{ Dialog.show("ERROR", "Login Error", new Command("OK"));
           field_name.setText("");
           field_pwd.setText("");
           };
        });
        this.addAll(field_name,field_pwd,btn);
        this.show();
        
    }
    
    
}

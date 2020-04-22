/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.GUI;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;

/**
 *
 * @author Mariem
 */
public class TextPHP extends Form {

    public TextPHP(String login,String password) {
        
        Style s = UIManager.getInstance().getComponentStyle("TitleCommand");
        FontImage icon = FontImage.createMaterial(FontImage.MATERIAL_HOME, s);
        Label l=new Label();
        ConnectionRequest conn=new ConnectionRequest("http://localhost:4500/login.php?username="+login+"&password="+password);
        conn.addResponseListener(a->{
        l.setText(new String(conn.getResponseData()));
        this.add(l);
        this.refreshTheme();
        });
        NetworkManager.getInstance().addToQueue(conn);
        this.getToolbar().addCommandToLeftBar("", icon, (ev)->{new Menu(login,password);});
        this.setLayout(BoxLayout.y());
        this.show();
    }
    
    
}

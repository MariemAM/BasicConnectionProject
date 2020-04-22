/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.GUI;


import com.codename1.io.Log;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.MenuBar;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import java.io.IOException;
import javafx.scene.control.ToolBar;
/**
 *
 * @author Mariem
 */
public class Menu  extends Form{
    
    public Menu(String login,String password)  {
       
        Style s = UIManager.getInstance().getComponentStyle("");
        Style s2 = UIManager.getInstance().getComponentStyle("TitleCommand");
        
        FontImage icon=FontImage.createMaterial(FontImage.MATERIAL_IMAGE,s);
        FontImage icon1=FontImage.createMaterial(FontImage.MATERIAL_TEXTSMS,s);
        FontImage icon2= FontImage.createMaterial(FontImage.MATERIAL_TEXT_FORMAT,s);
        FontImage icon3= FontImage.createMaterial(FontImage.MATERIAL_ADD_TO_HOME_SCREEN,s);
        FontImage icon4= FontImage.createMaterial(FontImage.MATERIAL_ADD_TO_HOME_SCREEN,s2);
        
        
        
        this.getToolbar().addCommandToLeftSideMenu("Image", icon, (e)->{ new IImage(login,password);});
        this.getToolbar().addCommandToLeftSideMenu("Simple Text", icon1, (e)->{new SimpleText(login,password);});
        this.getToolbar().addCommandToLeftSideMenu("PHP text", icon2, (e)->{new TextPHP(login,password);});
        this.getToolbar().addCommandToLeftSideMenu("Logout", icon3, (e)->{  new Login();});
        
        this.getToolbar().addCommandToRightBar("Logout",icon4, (e) ->{
        new Login();
        });
        Label l=new Label("Choisir un menu");
        
        this.addAll(l);
        this.show();
        
        
        
        
        
    }
    
    
    
}

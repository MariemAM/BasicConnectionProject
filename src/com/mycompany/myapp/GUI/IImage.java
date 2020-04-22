/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.GUI;

import com.codename1.components.ImageViewer;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Mariem
 */
public class IImage extends Form{

    public IImage(String login,String password) {
         Resources theme=UIManager.initFirstTheme("/theme");
         ImageViewer image=new ImageViewer(theme.getImage("goodjob.jpg"));
         Style s = UIManager.getInstance().getComponentStyle("TitleCommand");
         FontImage icon = FontImage.createMaterial(FontImage.MATERIAL_HOME, s);
         this.getToolbar().addCommandToLeftBar("", icon, (ev)->{new Menu(login,password);});
         this.setLayout(BoxLayout.y());
         this.add(image);
         this.show();
    }
    
    
}

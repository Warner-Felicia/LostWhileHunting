/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import java.awt.Graphics;

/**
 *
 * @author Administrator
 */

public class MapView {
    
    private String drawMap;
    private int width=10;
    private int height=10; 
    private Graphics g;

    public MapView() {
        
        
        for(int x=0;x<10;x++)
        {
                for(int y=0;y<10;y++)
                {
                g.drawRect(x*width,y*height,width,height);
                }
        }
        
    }
    
    
    
    
}

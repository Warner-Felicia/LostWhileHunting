/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.InventoryItem;
import java.io.BufferedOutputStream;
import static java.io.File.separator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import lostwhilehunting.LostWhileHunting;



/**
 *
 * @author Administrator
 */
public class InventoryCharacterStream {
    
    private static final PrintWriter itemErrorFile = LostWhileHunting.getOutFile();
    private static final PrintWriter itemLogFile = LostWhileHunting.getLogFile();
    private static PrintWriter console = LostWhileHunting.getOutFile();
    static Game game = new Game();
    static ArrayList<InventoryItem> items = new ArrayList();
    static InventoryItem line;
    
    public void saveItems(String filePath) throws IOException{
        
        game = LostWhileHunting.getCurrentGame();
        items = game.getItems();
        int counter=0;
        
        PrintWriter out = null;
        try {
             out = new PrintWriter(new OutputStreamWriter(
            new BufferedOutputStream(new FileOutputStream(filePath)), "UTF-8"));
            
             this.console.print("\n********* Item Inventory ********  ");
             out.write("\n********* Item Inventory ********  "); 
             this.console.print(separator + "\nInventoryType" + " | " + "Quantity In Stock" + "\n");
             out.write("\nInventoryType" + " | " + "Quantity In Stock" + "\n");
            for(int i = 0; i < items.size(); i++){
              switch(items.get(i).getInventoryType()){
                  case "Rifle":
                        this.console.print(""+items.get(i).getInventoryType()+ "                 " + items.get(i).getQuantityInStock()+"\n");
                        out.write(""+items.get(i).getInventoryType()+ "                 " + items.get(i).getQuantityInStock()+"\n");
                        break;
              case "Bullets":
                        this.console.print(""+items.get(i).getInventoryType()+ "               " + items.get(i).getQuantityInStock()+"\n");
                        out.write(""+items.get(i).getInventoryType()+ "               " + items.get(i).getQuantityInStock()+"\n");
                        break;
              case "Meat":
                        this.console.print(""+items.get(i).getInventoryType()+ "                  " + items.get(i).getQuantityInStock()+"\n");
                        out.write(""+items.get(i).getInventoryType()+ "                  " + items.get(i).getQuantityInStock()+"\n");
                        break;
              case "Map":
                        this.console.print(""+items.get(i).getInventoryType()+ "                   " + items.get(i).getQuantityInStock()+"\n");
                        out.write(""+items.get(i).getInventoryType()+ "                   " + items.get(i).getQuantityInStock()+"\n");
                        break;
              case "Knife":
                        this.console.print(""+items.get(i).getInventoryType()+ "                 " + items.get(i).getQuantityInStock()+"\n");
                        out.write(""+items.get(i).getInventoryType()+ "                 " + items.get(i).getQuantityInStock()+"\n");
                        break;
              case "Extra Life":
                        this.console.print(""+items.get(i).getInventoryType()+ "            " + items.get(i).getQuantityInStock()+"\n");
                        out.write(""+items.get(i).getInventoryType()+ "            " + items.get(i).getQuantityInStock()+"\n");
                        break;
              default:
                  
                  break;
              
              }
            } 
               
                   
            out.flush();
            out.close();
            
            this.console.println("The following file was successfully written to: "+ filePath);
         
        } catch (UnsupportedEncodingException e) {
            ErrorView.display("ViewInventoryView", filePath+"error cannot be written");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            ErrorView.display("ViewInventoryView", filePath+"No file path");
            e.printStackTrace();
        } finally {
            if(out != null) {
                out.flush();
                out.close();
            }
        }
    }
    
    
   
    
}

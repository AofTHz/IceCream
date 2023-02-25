/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icecream;
import java.util.ArrayList;
/**
 *
 * @author AofTHz
 */
public class ItemData {
    public static ArrayList<String> TasteList = new ArrayList<>();
    public static ArrayList<String> CupList = new ArrayList<>();
    public static ArrayList<String> ToppingList = new ArrayList<>();
    
    
    public static void addTaste(){
        TasteList.clear();
        //เพิ่มอะไรก็ได้
        TasteList.add("Chocolate");
        TasteList.add("Vanilla");
    }
    
    public static void addCup(){
        CupList.clear();
        //เพิ่มอะไรก็ได้
        CupList.add("Big");
        CupList.add("Small");
    }
    
    public static void addTopping(){
        ToppingList.clear();
        //เพิ่มอะไรก็ได้
        ToppingList.add("Oreo");
        ToppingList.add("Candy");
    }
}

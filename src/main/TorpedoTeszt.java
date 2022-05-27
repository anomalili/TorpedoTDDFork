package main;

import modell.Hajo;

public class TorpedoTeszt {
    
    
    private Hajo hajo;
    
    public TorpedoTeszt(){
        hajo = new Hajo(new int[]{2,3,4});
        System.out.println("Teszt");
        
        new TorpedoTeszt().tesztLovesTalalt(4);
        new TorpedoTeszt().tesztLovesNemTalalt(4);
        new TorpedoTeszt().tesztLovesSullyedt(4);
    
    }
    
    public static void main(String[] args) {
    new TorpedoTeszt();
    }
    
    public void tesztLovesTalalt(int poz){
        //Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        //return "";
    }
    
     public void tesztLovesNemTalalt (int poz){
         System.out.println("nem talált tesz:");
        //Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        //return "";
    }
         public void tesztLovesSullyedt (int poz){
         System.out.println("nem talált tesz:");
        //Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        //return "";
    }
    
}

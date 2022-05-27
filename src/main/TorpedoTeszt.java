package main;

import modell.Hajo;

public class TorpedoTeszt {
    
    
    private Hajo hajo;
    
    public TorpedoTeszt(){
        hajo = new Hajo(new int[]{2,3,4});
        System.out.println("Teszt");
        
        new TorpedoTeszt().tesztLovesTalalt(4);
        new TorpedoTeszt().tesztLovesNemTalalt(4);
        new TorpedoTeszt().tesztLovesSullyedt(1);
        new TorpedoTeszt().tesztLovesNemSullyedt(2);
        
    
    }
    
    public static void main(String[] args) {
    new TorpedoTeszt();
    }
    
    public void tesztLovesTalalt(int poz){
        hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        //return "";
    }
    
     public void tesztLovesNemTalalt (int poz){
         System.out.println("nem talált tesz:");
        hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        //return "";
    }
         public void tesztLovesSullyedt (int poz){
         System.out.println("nem talált tesz:");
        hajo = new Hajo(new int[]{2,3,4});
        hajo.talalat(4);
        hajo.talalat(3);
        hajo.talalat(2);
        boolean s = hajo.elIsSullyedt();
        assert s = true: "";
        
        String t = hajo.talalat(poz);
             System.out.println("hiba az elsüllyedés ellenőrzésében");
        //return "";
    }
         
        public void tesztLovesNemSullyedt (int poz){
        System.out.println("nem talált tesz:");
        hajo = new Hajo(new int[]{2,3,4});
        hajo.talalat(4);
        hajo.talalat(3);
        hajo.talalat(2);
        boolean s = hajo.elIsSullyedt();
        assert s = false: "";
        
        String t = hajo.talalat(poz);
             System.out.println("hiba az el nem süllyedés ellenőrzésében");
        //return "";
    }
    
}

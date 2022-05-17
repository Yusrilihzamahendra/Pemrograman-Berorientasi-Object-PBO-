/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramTHR;
/**
 *
 * @author ESES
 */
public class Input {
    
   public int gapok;
   public int lamakerja;
   public int hasilthr;
   
   public int hasilthr(){
   
   double hasilthr = 0;
        
   if (lamakerja >= 12) {
       hasilthr=gapok;
       
       }else
       
       if (lamakerja <12) {
           hasilthr=(gapok / 12) * lamakerja;
       }
       return (int) hasilthr;
        
    }

    public int getGapok() {
        return gapok;
    }

    public void setGapok(int gapok) {
        this.gapok = gapok;
    }

    public int getLamakerja() {
        return lamakerja;
    }

    public void setLamakerja(int lamakerja) {
        this.lamakerja = lamakerja;
    }
    
    public int getHasilthr(){
       return hasilthr;
    }
    
    public void setHasilthr(int hasilthr) {
        this.hasilthr = hasilthr;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Regyma
 */
public class Mobil {
    int kecMax; 
    int percepatan; 
    int kecActual; 
    boolean started; 
    int Gigi; 

    public Mobil() { 
    } 

    public Mobil(int kecMax, int percepatan, int kecActual) { 
        this.kecMax = kecMax; 
        this.percepatan = percepatan; 
        this.kecActual = kecActual; 
        this.started = false; 
        this.Gigi = 0; 
    } 
     
    
    
//Setter 
//Procedure 
    public void setKecMax(int kecMax) { 
        this.kecMax = kecMax; 
    } 

    public void setPercepatan(int percepatan) { 
        this.percepatan = percepatan; 
    } 

    public void setKecActual(int kecActual) { 
        this.kecActual = kecActual; 
    } 

    public void setStarted(boolean started) { 
        this.started = started; 
    } 
     
    
    
    
//Getter 
//Function 
    public int getKecMax() { 
        return kecMax; 
    } 

    public int getPercepatan() { 
        return percepatan; 
    } 

    public int getKecActual() { 
        return kecActual; 
    } 

    public boolean isStarted() { 
        return started; 
    } 
     
    
    
// 1. Start
    public void start() { 
        if (started) { 
            this.setKecActual(0); 
        } 
    }  
    
    
    
// 2. Ganti Gigi
    public void gantiGigi(int Gigi) { 
        this.setPercepatan(percepatan); 
        switch(Gigi) { 
            case 0 : 
                this.setPercepatan(0);
                System.out.println("Pindah Gigi Dong!!");
                System.out.println(" ");
                break;  
            case 1 : 
                this.setPercepatan(10);
                System.out.println("Gigi : " +Gigi);
                System.out.println("Percepatan : " +this.getPercepatan()+ "km/jam");
                System.out.println(" ");
                break; 
            case 2 : 
                this.setPercepatan(15);
                System.out.println("Gigi : " +Gigi);
                System.out.println("Percepatan : " +this.getPercepatan()+ "km/jam");
                System.out.println(" ");
                break; 
            case 3 : 
                this.setPercepatan(20);
                System.out.println("Gigi : " +Gigi);
                System.out.println("Percepatan : " +this.getPercepatan()+ "km/jam");
                System.out.println(" ");
                break; 
            case 4 : 
                this.setPercepatan(25);
                System.out.println("Gigi : " +Gigi);
                System.out.println("Percepatan : " +this.getPercepatan()+ "km/jam");
                System.out.println(" ");
                break;
            case 5 : 
                this.setPercepatan(30);
                System.out.println("Gigi : " +Gigi);
                System.out.println("Percepatan : " +this.getPercepatan()+ "km/jam");
                System.out.println(" ");
                break;
        }   
    }
    
    
    
// 3. Gas
    public void gas() { 
        if (this.getKecActual()+this.getPercepatan() < this.getKecMax()) { 
            this.setKecActual(this.getKecActual()+this.getPercepatan()); 
        } else this.setKecActual(this.getKecMax()); 
    }
    
    
    
// 4. Rem
    public void rem() { 
        this.setKecActual(this.getKecActual()/2);
    }
    
    
    
    
// 5. Stop
    public void stop() { 
        this.setKecActual(0); 
        this.started = true; 
        System.out.println(); 
        System.out.println("Kecepatan Mobil "+ this.getKecActual()+"km/jam"); 
        System.out.println("Mobil Sudah Berhenti"); 
        System.out.println(); 
    }
}

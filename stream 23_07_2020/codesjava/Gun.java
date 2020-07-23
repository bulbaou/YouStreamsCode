package codesjava;

/**
 * @author Александр
 */
public class Gun {    
	{System.out.println(this.ammo);}    
    
	static int x;
	int ammo=test();
    final int maxAmmo;
	    
    //конструктор по умолчанию    
    Gun(){
        this(10);        
    }	
    //перегрузка
    Gun(int ammo){
        this(ammo,ammo);
    }
    Gun(int ammo, int maxAmmo){        
        System.out.println("creating gun");
        if(ammo>maxAmmo)ammo=maxAmmo;
        this.ammo=ammo;
        this.maxAmmo=maxAmmo;
    }
    {System.out.println("second init block");}
    
    static {System.out.println("init static"); x=99;}
    
    public int test(){
        System.out.println("field init");
        return 3;
    }
    public void shoot() {
        if (ammo > 0) {
            System.out.println("BAH");
            ammo--;
        } else {
            System.out.println("klac");
        }
    }
}

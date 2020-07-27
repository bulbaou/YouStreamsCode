package edu.streams.library;

/**
 * Класс {@code Gun} описывает пистолет. Пистолет имеет патроны и может стрелять.
 * стрельба представляет собой метод вывода на экран текста зависящего от наличия 
 * патронов. При каждом выстреле количество патронов уменьшается. Патроны 
 * можно зарядить, нельзя разрядить. Патронов не может быть заряжено больше
 * максимума установленного в конструкторе. Максимальное количество патронов
 * изменить нельзя.
 * 
 * @author  Ermakov Alexander
 */
public class Gun {

    private int ammo;
    private final int maxAmmo;
    /**
     * Создание нового {@code Gun} заряженного десятью патронами и максимальным
     * числом патронов тоже десять.
     */
    public Gun() {
        this(10);
    }
    
    /**
     * Создание нового {@code Gun} с указанием числа заряженных патронов,
     * причем это же и их максимум.
     *
     * @param  ammo
     *         количество и максимум патронов
     */
    public Gun(int ammo) {
        this(ammo, ammo);
    }
    /**
     * Создание нового {@code Gun}.
     *
     * @param  ammo
     *         количество патронов
     * @param  maxAmmo
     *         максимальное количество патронов
     */
    public Gun(int ammo, int maxAmmo) {
        if (ammo > maxAmmo) {
            ammo = maxAmmo;
        }
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }
    public int load(final int ammo) {//сеттеры
        int ret=0,tmp=this.ammo + ammo;        
        if (tmp > maxAmmo) {
            ret=tmp-maxAmmo;
            tmp = maxAmmo;          
        }
        this.ammo = tmp;
        return ret;
    }
    public int getAmmo(){ //геттер
        return ammo;
    }
    public int getMaxAmmo(){ //геттер
        return maxAmmo;
    }
    /**
     * Метод стрельбы из пистолета. Если патроны есть то на ээкран выводится
     * один текст, иначе другой. За один выстрел количество патронов уменьшается
     * на один, но не ниже нуля.
     *
     */
    public void shoot() {
        if (ammo > 0) {
            System.out.println("BAH");
            ammo--;
        } else {
            System.out.println("klac");
        }
    }

    public String toString() {
        return "Gun{" + "ammo=" + ammo + ", maxAmmo=" + maxAmmo + '}';
    }
    
}

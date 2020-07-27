package edu.streams.library;

/**
 * Класс {@code MachineGun} описывает автомат. Данный класс является наследником
 * класса {@link edu.streams.library.Gun}, отличается наличием дополнительного
 * поля отвечаеющего за количество выпущенных за один выстрел пуль. Количество
 * пуль за один выстрел задается в конструкторе
 * 
 * @author  Ermakov Alexander
 */
public class MachineGun extends Gun{
    private int len;
    /**
     * Создание нового {@code MachineGun} заряженного тридцатью патронами и максимальным
     * числом патронов тоже десять с длиной очереди в три патрона.
     */
    public MachineGun() {
        this(3);
    }
    /**
     * Создание нового {@code MachineGun} с указанием числа пуль за один выстрел,
     * тридцатью патронами и таким же максимумом в обойме.
     *
     * @param  len
     *         число пуль за один выстрел
     */
    public MachineGun(int len) {
        this(len,30);
    }
    /**
     * Создание нового {@code MachineGun} с указанием числа заряженных патронов,
     * причем это же и их максимум и числа пуль выпускаемых за один выстрел.
     *
     * @param  len
     *         число пуль за один выстрел
     * @param  ammo
     *         количество и максимум патронов
     */
    public MachineGun(int len, int ammo) {
        this(len,30,30);
    }
    /**
     * Создание нового {@code MachineGun}.
     *
     * @param  len
     *         число пуль за один выстрел
     * @param  ammo
     *         количество патронов
     * @param  maxAmmo
     *         максимальное количество патронов
     */
    public MachineGun(int len, int ammo, int maxAmmo) {
        super(ammo, maxAmmo);
        this.len = len;
    }
     /**
     * Метод стрельбы из автомата. Данный метод переопределяет метод класса
     * родителя и использует его, так как для  осуществления выстрела метод
     * класса родителя вызывается столько раз, сколько установлено в поле 
     * длины очереди.
     *
     */
    @Override
    public void shoot() {
        for(int i=0;i<len;i++){
            super.shoot();
        }
    }
}

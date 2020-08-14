package codesjava;

	/**
     * Базовый пример класса для зоопарка. 
     * 
     * @author Alexander Ermakov
     */
class Cow implements Moo {

    @Override
    public void moo() {
        System.out.println("MOOOOO!");
    }
}
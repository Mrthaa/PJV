public class Nadrz {

    private final int capacity;
    private final Obsah content;
    private int usedCapacity = 0;

    public Nadrz(Obsah content, int capacity) {
        this.content = content;
        this.capacity = capacity;
    }

    public void fill(int amount) throws MyException_PlnaNadrz {
        if (usedCapacity + amount <= capacity) usedCapacity += amount;
        else throw new MyException_PlnaNadrz("Nelze naplnit, nadrz by pretekla!");
    }

    public void empty(int amount) throws MyException_PrazdnaNadrz {
        if(usedCapacity - amount >= 0) usedCapacity -= amount;
        else throw new MyException_PrazdnaNadrz("Nelze vyprazdnit, v nadrzi neni dostatek obsahu!");
    }

    public String toString() {
        return String.format("%d/%d(%.1f%%), %s", usedCapacity, capacity, ((float)usedCapacity/(float)capacity)*100f, content);
    }
}

package state;

import Data.Animal;
import Data.Fruit;
import Data.Item;
import Data.Position;

import java.util.Objects;

public class State {
    Hang hang;
    Holds holds;
    On on;
    Site monkeySite;
    Site boxSite;

//    Animal animal;
//    Fruit fruit;
//    Position position;
//    Item item;

    public  State(Hang hang,Holds holds,On on,Site monkeySite,Site boxSite/**,Animal animal,Fruit fruit,Position position,Item item**/){
        this.hang = hang;
        this.holds = holds;
        this.on = on;
        this.monkeySite = monkeySite;
        this.boxSite = boxSite;

//        this.animal = animal;
//        this.fruit = fruit;
//        this.position = position;
//        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(hang, state.hang) &&
                Objects.equals(holds, state.holds) &&
                Objects.equals(on, state.on) &&
                Objects.equals(monkeySite, state.monkeySite) &&
                Objects.equals(boxSite, state.boxSite)
//                &&
//                animal == state.animal &&
//                fruit == state.fruit &&
//                position == state.position &&
//                item == state.item
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hang, holds, on, monkeySite, boxSite/**, animal, fruit, position, item**/);
    }

    public Hang getHang() {
        return hang;
    }

    public Holds getHolds() {
        return holds;
    }

    public On getOn() {
        return on;
    }

    public Site getMonkeySite() {
        return monkeySite;
    }

    public Site getBoxSite() {
        return boxSite;
    }

//    public Animal getAnimal() {
//        return animal;
//    }
//
//    public Fruit getFruit() {
//        return fruit;
//    }
//
//    public Position getPosition() {
//        return position;
//    }
//
//    public Item getItem() {
//        return item;
//    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }

    public void setHolds(Holds holds) {
        this.holds = holds;
    }

    public void setOn(On on) {
        this.on = on;
    }

    public void setMonkeySite(Site monkeySite) {
        this.monkeySite = monkeySite;
    }

    public void setBoxSite(Site boxSite) {
        this.boxSite = boxSite;
    }

//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }
//
//    public void setFruit(Fruit fruit) {
//        this.fruit = fruit;
//    }
//
//    public void setPosition(Position position) {
//        this.position = position;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }

    @Override
    public String toString() {
        return "State{" +
                "hang=" + hang.getHang() +
                ", holds=" + holds.getHolds() +
                ", on=" + on.getIsOn() +
                ", monkeySite=" + monkeySite.getPosition() +
                ", boxSite=" + boxSite.getPosition() +
                '}';
    }


}

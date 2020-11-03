package action;

import Data.Animal;
import Data.Fruit;
import Data.Item;
import Data.Position;
import state.*;


public class MonckeyAction implements Action{
//    Hang hang;
//    Holds holds;
//    On on;
//    Site monckeySite;
//    Site boxSite;
//
//    Animal animal;
//    Fruit fruit;
//    Position position;
//    Item item;
//
//    public  MonckeyAction(Hang hang,Holds holds,On on,Site monckeySite,Site boxSite,Animal animal,Fruit fruit,Position position,Item item){
//        this.hang = hang;
//        this.holds = holds;
//        this.on = on;
//        this.monckeySite = monckeySite;
//        this.boxSite = boxSite;
//
//        this.animal = animal;
//        this.fruit = fruit;
//        this.position = position;
//        this.item = item;
//    }

    State state;

    public MonckeyAction(State state){
        this.state = state;
    }

    @Override
    public State Goto(Position a, Position b) {
        if(state.getMonkeySite().getPosition().equals(a)){
            Site site = new Site(Item.monkey,b);
            state.setMonkeySite(site);
        }
        return state;
    }

    @Override
    public State Pushbox(Position a, Position b) {
        if(state.getMonkeySite().getPosition().equals(state.getBoxSite().getPosition())&&state.getBoxSite().getPosition().equals(a)){
            Site site1 = new Site(Item.monkey,b);
            Site site2 = new Site(Item.box,b);
            state.setMonkeySite(site1);
            state.setBoxSite(site2);
        }

        return state;
    }

    @Override
    public State Climbbox() {
        if(!state.getOn().getIsOn())
            state.setOn(new On(Animal.monkey,true));
        return state;
    }

    @Override
    public State ClimbDown() {
        if(state.getOn().getIsOn()&&!state.getMonkeySite().getPosition().equals(state.getHang().getB()))
            state.setOn(new On(Animal.monkey,false));
        return state;
    }

    @Override
    public State Grasp() {
        Position p = state.getHang().getB();
        if(!state.getHolds().getHolds()){
            state.setHolds(new Holds(Animal.monkey,true));
            state.setHang(new Hang(Fruit.banana,p,false));
        }

        return state;
    }
}

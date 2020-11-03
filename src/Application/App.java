package Application;

import Data.Animal;
import Data.Fruit;
import Data.Item;
import Data.Position;
import action.Move;
import state.*;


public class App {
    Hang hang;
    Holds holds;
    On on;
    Site monckeySite;
    Site boxSite;

    Animal animal;
    Fruit fruit;
    Position position;
    Item item;

    public static void main(String[] arg0){
        Hang hang1 = new Hang(Fruit.banana,Position.B,true);
        Holds holds1 = new Holds(Animal.monkey,false);
        On on1 = new On(Animal.monkey,true);
        Site monkeySite1 = new Site(Item.monkey,Position.C);
        Site boxSite1 = new Site(Item.box,Position.C);
        State start = new State(hang1,holds1,on1,monkeySite1,boxSite1);

        Hang hang2 = new Hang(Fruit.banana,Position.B,false);
        Holds holds2 = new Holds(Animal.monkey,true);
        On on2 = new On(Animal.monkey,true);
        Site monkeySite2 = new Site(Item.monkey,Position.B);
        Site boxSite2 = new Site(Item.box,Position.B);
        State end = new State(hang2,holds2,on2,monkeySite2,boxSite2);

        Move move = new Move();
        while(!start.equals(end)){
            System.out.println(start);
            start = move.move(start);
        }
        System.out.println(start);
    }
}

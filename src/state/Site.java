package state;

import Data.*;

import java.util.Objects;

public class Site {
    Item a;
    Position b;
    public Site(Item a,Position b){
        this.a = a;
        this.b = b;
    }
    public Item getThing(){
        return a;
    }

    public void setPosition(Position b){
        this.b = b;
    }

    public Position getPosition(){
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return a == site.a &&
                b == site.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

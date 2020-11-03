package state;


import Data.Animal;

import java.util.Objects;

/**
 * z ÷¿Ôƒ√◊≈œ„Ω∂
 */
public class Holds {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holds holds = (Holds) o;
        return isHolds == holds.isHolds &&
                z == holds.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(z, isHolds);
    }

    Animal z;
    boolean isHolds;
    public Holds(Animal z,boolean isHolds){
        this.z = z;
        this.isHolds = isHolds;
    }

    public void setHolds(boolean isHolds){
        this.isHolds = isHolds;
    }

    public boolean getHolds(){
        return this.isHolds;
    }
}

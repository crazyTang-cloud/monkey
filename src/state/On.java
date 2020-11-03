package state;


import Data.Animal;

import java.util.Objects;

public class On {
    Animal z;
    boolean isOn;
    public On(Animal z,boolean isOn){
        this.z = z;
        this.isOn = isOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        On on = (On) o;
        return isOn == on.isOn &&
                z == on.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(z, isOn);
    }

    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }

    public boolean getIsOn(){
        return this.isOn;
    }
}

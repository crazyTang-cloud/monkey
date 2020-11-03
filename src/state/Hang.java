package state;

import Data.*;

import java.util.Objects;

public class Hang {
    Fruit a;
    Position b;
    boolean isHang;
    public Hang(Fruit a,Position b,boolean isHang){
        this.a = a;
        this.b = b;
        this.isHang = isHang;
    }

    public void setHang(boolean isHang){
        this.isHang = isHang;
    }

    public boolean getHang(){
        return this.isHang;
    }

    public Position getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hang hang = (Hang) o;
        return isHang == hang.isHang &&
                a == hang.a &&
                b == hang.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, isHang);
    }
}

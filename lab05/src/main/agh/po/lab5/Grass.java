package agh.po.lab5;

import agh.po.lab2.Vector2d;

import java.util.Objects;

public class Grass extends AbstractWorldMapElement {

    public Grass(Vector2d position){
        this.position = position;
    }


    @Override
    public String toString() {
        return "*";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grass grass = (Grass) o;
        return position.equals(grass.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}

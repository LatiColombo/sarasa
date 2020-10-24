package ar.com.ada.online.second.abstracts.discount;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wand {
    protected String wandName;
    protected Integer damagePoints;

    // Constructor vacío
    public Wand (){
    }

    // Constructor con sus atributos
    public Wand(String wandName, Integer damagePoints) {
        this.wandName = wandName;
        this.damagePoints = damagePoints;
    }

    // Getters y setters:
    public String getWandName() {
        return wandName;
    }

    public void setWandName(String wandName) {
        this.wandName = wandName;
    }

    public Integer getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(Integer damagePoints) {
        this.damagePoints = damagePoints;
    }

    // Equals y Hashcode (no hago toString porque no creo que se use)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wand that = (Wand) obj;
        return wandName.equals(that.wandName) &&
                damagePoints.equals(that.damagePoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wandName, damagePoints);
    }


}

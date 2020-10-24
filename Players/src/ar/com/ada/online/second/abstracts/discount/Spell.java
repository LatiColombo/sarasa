package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;
import java.util.Scanner;

public abstract class Spell {
    protected Integer requiredMagicPoints;
    protected String name;

    public Spell() {
    }

    public Integer getRequiredMagicPoints() {
        return requiredMagicPoints;
    }

    public void setRequiredMagicPoints(Integer requiredMagicPoints) {
        this.requiredMagicPoints = requiredMagicPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void setKindOfMagic();

    public abstract void selectKindOfSpell();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Spell that = (Spell) obj;
        return requiredMagicPoints.equals(that.requiredMagicPoints) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredMagicPoints, name);
    }

}

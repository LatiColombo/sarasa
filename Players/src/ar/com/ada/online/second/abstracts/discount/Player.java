package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public abstract class Player {
    private String name;
    private String location;
    private String lifeLevel;
    private Integer magicEnergy;
    protected String dark;
    protected String bright;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(String lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public Integer getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }

    public String getDark() {
        return dark;
    }

    public void setDark(String dark) {
        this.dark = dark;
    }

    public String getBright() {
        return bright;
    }
 
    public void setBright(String bright) {
        this.bright = bright;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player that = (Player) obj;
        return name.equals(that.name) &&
                location.equals(that.location) &&
                lifeLevel.equals(that.lifeLevel) &&
                magicEnergy.equals(that.magicEnergy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeLevel, magicEnergy);
    }

    @Override
    public String toString() {
        return String.format(
                "Player{ name = %f, location = %f, levelLife = %f, magicEnergy = %f",
                name,
                location,
                lifeLevel,
                magicEnergy
        );
    }
}

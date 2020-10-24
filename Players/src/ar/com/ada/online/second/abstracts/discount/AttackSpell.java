package ar.com.ada.online.second.abstracts.discount;

public class AttackSpell extends Spell {

    @Override
    public void selectKindOfSpell() {
        if ()// falta completar
    }

    @Override
    public void setKindOfMagic() {
        if (Game.attakSpellQuantity > 3)
            player = dark;
        else
            player = bright;

    }
}

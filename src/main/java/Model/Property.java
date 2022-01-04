package Model;

import gui_fields.GUI_Street;

import java.awt.*;

public class Property extends Field {

    protected int price;
    protected int[] rent;
    protected Player owner;
    protected Color color;
    protected int hotel = 0;

    /**
     * Constructor
     * @param field
     * @param price
     * @param name
     * @param color
     */

    // Constructor
    public Property(GUI_Street field, int price, int[] rent, String name, Color color) {
        field.setTitle(name);
        field.setBackGroundColor(color);
        field.setSubText("$" + price);
        field.setDescription("My description");

        this.field = field;
        this.price = price;
        this.rent = rent;
        this.name = name;
        this.color = color;
    }

    // Methods
    public int getRent() {
        return rent[hotel];
    }
    public void buildHouse() {
        hotel++;
    }
    public void setOwner(Player player) {
        this.owner = player;
    }
    public Player getOwner() {
        return owner;
    }
    public Color getColor() {
        return color;
    }
}

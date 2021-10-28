package com.wyklad8.ex02;

import java.awt.*;
import java.util.EventObject;

public class ColorEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    private Color color;

    public ColorEvent(Object source,Color color) {
        super(source);
        this.color =color;
    }

    public Color getColor(){
        return color;
    }

}

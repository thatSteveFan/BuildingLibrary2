/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.buildinglibrary2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.image.Image;
import static com.mycompany.buildinglibrary2.Building.*;

/**
 *
 * @author pramukh
 * @param <T> the return type of this builder
 */
public abstract class BuildingBuilder<T extends Building>
{



    private final DoubleProperty angle = new SimpleDoubleProperty();
    private final DoubleProperty x = new SimpleDoubleProperty();
    private final DoubleProperty y = new SimpleDoubleProperty();

    
    

    public BuildingBuilder()
    {
        this(DEFAULT_ANGLE);
    }
    
    public BuildingBuilder(double angle)
    {
        this(angle, DEFAULT_X, DEFAULT_Y);
    }
    
    public BuildingBuilder(double angle, double x, double y)
    {
        this.x.set(x);
        this.y.set(y);
        this.angle.set(angle);
    }

    
    
    
    
    public double getY()
    {
        return y.get();
    }

    public void setY(double value)
    {
        y.set(value);
    }

    public DoubleProperty yProperty()
    {
        return y;
    }

    
    public double getX()
    {
        return x.get();
    }

    public void setX(double value)
    {
        x.set(value);
    }

    public DoubleProperty xProperty()
    {
        return x;
    }
    
    
    

    public final void setAngle(Double value)
    {
        angle.set(value);
    }

    public final Double getAngle()
    {
        return angle.get();
    }

    public final DoubleProperty angleProperty()
    {
        return angle;
    }
    
    public abstract T build();
    
}

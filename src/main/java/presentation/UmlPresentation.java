package presentation;

import org.jfree.graphics2d.svg.SVGGraphics2D;

import java.awt.*;
import java.util.List;

public class UmlPresentation {

    // General properties
    // TODO determine size from all the objects
    // (List of object to place and size, and calculate dimension)
    private List<Drawable> toDraw;
    private Color backgroundColor;
    private int fontSize;

    // Class properties
    private Color classColor;

    // TODO better (return SVG graphics 2D by computing size
    public void draw(SVGGraphics2D g2){
        for(Drawable object: toDraw){
            object.draw(g2, this);
        }
        g2.setColor(Color.BLACK);
        g2.drawRect(0,0,g2.getHeight(),g2.getWidth());
    }

    public UmlPresentation(List<Drawable> toDraw, Color backgroundColor, int fontSize, Color classColor) {
        this.toDraw = toDraw;
        this.backgroundColor = backgroundColor;
        this.fontSize = fontSize;
        this.classColor = classColor;
    }

    public List<Drawable> getToDraw() {
        return toDraw;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public int getFontSize(int percentage) {
        return (int) (percentage * fontSize) / 100;
    }

    public Color getClassColor() {
        return classColor;
    }

}

package presentation;

import java.awt.Graphics2D;
import java.awt.Dimension;

public interface Drawable {

    void draw(Graphics2D g2, UmlPresentation pres);

    Dimension computeSize(UmlPresentation pres);

}

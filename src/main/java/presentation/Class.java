package presentation;

import org.jfree.graphics2d.svg.SVGGraphics2D;
import util.Util;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Class implements Drawable {

    private String name;
    private List<String> properties;

    public Class(String name, List<String> properties) {
        this.name = name;
        this.properties = properties;
    }

    public void draw(Graphics2D g2, UmlPresentation pres) {
        // TODO shape instead of Rectangle
        // TODO placement
        Point cursor = new Point(50,50);
        Dimension size = this.computeSize(pres);
        g2.setColor(Color.BLUE);
        g2.drawRect(cursor.x, cursor.y, size.width, size.height);
        g2.setColor(pres.getClassColor());
        g2.fillRect(cursor.x, cursor.y, size.width, size.height);
        g2.setColor(Color.BLUE);

        int font20 = pres.getFontSize(20);
        int font80 = pres.getFontSize(80);

        Font nameFont = new Font("TimesRoman", Font.PLAIN, pres.getFontSize());
        Font propFont = new Font("TimesRoman", Font.PLAIN, pres.getFontSize(80));

        // Draw line
        g2.drawLine(cursor.x, cursor.y + pres.getFontSize(140) ,
                cursor.x + size.width, cursor.y + pres.getFontSize(140));

        // Draw class name
        // TODO interface pour draw avec un curseur ?
        cursor.translate(font20, pres.getFontSize(110));
        g2.setFont(nameFont);
        g2.drawString(name, cursor.x , cursor.y);
        cursor.translate(0, pres.getFontSize(30));

        // Draw properties
        g2.setFont(propFont);
        for(String prop: properties){
            cursor.translate(0, font20 + font80);
            g2.drawString(prop, cursor.x, cursor.y);
        }

    }

    public Dimension computeSize(UmlPresentation pres) {
        // Compute height
        // 20% + 100% + 20% + properties(20% + 80% + 20%)
        int propSize = properties.size();
        // Preserve a block if there is no property
        int length = propSize == 0 ? 1 : propSize;
        // TODO abstraction
        int height = pres.getFontSize(140 + propSize * 120);

        // Compute width based on string lengths (20% + content + 20%)
        List<String> allStrings = new ArrayList<String>();
        allStrings.addAll(properties);
        allStrings.add(name);
        int width = Util.findMaxLength(allStrings) * pres.getFontSize(50) + pres.getFontSize(40);

        return new Dimension(width, height);
    }

}

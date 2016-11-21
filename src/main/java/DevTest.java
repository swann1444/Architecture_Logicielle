import org.jfree.graphics2d.svg.SVGGraphics2D;
import org.jfree.graphics2d.svg.SVGUtils;
import presentation.Class;
import presentation.Drawable;
import presentation.UmlPresentation;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DevTest {

    public static void main(String[] args) throws IOException {
        int size = 800;
        SVGGraphics2D g2 = new SVGGraphics2D(size, size);
        List<Drawable> objects = new ArrayList<Drawable>();
        UmlPresentation pres = new UmlPresentation(objects, Color.WHITE, 16, Color.RED);

        // Simulate data
        List<String> properties = Arrays.asList("height: Int", "width: Int"
                , "gloubiboulga: SomethingReallyExcitingAboutYou", "a", "b", "c");
        Class c = new Class("Rectangle", properties);
        objects.add(c);

        pres.draw(g2);

        File test = new File("test.html");
        SVGUtils.writeToHTML(test, "title", g2.getSVGElement());
    }
}

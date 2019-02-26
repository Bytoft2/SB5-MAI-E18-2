/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import java.awt.Rectangle;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.*;

/**
 *
 * @author bytof
 */
public class New {

    //Vertical Adjustments
    public Rectangle verticalAdjustments(Rectangle bounds, int vspan) {
        if (bounds != null) {
            //Codeblock in statement could be shorter, if "slop" wasnt used.
            if (bounds.height != vspan) {
                bounds.y += (bounds.height - vspan) / 2;
                //sets height to be equal to vspan
                bounds.height = vspan;
            }
        }
        return bounds;
    }

    // horizontally align the interior
    public Rectangle horizontalAlign(Rectangle bounds, int align, int hspan) {
        if (bounds != null) {
            int slop = bounds.width - 1 - hspan;

            if (align == TRAILING) {
                align = RIGHT;
            }

            switch (align) {
                case SwingConstants.CENTER:
                    bounds.x += slop / 2;
                    bounds.width -= slop;
                    break;
                case SwingConstants.RIGHT:
                    bounds.x += slop;
                    bounds.width -= slop;
                    break;
            }
        }
        return bounds;
    }

}

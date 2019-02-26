/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import java.awt.*;
import javax.swing.*;
import static javax.swing.SwingConstants.*;

/**
 *
 * @author bytof
 */
public class Original {

    public Rectangle verticalAdjustments(Rectangle bounds, int vspan) {
        if (bounds.height != vspan) {
            int slop = bounds.height - vspan;
            bounds.y += slop / 2;
            bounds.height -= slop;
        }
        return bounds;
    }

    // horizontally align the interior
    public Rectangle horizontalAlign(Rectangle bounds, int align, int hspan) {
        int slop = bounds.width - 1 - hspan;

        if (true /*((JComponent) c).isLeftToRight()*/) {
            if (align == LEADING) {
                align = LEFT;
            } else if (align == TRAILING) {
                align = RIGHT;
            }
        } else {
            if (align == LEADING) {
                align = RIGHT;
            } else if (align == TRAILING) {
                align = LEFT;
            }
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
        return bounds;
    }

}

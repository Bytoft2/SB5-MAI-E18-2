/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import java.awt.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bytof
 */
public class NewTest {

    public NewTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of verticalAdjustments method, of class New.
     */
    @Test
    public void testVerticalAdjustments() {
        System.out.println("verticalAdjustments");
        Rectangle bounds = new Rectangle(10, 10, 10, 30);
        int vspan = 10;
        New instance = new New();
        Rectangle result = instance.verticalAdjustments(bounds, vspan);
        assertTrue(result.y > bounds.y && result.height == vspan);
    }

    /**
     * Test of verticalAdjustments method, of class New.
     */
    @Test
    public void testVerticalAdjustmentsSameHightAndSpan() {
        System.out.println("verticalAdjustments");
        Rectangle bounds = new Rectangle(10, 10, 10, 10);
        int vspan = 10;
        New instance = new New();
        Rectangle result = instance.verticalAdjustments(bounds, vspan);
        assertEquals(bounds, result);
    }

    /**
     * Test of verticalAdjustments method, of class New.
     */
    @Test
    public void testVerticalAdjustmentsWithSpanOf0() {
        System.out.println("verticalAdjustments");
        Rectangle bounds = new Rectangle(10, 10, 10, 10);
        int vspan = 0;
        New instance = new New();
        Rectangle result = instance.verticalAdjustments(bounds, vspan);
        assertTrue(result.height == 0);
    }

    /**
     * Test of verticalAdjustments method, of class New.
     */
    @Test
    public void testVerticalAdjustmentsWithHeightOf0() {
        System.out.println("verticalAdjustments");
        Rectangle bounds = new Rectangle(10, 10, 10, 0);
        int vspan = 10;
        New instance = new New();
        Rectangle result = instance.verticalAdjustments(bounds, vspan);
        assertTrue(result.height < 0 && result.y < bounds.y);
    }

    /**
     * Test of verticalAdjustments method, of class New.
     */
    @Test
    public void testVerticalAdjustmentsWithNull() {
        System.out.println("verticalAdjustments");
        Rectangle bounds = null;
        int vspan = 40;
        New instance = new New();
        Rectangle expResult = null;
        Rectangle result = instance.verticalAdjustments(bounds, vspan);
        assertEquals(expResult, result);
    }

    /**
     * Test of horizontalAlign method, of class New.
     */
    @Test
    public void testHorizontalAlign() {
        System.out.println("horizontalAlign");
        Rectangle bounds = new Rectangle(10, 10, 10, 10);
        int align = 1;
        int hspan = 40;
        New instance = new New();
        Rectangle expResult = null;
        Rectangle result = instance.horizontalAlign(bounds, align, hspan);
        assertEquals(expResult, result);
    }

    /**
     * Test of horizontalAlign method, of class New.
     */
    @Test
    public void testHorizontalAlignWithalignOf10() {
        System.out.println("horizontalAlign");
        Rectangle bounds = new Rectangle(10, 10, 10, 10);
        int align = 2;
        int hspan = 10;
        New instance = new New();
        Rectangle result = instance.horizontalAlign(bounds, align, hspan);
        assertTrue(result.x < bounds.x && result.width == 1 + hspan);
    }

    /**
     * Test of horizontalAlign method, of class New.
     */
    @Test
    public void testHorizontalAlignWithAlignOf0() {
        System.out.println("horizontalAlign");
        Rectangle bounds = new Rectangle(10, 10, 10, 10);
        int align = 0;
        int hspan = 10;
        New instance = new New();
        Rectangle result = instance.horizontalAlign(bounds, align, hspan);
        assertTrue(result.x < bounds.x && result.width == 1 + hspan);
    }

    /**
     * Test of horizontalAlign method, of class New.
     */
    @Test
    public void testHorizontalAlignWithNull() {
        System.out.println("horizontalAlign");
        Rectangle bounds = null;
        int align = 3;
        int hspan = 40;
        New instance = new New();
        Rectangle result = instance.horizontalAlign(bounds, align, hspan);
        assertEquals(bounds, result);
    }

}

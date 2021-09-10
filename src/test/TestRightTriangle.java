/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 9, 2021
 */

package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.RightTriangle;

public class TestRightTriangle {
    @Before
    public void setUp() throws Exception { }
    
    @Test
    public void testDefaultConstructorNotNull() {
        RightTriangle rightTriangle = new RightTriangle();
        
        assertNotNull(rightTriangle);
        assertNotNull(rightTriangle.getBase());
        assertNotNull(rightTriangle.getHeight());
        assertNotNull(rightTriangle.toString());
        assertNotNull(rightTriangle.getHypotenuse());
        assertNotNull(rightTriangle.getPerimeter());
        assertNotNull(rightTriangle.getArea());
    }
    
    @Test
    public void testMainConstructorNegativeParametersNotNull() {
        RightTriangle rightTriangle = new RightTriangle(-2.0, -3.0);
        
        assertNotNull(rightTriangle);
        assertNotNull(rightTriangle.getBase());
        assertNotNull(rightTriangle.getHeight());
        assertNotNull(rightTriangle.toString());
        assertNotNull(rightTriangle.getHypotenuse());
        assertNotNull(rightTriangle.getPerimeter());
        assertNotNull(rightTriangle.getArea());
    }
    
    @Test
    public void testBaseSetterPositiveValue() {
        RightTriangle rightTriangle = new RightTriangle();
        
        final double NEW_BASE = 25.0;
        
        rightTriangle.setBase(NEW_BASE);
        
        final double EXPECTED_BASE = 25.0;
        
        assertEquals(EXPECTED_BASE, rightTriangle.getBase(), 0.001);
    }
    
    @Test
    public void testBaseSetterZeroValue() {
        RightTriangle rightTriangle = new RightTriangle();
        
        final double NEW_BASE = 0.0;
        
        rightTriangle.setBase(NEW_BASE);
        
        final double EXPECTED_BASE = 1.0;
        
        assertEquals(EXPECTED_BASE, rightTriangle.getBase(), 0.001);
    }
    
    @Test
    public void testBaseSetterNegativeValue() {
        RightTriangle rightTriangle = new RightTriangle();
        
        final double NEW_BASE = -1.0;
        
        rightTriangle.setBase(NEW_BASE);
        
        final double EXPECTED_BASE = 1.0;
        
        assertEquals(EXPECTED_BASE, rightTriangle.getBase(), 0.001);
    }
    
    @Test
    public void testHeightSetterPositiveValue() {
        RightTriangle rightTriangle = new RightTriangle();
        
        final double NEW_HEIGHT = 0.5;
        
        rightTriangle.setHeight(NEW_HEIGHT);
        
        final double EXPECTED_HEIGHT = 0.5;
        
        assertEquals(EXPECTED_HEIGHT, rightTriangle.getHeight(), 0.001);
    }
    
    @Test
    public void testHeightSetterZeroValue() {
        RightTriangle rightTriangle = new RightTriangle();
        
        final double NEW_HEIGHT = 0.0;
        
        rightTriangle.setHeight(NEW_HEIGHT);
        
        final double EXPECTED_HEIGHT = 1.0;
        
        assertEquals(EXPECTED_HEIGHT, rightTriangle.getHeight(), 0.001);
    }
    
    @Test
    public void testHeightSetterNegativeValue() {
        RightTriangle rightTriangle = new RightTriangle();
        
        final double NEW_HEIGHT = -1.0;
        
        rightTriangle.setHeight(NEW_HEIGHT);
        
        final double EXPECTED_HEIGHT = 1.0;
        
        assertEquals(EXPECTED_HEIGHT, rightTriangle.getHeight(), 0.001);
    }
    
    @Test
    public void testGetHypotenuse() {
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        
        final double EXPECTED_HYPOTENUSE = 5.0;
        
        assertTrue(Double.compare(rightTriangle.getHypotenuse(), EXPECTED_HYPOTENUSE) == 0);
    }
    
    @Test
    public void testGetPerimeter() {
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        
        final double EXPECTED_PERIMETER = 12.0;
        
        assertTrue(Double.compare(rightTriangle.getPerimeter(), EXPECTED_PERIMETER) == 0);
    }
    
    @Test
    public void testGetArea() {
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        
        final double EXPECTED_AREA = 6.0;
        
        assertTrue(Double.compare(rightTriangle.getArea(), EXPECTED_AREA) == 0);
    }
}

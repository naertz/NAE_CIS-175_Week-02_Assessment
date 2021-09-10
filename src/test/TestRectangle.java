/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 9, 2021
 */

package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Rectangle;

public class TestRectangle {
    @Before
    public void setUp() throws Exception { }
    
    @Test
    public void testDefaultConstructorNotNull() {
        Rectangle rectangle = new Rectangle();
        
        assertNotNull(rectangle);
        assertNotNull(rectangle.getWidth());
        assertNotNull(rectangle.getHeight());
        assertNotNull(rectangle.toString());
        assertNotNull(rectangle.getPerimeter());
        assertNotNull(rectangle.getArea());
    }
    
    @Test
    public void testMainConstructorNegativeParametersNotNull() {
        Rectangle rectangle = new Rectangle(-2.0, -3.0);
        
        assertNotNull(rectangle);
        assertNotNull(rectangle.getWidth());
        assertNotNull(rectangle.getHeight());
        assertNotNull(rectangle.toString());
        assertNotNull(rectangle.getPerimeter());
        assertNotNull(rectangle.getArea());
    }
    
    @Test
    public void testWidthSetterPositiveValue() {
        Rectangle rectangle = new Rectangle();
        
        final double NEW_WIDTH = 25.0;
        
        rectangle.setWidth(NEW_WIDTH);
        
        final double EXPECTED_WIDTH = 25.0;
        
        assertEquals(EXPECTED_WIDTH, rectangle.getWidth(), 0.001);
    }
    
    @Test
    public void testWidthSetterZeroValue() {
        Rectangle rectangle = new Rectangle();
        
        final double NEW_WIDTH = 0.0;
        
        rectangle.setWidth(NEW_WIDTH);
        
        final double EXPECTED_WIDTH = 1.0;
        
        assertEquals(EXPECTED_WIDTH, rectangle.getWidth(), 0.001);
    }
    
    @Test
    public void testWidthSetterNegativeValue() {
        Rectangle rectangle = new Rectangle();
        
        final double NEW_WIDTH = -1.0;
        
        rectangle.setWidth(NEW_WIDTH);
        
        final double EXPECTED_WIDTH = 1.0;
        
        assertEquals(EXPECTED_WIDTH, rectangle.getWidth(), 0.001);
    }
    
    @Test
    public void testHeightSetterPositiveValue() {
        Rectangle rectangle = new Rectangle();
        
        final double NEW_HEIGHT = 0.5;
        
        rectangle.setHeight(NEW_HEIGHT);
        
        final double EXPECTED_HEIGHT = 0.5;
        
        assertEquals(EXPECTED_HEIGHT, rectangle.getHeight(), 0.001);
    }
    
    @Test
    public void testHeightSetterZeroValue() {
Rectangle rectangle = new Rectangle();
        
        final double NEW_HEIGHT = 0.0;
        
        rectangle.setHeight(NEW_HEIGHT);
        
        final double EXPECTED_HEIGHT = 1.0;
        
        assertEquals(EXPECTED_HEIGHT, rectangle.getHeight(), 0.001);
    }
    
    @Test
    public void testHeightSetterNegativeValue() {
        Rectangle rectangle = new Rectangle();
        
        final double NEW_HEIGHT = -1.0;
        
        rectangle.setHeight(NEW_HEIGHT);
        
        final double EXPECTED_HEIGHT = 1.0;
        
        assertEquals(EXPECTED_HEIGHT, rectangle.getHeight(), 0.001);
    }
    
    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(3, 4);
        
        final double EXPECTED_PERIMETER = 14.0;
        
        assertTrue(Double.compare(rectangle.getPerimeter(), EXPECTED_PERIMETER) == 0);
    }
    
    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        
        final double EXPECTED_AREA = 12.0;
        
        assertTrue(Double.compare(rectangle.getArea(), EXPECTED_AREA) == 0);
    }
}

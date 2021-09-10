/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 9, 2021
 */

package model;

public class Rectangle implements Shape {
    // Instance Variable(s) ========
    private double width;  // Width
    private double height; // Height
    // =============================
    
    // Constructor(s) =============================
    // Default
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    
    // Main
    public Rectangle(double width, double height) {
        // Width must be greater than 0.
        if (Double.compare(width, 0.0) <= 0) {
            this.width = 1.0;
        } else {
            this.width = width;
        }
        
        // Height must be greater than 0.
        if (Double.compare(height, 0.0) <= 0) {
            this.height = 1.0;
        } else {
            this.height = height;
        }
    }
    // ============================================
    
    // Setter(s) ==============================
    // Width
    public void setWidth(double width) {
        // Width must be greater than 0.
        if (Double.compare(width, 0.0) <= 0) {
            this.width = 1.0;
        } else {
            this.width = width;
        }
    }
    
    // Height
    public void setHeight(double height) {
        // Height must be greater than 0.
        if (Double.compare(height, 0.0) <= 0) {
            this.height = 1.0;
        } else {
            this.height = height;
        }
    }
    // ========================================
    
    // Getter(s) ==============
    // Width
    public double getWidth() {
        return width;
    }
    
    // Height
    public double getHeight() {
        return height;
    }
    // ========================
    
    // Method(s) =======================================================
    // toString
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
    
    // Perimeter
    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
    
    // Area
    @Override
    public double getArea() {
        return width * height;
    }
    // =================================================================
}

/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 9, 2021
 */

package model;

import java.lang.Math;

public class RightTriangle implements Shape {
 // Instance Variable(s) ===========
    private double base;   // Base
    private double height; // Height
    // =============================
    
    // Constructor(s) =============================
    // Default
    public RightTriangle() {
        this.base = 1.0;
        this.height = 1.0;
    }
    
    // Main
    public RightTriangle(double base, double height) {
        // Base must be greater than 0.
        if (Double.compare(base, 0.0) <= 0) {
            this.base = 1.0;
        } else {
            this.base = base;
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
    // Base
    public void setBase(double base) {
        // Base must be greater than 0.
        if (Double.compare(base, 0.0) <= 0) {
            this.base = 1.0;
        } else {
            this.base = base;
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
    public double getBase() {
        return base;
    }
    
    // Height
    public double getHeight() {
        return height;
    }
    // ========================
    
    // Method(s) =========================================================
    // toString
    @Override
    public String toString() {
        return "RightTriangle [base=" + base + ", height=" + height + "]";
    }
    
    // Hypotenuse
    public double getHypotenuse() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    
    // Perimeter
    @Override
    public double getPerimeter() {
        return base + height + getHypotenuse();
    }
    
    // Area
    @Override
    public double getArea() {
        return base * height * 0.5;
    }
    // ===================================================================
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camsley.mavenjenkins.control;

/**
 *
 * @author camsl
 */
public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        
        System.out.println(t.triType(5, 5, -3));
    }
    
}

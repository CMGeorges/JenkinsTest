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
//3 = N'est pas un triangle
//2 = Triangle équilatéral
//1 = Triangle isocèle
//0 = Triangle quelconque
public class Triangle implements InterfaceTriangle{
	public int triType(int i, int j, int k){
		  int trityp = 0;
		  if (i < 0.0 || j < 0.0 || k < 0.0)              
		    return 3;
		  if (i + j <= k || j + k <= i || k + i <= j)  
		    return 3;    
		  if (i == j) trityp = trityp + 1;            
		  if (i == k) trityp = trityp + 1;            
		  if (j == k) trityp = trityp + 1;            
		  if (trityp >= 2)                            
		      trityp = 2;
		  return trityp; 
		}
}

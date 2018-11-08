package arbolesygrafos;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Grafos2 {
    
    
    public static boolean es_id(String cad){
     int M[][]={{1,1,1,-1,-1},{1,1,1,1,-1}},edo=0, ent;
        for (int i = 0; i <cad.length(); i++) {
            char c= cad.charAt(i);
            if(c=='_')ent=1; else if(c=='$')ent=2;
            else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) ent=0;
            else if(Character.isDigit(c))ent = 3;
            else  return false;
            edo=M[edo][ent]; if(edo==-1) return false;
        }//for
        
        return true;
    }
    
    public static boolean es_int(String cad){
     int M[][]={{1,1,-1},{1,-1,-1}},edo=0, ent;
        for (int i = 0; i <cad.length(); i++) {
            char c= cad.charAt(i);
            if(c=='-')ent=1;
           
            else if(Character.isDigit(c))ent = 0;
            else  return false;
            edo=M[edo][ent]; if(edo==-1) return false;
        }//for
        
        return true;
    }
    
    public static boolean es_float(String cad){
        cad=cad.trim();
     int M[][]={{1,2,-1,-1},{1,-1,3,-1},{-1,-1,-1,-1},{3,-1,-1,-1}},edo=0, ent;
        for (int i = 0; i <cad.length(); i++) {
            char c= cad.charAt(i);
            if(c=='-')ent=1; else if(c=='.') ent=2;
           
            else if(Character.isDigit(c))ent = 0;
            else  return false;
            edo=M[edo][ent]; if(edo==-1) return false;
        }//for
        
        return true;
    }
    
    public static boolean es_Hex(String cad){
     int M[][]={{0,0,-1}},edo=0, ent;
        for (int i = 0; i <cad.length(); i++) {
            char c= cad.charAt(i);
            if(Character.isDigit(c))ent=0;
           
            else if(c>='A'&&c<='F')ent = 1;
            else  return false;
            edo=M[edo][ent]; if(edo==-1) return false;
        }//for
        
        return true;
    }
    
    public static int esOp(String c){
        String OP[]={"=","+","-","*","/","x",";"};
        for (int i = 0; i < OP.length; i++) 
            if(c.equals(OP[i])) return i;
            return -1;
    }
    
    public static void main(String[] args) {
      //  JOptionPane.showMessageDialog(null,es_id("$1a"));
        JOptionPane.showMessageDialog(null,es_float("0.16 "));
    }
}

/*0| 1,1,-1,-1
  1| 1,-1,2,-1
  2| 2,-1,-,-1
*/

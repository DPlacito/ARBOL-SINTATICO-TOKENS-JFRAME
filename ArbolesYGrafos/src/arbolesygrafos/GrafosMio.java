/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesygrafos;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author esau_
 */
public class GrafosMio {

    public static boolean esIde(String cad) {
        int M[][] = {{1, 1, -1, -1}, {1, 1, 1, -1}};
        int estado = 0, entrada;
        for (int i = 0; i < cad.length(); i++) {
            int c = cad.charAt(i);
            if (c == '_') {
                entrada = 1;
            } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                entrada = 0;
            }// else if (c >= '0' && c <= '9') {
               // entrada = 2;
             else {
                return false;
            }
            estado = M[estado][entrada];
            if (estado == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean esFloat(String cad) {
        int M[][] = {{1, 1, -1, -1, -1}, {1, -1, -1, 2, -1}, {-1, -1, 2, -1, -1}};
        int edo = 0, ent;
        boolean punto = false;
        for (int i = 0; i < cad.length(); i++) {
            int c = cad.charAt(i);
            if (c == '-') {
                ent = 1;
            } else if (c == '.') {
                ent = 3;
                punto = true;
            } else if ((c >= '0' && c <= '9') && punto == false) {
                ent = 0;
            } else if ((c >= '0' && c <= '9') && punto) {
                ent = 2;
            } else {
                return false;
            }
            edo = M[edo][ent];
            if (edo == -1) {
                return false;
            }
        }//for
        return true;
    }

    public static boolean esEntero(String cad) {
        int M[][] = {{1, 1, -1}, {1, -1, -1}}, edo = 0, ent;
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == '-') {
                ent = 1;
            } else if (Character.isDigit(c)) {
                ent = 0;
            } else {
                return false;
            }
            edo = M[edo][ent];
            if (edo == -1) {
                return false;
            }
        }//for

        return true;
    }

    public static boolean esHex(String cad) {
        int M[][] = {{0, 0, -1}};
        int estado = 0, entrada;
        for (int i = 0; i < cad.length(); i++) {
            int c = cad.charAt(i);
            if(c=='#'){entrada=0;}
            else if (Character.isDigit(c)) {
                entrada = 1;
            } else if (c >= 'A' && c <= 'F' || c>='a'&&c<='f') {
                entrada = 1;
            } else {
                return false;
            }
            estado = M[estado][entrada];
            if (estado == -1) {
                return false;
            }
        }
        return true;
        /*        int M[][]={{0,0,-1}},edo=0, ent;
        for (int i = 0; i <cad.length(); i++) {
            char c= cad.charAt(i);
            if(Character.isDigit(c))ent=0;
           
            else if(c>='A'&&c<='F')ent = 1;
            else  return false;
            edo=M[edo][ent]; if(edo==-1) return false;
        }//for
        
        return true;
                }*/

    }

    public static void main(String arg[]) {
        showMessageDialog(null, esHex("1A"));

    }
}

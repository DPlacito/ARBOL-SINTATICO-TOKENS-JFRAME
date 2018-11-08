package arbolesygrafos;


import static javax.swing.JOptionPane.showMessageDialog;


public class Grafos {
    
    
    public static boolean esIde(String cad){
        int M[][]={{1,1,-1,-1},{1,1,1,-1}},edo=0,ent;
        for(int i=0;i<cad.length();i++){
            int c=cad.charAt(i);
            if(c=='_') ent=1;
            else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) ent=0;
            else if((c>='0'&&c<='9')) ent=2;
            else return false;
            edo=M[edo][ent];
            if(edo==-1) return false;
        }
        
        return true;
            
        }
    
    
    public static boolean esHex(String cad){
        int M[][]={{0,0,-1}},edo=0,ent;
        for(int i=0;i<cad.length();i++){
            int c=cad.charAt(i);
            if(Character.isDigit(c)) ent=0;
            else if(c>='A'&&c<='F') ent=-1;
            else return false;
            edo=M[edo][ent];
            if(edo==-1) return false;
        } 
        return true;    
        }
    
    public static boolean esInt(String cad){
        int M[][]={ {1,1,-1,-1,-1},
                    {1,-1,-1,2,-1},
                    {-1,-1,2,-1,-1}},edo=0,ent;
        for(int i=0;i<cad.length();i++){
            int c=cad.charAt(i);
            if(c=='-') ent=1;
            else if(c>='0'&&c<='9') ent=0;
            else return false;
            edo=M[edo][ent];
            if(edo==-1) return false;
            //estado son los renglones
            //ent columnas
        }
        return true;      
        }
    
    
     public static boolean esFloat(String cad){
        int edo=0,ent;
        int M[][]={{2,1,-1,-1},{2,-1,-1,-1},{2,-1,3,-1},{3,-1,-1,-1}}; 
   for(int i=0;i<cad.length();i++){
    int c=cad.charAt(i);
    if(c>=48 && c<=57)ent=0;
    else if(c=='-')ent=1;
    else if(c=='.')ent=2;
    else ent=3;
    edo=M[edo][ent]; if(edo==1) return false;
}//for
   return true; 
     }
    
    public static void main(String[] args){
        showMessageDialog(null,esFloat("7"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesygrafos;

/**
 *
 * @author esau_
 */
public
        class ArbolBinE {
            private NodoA raiz;

    public
    ArbolBinE() {
        raiz=null;
    }
    
    public NodoA busca(int e)
    {
        return busca(getRaiz(),e);
    }
    
    public NodoA busca(NodoA a, int e){
        if(a==null) return null;
        if(a.getDato()==e) return a;
        if(e>a.getDato()) return busca(a.getDer(),e);
        else return busca(a.getIzq(),e);
    }
    
    public boolean eliminar(int e){
        NodoA nodo= busca(e);
        if(nodo==null) return false;
        else{
            if(nodo.getDer()==null && nodo.getIzq()==null){
                //lo borras
            }
             if(nodo.getDer()==null && nodo.getIzq()!=null){
                 //subes get izquierda
             }
             if(nodo.getDer()!=null && nodo.getIzq()==null){
                 //subes get derecha
             }
             if(nodo.getDer().getDato()>nodo.getIzq().getDato()){
                 //subes get derecha y pones como hijo get izquierda
             }
                 else{
                 //subes get izquierda y pones como hijo get derecha
             }
        }
        return false;
    }

    public void insertar(int e){
        if(raiz==null)
        {
            raiz=new NodoA(e);
        }
        else
        {
            NodoA aux=raiz, padre=null;
            while(aux!=null)
            {
                padre = aux;
                if(e>=aux.getDato())
                {
                    aux=aux.getDer();
                }
                else
                {
                    aux=aux.getIzq();
                }
            }
            if(e>=padre.getDato())
            {
                padre.setDer(new NodoA(e));
            }
            else{
                padre.setIzq(new NodoA(e));
            }
        }
    }
    
    public void inorden(NodoA a){
        if(a==null)
            return;
        inorden(a.getIzq());
        System.out.print(a);
        inorden(a.getDer());
    }

    public
    NodoA getRaiz() {
        return raiz;
    }

    public
    void setRaiz(NodoA raiz) {
        this.raiz = raiz;
    }
    
    
    
    public static void main (String arg[]){
        ArbolBinE a= new ArbolBinE();
        a.insertar(3);
        a.insertar(7);
        a.insertar(20);
        a.insertar(8);
        a.insertar(2);
        a.inorden(a.getRaiz());
        a.busca(2);
    }
            
}

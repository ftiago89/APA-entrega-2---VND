
package vnd;

import model.Grafo;
import model.Leitor;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leitor leitor = new Leitor("entradaBrasilTSPLIB.txt");
        Grafo G = new Grafo(leitor.getnVertices(), leitor.getVertices(), leitor.getArestas());
        
        int[] teste = G.getSolucaoInicial(1);
        
        VND vnd = new VND(G, teste);
        
        vnd.run();
        
    }
    
}

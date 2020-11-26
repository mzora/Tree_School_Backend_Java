package MiniEcommerce;

import java.util.ArrayList;
import java.util.HashSet;

public class MiniEcommerce {
    private HashSet<Product> prodotti;
    public MiniEcommerce(){
        this.prodotti=new HashSet<Product>();
    }

    public void addProduct(String nome, String descr, int qta, float price){
        prodotti.add(new Product(nome, descr, qta, price));
    }

    public void remProduct(Product p){
        prodotti.remove(p);
    }

    public void updateQta(Product p, int qta){
        if(prodotti.contains(p)){
            p.setQtaDisponibile(qta);
        }
    }

    public void acquistaProdotto(Product p, int qta){
        if(prodotti.contains(p)){
            if(p.getQtaDisponibile()>qta){
                p.setQtaDisponibile(p.getQtaDisponibile()-qta);
            }
        }
    }

    public void showProducts(){
        for (Product product : prodotti) {
            System.out.println(product.toString());
        }
    }

    public HashSet<Product> getProdotti() {
        return prodotti;
    }
}

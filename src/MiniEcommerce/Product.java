package MiniEcommerce;

import java.util.UUID;

public class Product {
    private UUID id;
    private String nome;
    private String descrizione;
    private int qtaDisponibile;
    private float price;

    public Product(){
        this.id = UUID.randomUUID();
    }

    public Product(String nome, String descrizione,int qta ,float price) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.descrizione = descrizione;
        this.qtaDisponibile = qta;
        this.price = price;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setQtaDisponibile(int qtaDisponibile) {
        this.qtaDisponibile = qtaDisponibile;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getQtaDisponibile() {
        return qtaDisponibile;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", qtaDisponibile=" + qtaDisponibile +
                ", price=" + price +
                '}';
    }
}

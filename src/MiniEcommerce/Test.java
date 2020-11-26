package MiniEcommerce;
import com.google.gson.Gson;

import static spark.Spark.*;

public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();

        MiniEcommerce eCommerce = new MiniEcommerce();

        get("/hello",(req,res)->"hello world)");

        post("/hello",(req,res)->{
            System.out.println(req.body());
            return "post ricevuta";
        });

        post("/products",(req,res)->{
            Product p = gson.fromJson(req.body(), Product.class);
            System.out.println(p.toString());
            return "prodotto ricevuto";
        });

        put("/products",((request, response) -> {
            String s = request.queryMap().get("nome").value();
            String s1 = request.queryMap().get("descrizione").value();
            int qta = Integer.parseInt(request.queryMap().get("quantita").value());
            float prezzo = Float.parseFloat(request.queryMap().get("prezzo").value());

            eCommerce.addProduct(s,s1,qta,prezzo);
            //eCommerce.showProducts();
            response.type("application/json");
            response.status(200);

            return gson.toJson(eCommerce.getProdotti());
        }));

    }

    public static void getProductFromClient(){

    }

}

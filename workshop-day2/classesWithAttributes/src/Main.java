public class Main {
    public static void main(String[] args) {
        Product product=new Product();

        product.setName("Laptop");
        product.setId(1);
        product.setDescription("PC");
        product.setColour("black");
        product.setStockAmount(10);
        product.setPrice(100);



        ProductManager productManager=new ProductManager();
        productManager.add(product );
    }
}
public class Main {
    public static void main(String[] args) {
        Product product = new Product(122 , "Monster Abra v17.1" , "Monster Laptop" , 17499 , 104);
        Product product1 = new Product();
        product1.setName("Monster Abra a5 v17.2") ;
        product1.setId(123) ;
        product1.setDescription("Monster Laptop") ;
        product1.setPrice(17999) ;
        product1.setStockAmount(127) ;

        ProductManager productManager = new ProductManager();
        productManager.Add(product1);
        productManager.Add(product);
    }
}
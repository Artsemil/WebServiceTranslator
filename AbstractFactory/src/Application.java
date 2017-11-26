public class Application {
    private Product product;

    public Application(Factory factory){
        this.product = factory.createProducr();
    }

    public void doStuff(){
        product.doStuff();
    }
}

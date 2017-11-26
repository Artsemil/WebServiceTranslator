import java.util.Random;

public class Run {
    private static Application congigApp(){
        Application app;
        Factory factory;
        Random random = new Random();
        int R = random.nextInt(10);
        System.out.println(R);
        if (R<5){
            factory = new BingoFactory();
            app = new Application(factory);
        }
        else {
            factory = new SlotFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = congigApp();
        app.doStuff();
    }
}

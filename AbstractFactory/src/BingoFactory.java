public class BingoFactory implements Factory {
    @Override
    public Product createProducr() {
        return new ProductBingo();
    }
}

public class SlotFactory implements Factory {
    @Override
    public Product createProducr() {
        return new ProductSlot();
    }
}

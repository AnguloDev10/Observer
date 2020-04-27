public class BinaryObserver implements Observer {



    @Override
    public void update(int state) {
        System.out.println("Binary String: " + Integer.toBinaryString(state));
    }
}

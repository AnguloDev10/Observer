public class ObserverPatternDemo {

    public static void main(String[] args) {
       BinaryObserver binaryObserver= new BinaryObserver();
       OctalObserver octalObserver =new OctalObserver();
      HexaObserver hexaObserver =  new HexaObserver();
        Sample sample = new Sample();
        sample.attach(binaryObserver);
        sample.attach(octalObserver);
        sample.attach(hexaObserver);

        System.out.println("First state change: 15");
        sample.setState(15);
    }
}

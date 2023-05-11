public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Labsky myPet = new Labsky();

        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.coatColor);
        System.out.println(myPet.height);
        System.out.println(myPet.weight);
    }
}
public class MainDragon19 {
    public static void main(String[] args) {
        Dragon19 dragon = new Dragon19(10, 10); 
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveDown(); 
    }
}

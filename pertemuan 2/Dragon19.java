public class Dragon19 {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon19(int width, int height) {
        this.width = width;
        this.height = height;
        x = width / 2;
        y = height / 2;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x < width - 1) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y < height - 1) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }
}

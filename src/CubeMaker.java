public class CubeMaker {
    public static class Cube {
        private int sideLength;

        public Cube() {
            sideLength = 1;
        }
        
        public Cube(int side) {
            if (side < 1) {
                throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
            }
            sideLength = side;
        }

        public int getSide() {
            return sideLength;
        }

        public void setSide(int side) {
            if (side < 1) {
                throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
            }
            sideLength = side;
        }

        public int calculateSurfaceArea() {
            return 6 * (sideLength * sideLength);
        }

        public int calculateVolume() {
            return sideLength * sideLength * sideLength;
        }

        public String toString() {
            return "Cube{side=" + sideLength + "}";
        }
    }

    public static void main(String[] args) { // The CubeTester.java file doesn't work on my computer because it says "the import org.junit cannot be resolved", so I made my own testing program.
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(5);
        Cube cube3 = new Cube(5);
        Cube cube4 = new Cube(7);
        answerTest(cube1.getSide(), 1);
        answerTest(cube2.getSide(), 5);
        cube3.setSide(7);
        answerTest(cube3.getSide(), 7);
        answerTest(cube2.calculateVolume(), 125);
        answerTest(cube4.calculateVolume(), 343);
        answerTest(cube2.calculateSurfaceArea(), 150);
        answerTest(cube4.calculateSurfaceArea(), 294);
        Cube cube5 = new Cube(2);
        cube5.setSide(0);

    }

    public static void answerTest(int input, int answer) {
        System.out.println(input + ", answer " + answer);
    }
}

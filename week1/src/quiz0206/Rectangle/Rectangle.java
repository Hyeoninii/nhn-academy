package quiz0206.Rectangle;

public class Rectangle {
        private int x;
        private int y;

        public Rectangle() {}
        public Rectangle(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int Area() {
            return this.x*this.y;
        }
}
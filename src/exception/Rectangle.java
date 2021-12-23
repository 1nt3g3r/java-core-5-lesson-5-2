package exception;

import java.util.Objects;

public class Rectangle {
    private int w;
    private int h;

    public Rectangle(int w, int h) {
        if (w <= 0 || h <= 0) {
            throw new InvalidRectangleInitException();
        }

        this.w = w;
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle another = (Rectangle) o;

        int myArea = w * h;
        int anotherArea = another.w * another.h;

        return myArea == anotherArea;
    }

    @Override
    public int hashCode() {
        return Objects.hash(w * h);
    }

    public static void main(String[] args) {
        try {
            new Rectangle(0, 20);
        } catch (InvalidRectangleInitException ex) {
            System.out.println("Catched!");
        }


        try {
            System.out.println(5 / 0);
            new Rectangle(0, 20);
        } catch (Exception ex) {
            System.out.println("Catch anything");
            ex.printStackTrace();
        }
    }
}

    enum Shapes{square, rectangle, circle, trapezoid, rhombus, triangle, oval, hexagon}

    class EnumDemo{
        public static void main(String[] args) {
            System.out.println("These are the constants of the Shapes enum and their ordinal values");
            for (Shapes s : Shapes.values())
                System.out.println(s + " " + s.ordinal());
        }

    }

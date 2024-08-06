package flyweight;

import java.util.*;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    private int x;
    private int y;
    private int radius;
    private Image bgImage;

    public Circle(int x, int y, int radius, Image bgImage) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.bgImage = bgImage;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle - x : " + x + ", y : " + y +
                ", radius : " + radius + ", bg_image : " + bgImage.getFilename());
    }
}

class Image {
    private String filename;

    public Image(String filename) {
        this.filename = filename;
        System.out.println("Load image from " + filename);
    }

    public String getFilename() {
        return filename;
    }
}

class ShapeFactory {
    private static final Map<String, Image> bgImages = new HashMap<>();

    public static Circle getCircle(int x, int y, int radius, String bgImageFilename) {
        Image bgImage = bgImages.get(bgImageFilename);
        if (bgImage == null) {
            bgImage = new Image(bgImageFilename);
            bgImages.put(bgImageFilename, bgImage);
        }

        return new Circle(x, y, radius, bgImage);
    }
}


class MainClass {
    public static void main(String[] args) {
        String[] bgImageFilenames = {"flower.png", "butterfly.png"};
        List<Circle> circles = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(1001); // 0 ~ 1000
            int y = random.nextInt(1001); // 0 ~ 1000
            int radius = random.nextInt(100) + 1; // 1 ~ 100
            String bgImageFilename = bgImageFilenames[radius % bgImageFilenames.length];

            Circle circle = ShapeFactory.getCircle(x, y, radius, bgImageFilename);
            circles.add(circle);
        }

        for (Circle circle : circles) {
            circle.draw();
        }
    }
}
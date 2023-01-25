public class Camera {
    static int cameraCounter = 0;
    String brand;
    int megaPixels;
    int displaySize;
    Boolean colored;
    Lens cameraLens;

    // FIXME KEINe Kamera erzeugbar sein die ungueltige Lense hat (exceptions). => Wenn ich den ersten Camera Konstruktor benutze, sind die Brennweiten von Lens gleich 0. Wenn der User vergisst, sie einzustellen, habe ich eine ungueltige Linse.
    public Camera(String brand, int megaPixels, int displaySize, Boolean colored) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.cameraLens = new Lens();
        cameraCounter++;
    }

    public Camera(String brand, int megaPixels, int displaySize, Boolean colored, Lens cameraLens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.cameraLens = cameraLens;
        cameraCounter++;
    }

    public int getNumberOfCameras() {
        return cameraCounter;
    }

    // Getters
    public String getBrand() {
        return this.brand;
    }

    public int getMegaPixels() {
        return this.megaPixels;
    }

    public int getDisplaySize() {
        return this.displaySize;
    }

    public Boolean getColored() {
        return this.colored;
    }

    public Lens getLens() {
        return this.cameraLens;
    }

    // Setters

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public void setColored(Boolean colored) {
        this.colored = colored;
    }

    public void setLens(Lens newLens) {
        this.cameraLens = newLens;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", cameraLens=" + cameraLens +
                '}';
    }
}

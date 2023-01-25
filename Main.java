/*

Klassen:
- Camera
    - static cameraCounter
    - brand
    - megaPixels
    - displaySize
    - Boolean colored
    - lens (= Objektiv)

    Methoden
    - toString (override)
    - getter und setter fuer jede Variable

- Lens
    - static lensCounter
    - minimal focal length (Brennweite)
    - maximal focal length
    // max focal length > min focal length

    Methoden
    - toString (override)

QUESTIONS:
 TODO Should there be a way to delete cameras and lenses, and to decrement the counters?

 */


public class Main {

    public static void main(String[] args) {
        // Wenn ich keine Linse uebergebe, sind minFocalLength und maxFocalLength 0.
        Camera myCamera = new Camera("Nikon", 2000, 50000, true, new Lens(100, 200));
        System.out.println(myCamera.toString());
        myCamera.setBrand("Canon");
        System.out.println(myCamera.toString());
        System.out.println(myCamera.getBrand());

        myCamera.setLens(new Lens(500, 1000));
        System.out.println("myCamera: " + myCamera.toString());
        Lens emptyLens = new Lens();
        System.out.println("empty lens, minFocalLength: " + emptyLens.getMinFocalLength());
        System.out.println("emptyLens, maxFocalLength " + emptyLens.getMaxFocalLength());

        Camera cameraWithLens = new Camera("Alf", 100, 10000, false, new Lens(500, 1000));
        System.out.println(cameraWithLens.toString());

        System.out.println("Number of cameras: " + cameraWithLens.getNumberOfCameras()); // exp.: 2, reality: 2
        // Wie kann ich den lensCounter abrufen, der static ist? Es scheint merkwuerdig, den getter von einer Instanz der Klasse aus abzurufen.
        System.out.println("Number of lenses: " + cameraWithLens.cameraLens.getNumberOfLenses());
    }
}

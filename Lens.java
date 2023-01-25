public class Lens {
    private static int lensCounter = 0;
    // TODO Standardwerte anlegen
    private int minFocalLength;
    private int maxFocalLength;

    public Lens(int minFocalLength, int maxFocalLength) {
        if (minFocalLength < maxFocalLength) {
            this.minFocalLength = minFocalLength;
            this.maxFocalLength = maxFocalLength;
            lensCounter++;
        } else {
            throw new IllegalArgumentException("minFocalLength needs to be smaller than maxFocalLength.");
        }
    }

    public Lens() {
        lensCounter++;
    }

    public int getNumberOfLenses() {
        return lensCounter;
    }

    public int getMaxFocalLength() {
        return this.maxFocalLength;
    }

    public int getMinFocalLength() {
        return this.minFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        if (!checkFocalLengths(this.minFocalLength, maxFocalLength)) {
            throw new IllegalArgumentException("minFocalLength needs to be smaller than maxFocalLength.");
        } else {
            this.maxFocalLength = maxFocalLength;
        }
    }

    public void setMinFocalLength(int minFocalLength) {
        if (!checkFocalLengths(minFocalLength, this.maxFocalLength)) {
            throw new IllegalArgumentException("minFocalLength needs to be smaller than maxFocalLength.");
        } else {
            this.minFocalLength = minFocalLength;
        }
    }

    private Boolean checkFocalLengths(int minFocalLength, int maxFocalLength) {
        return maxFocalLength > minFocalLength;
    }


    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }
}

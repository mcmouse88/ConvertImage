package ru.netology.graphics.image;

public class BadImageSizeException extends Exception {
    public BadImageSizeException(double ratio, double maxRatio) {
        super(String.format("Максимальное соотношение сторон изображения %.0f, а у этой %.1f", maxRatio, ratio));
    }
}

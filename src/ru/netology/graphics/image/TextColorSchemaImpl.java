package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {

    @Override
    public char convert(int color) {
        if (color >= 0 && color < 28) {
            return '▇';
        }
        else if (color >= 28 && color < 56) {
            return '●';
        }
        else if (color >= 56 && color < 84) {
            return '◉';
        }
        else if (color >= 84 && color < 112) {
            return '◍';
        }
        else if (color >= 112 && color < 140) {
            return '◎';
        }
        else if (color >= 140 && color < 168) {
            return '○';
        }
        else if (color >= 168 && color < 196) {
            return '☉';
        }
        else if (color >= 196 && color < 224){
            return '◌';
        }
        else {
            return '-';
        }
    }
}

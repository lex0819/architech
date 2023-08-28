package seminar01.ModelElements;

/**
 * Класс для работы с текстурой
 * образцы текстур лежат в файлах jpeg
 * возвращает путь к файлу с текстурой
 */
public class Texture {
    private final String textureName;

    public Texture(String fileNane) {
        this.textureName = fileNane;
    }

    public String getTextureName() {
        return textureName;
    }
}

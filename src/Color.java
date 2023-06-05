//Enum: Створити Enum Color, який буде зберегіати в собі перечислення кольорів.
//перевизначити для констант toString()
//та додати метод який повертає код кольору в форматі HEX(RGB)
//Переробити клас Shape з дз 7, щоб він містив колір в форматы нашого нового Enum Color

public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String hexCode;

     Color(String hexCode) {
        this.hexCode = hexCode;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public String getHexCode() {
        return hexCode;
    }
}


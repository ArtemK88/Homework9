//Enum: Створити Enum Color, який буде зберегіати в собі перечислення кольорів.
//перевизначити для констант toString()
//та додати метод який повертає код кольору в форматі HEX(RGB)
//Переробити клас Shape з дз 7, щоб він містив колір в форматы нашого нового Enum Color

public enum Color {
    RED("#FF0000"){
        @Override
        public String toString() {
            return "RED - red";}
    },
    GREEN("#00FF00") {
        @Override
        public String toString() {
            return "GREEN  - green"; }
    },
    BLUE("#0000FF") {
        @Override
        public String toString() {
            return "BLUE  - blue";
        }
    };

    private String hexCode;

     Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}


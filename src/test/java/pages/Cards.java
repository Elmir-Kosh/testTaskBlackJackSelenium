package pages;

public enum Cards {

    QUEEN_HEART("//button[text() = 'Q ♥']"),
    QUEEN_DIAMOND("//button[text() ='Q ♦']"),
    QUEEN_CLUB("//button[text() ='Q ♣']");

    Cards(String name) {
        this.name = name;
    }
    private String name;


    public String getName() {
        return name;
    }
}

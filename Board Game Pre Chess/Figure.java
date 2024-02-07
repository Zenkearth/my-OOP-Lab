public class Figure {
    private String name;
    private int nowPosition;

    public Figure(String figureName, int position) {
        this.name = figureName;
        this.nowPosition = position;

    }

    // ------------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getNowPosition() {
        return nowPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNowPosition(int nowPosition) {
        this.nowPosition = nowPosition;
    }

    // ------------------------------------------------------------
}
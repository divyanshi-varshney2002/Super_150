package Priority_Queue;

public class Cars {
    int price;
    int speed;
    String color;
    public Cars() {
    }
    public Cars(int price, int speed, String color) {
        this.price = price;
        this.speed = speed;
        this.color = color;
    }
    @Override
    public String toString() {
        return "P : " + this.price + " S: " + this.speed + " C:" + this.color;
    }
    public int compareTo(Cars o){
        return 0;
    }
}

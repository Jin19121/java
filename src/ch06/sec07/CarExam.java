package ch06.sec07;

public class CarExam {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public CarExam(String model) {
        this(model, "silver", 250);
    }//파라미터에 없는 걸 불러올 수도 있나? main에서 안 보이는데 여기서 초기화시키는 의미는?

    public CarExam(String model, String color) {
        this(model, color, 250);
    }

    public CarExam(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

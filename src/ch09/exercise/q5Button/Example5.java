package ch09.exercise.q5Button;

public class Example5 {
    public static void main(String[] args) {
        Button5 btnOk = new Button5();
        btnOk.setClickListener(() -> System.out.println("ok버튼을 클릭했습니다."));
        btnOk.click();

        Button5 btnCancel = new Button5();
        btnCancel.setClickListener(() -> System.out.println("cancel 버튼을 클릭했습니다."));
        btnCancel.click();
    }
}
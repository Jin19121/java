package ch06.Exercise.q08;

public class ShopService {
    private static ShopService service = new ShopService();

    private ShopService() {
    }

    public static ShopService getInstance() {
        return service;
    }//다른 방법 참고
}

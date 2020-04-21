package 생성패턴.factory_method.effective_java;

public class Client {
    public static void main(String[] args) {
        Coupon oliveYoungCoupon = Coupon.newOliveYoungCoupon();
        Coupon lalavlaCoupon = Coupon.newLalavlaCoupon();

        System.out.println("10000원 상품에 "+oliveYoungCoupon.toString()+" 적용 시 : "+oliveYoungCoupon.applyCoupon(10000));
        System.out.println("10000원 상품에 "+lalavlaCoupon.toString()+" 적용 시 : "+lalavlaCoupon.applyCoupon(10000));
    }
}

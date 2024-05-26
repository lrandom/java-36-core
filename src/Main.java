import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
/*        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.location();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.location();*/

        /*
        Button button = new Button();
        button.onClick(new OnClickListener() {
            @Override
            public void onClickHandle() {
                System.out.println("Button Clicked");
            }
        });*/
/*
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();

        do {
            try {
                b = scanner.nextInt();
                System.out.println("Chia hai so a/b duoc kqua la" + a / b);
                break;
            } catch (Exception e) {
                System.out.println("Vui long nhap so b !=0");
            }
        } while (true);

        System.out.println("Tam biet");*/

        ATM atm = new ATM();


        try {
            atm.withdraw(0f);
        } catch (NegativeException e) {
            /* System.out.println("Vui long nhap vao so tien lon hon 0");*/
            throw e;
        } catch (AmountLargerThanBalanceException e) {
            //System.out.println("Vui long nhap so tien nho hơn so tien trong tk");
            throw e;
        } catch (Exception e) {

        } finally {
            System.out.println("Finaly");
        }


    }
}

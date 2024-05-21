import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter your password: ");
        String pwd = scanner.nextLine();
        if (atm.authentication(id, pwd) != null) {
            //login thaành công
            System.out.println("Login successfully");
            System.out.println("Welcome " + atm.getLoggedInAccount().getName());
            while (true) {
                System.out.println("Vui long nhap ");
                System.out.println("1. Rut tien");
                System.out.println("2. Xem thong tin");
                System.out.println("3. Thoat");

                scanner=new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Nhap so tien can rut: ");
                        float amount = scanner.nextFloat();
                        if (atm.widthdraw(amount)) {
                            System.out.println("Rut tien thanh cong");
                        } else {
                            System.out.println("Rut tien that bai");
                        }
                        break;

                    case 2:
                        System.out.println("Thong tin tai khoan");
                        System.out.println("ID: " + atm.getLoggedInAccount().getId());
                        System.out.println("Name: " + atm.getLoggedInAccount().getName());
                        System.out.println("Balance: " + atm.getLoggedInAccount().getBalance());
                        break;

                    case 3:
                        System.out.println("Cam on ban da su dung dich vu ATM");
                        return;
                }
            }
        } else {
            System.out.println("Login failed");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        String weather = "Trời mưa";
        if(weather.equals("Trời mưa")) {
            System.out.println("Mang ô");
        }else if(weather.equals("Trời nắng")) {
            System.out.println("Mang nón");
        }else {
            System.out.println("Mang áo");
        }

        switch (weather) {
            case "Trời mưa":
                System.out.println("Mang ô");
                break;
            case "Trời nắng":
                System.out.println("Mang nón");
                break;
            default:
                System.out.println("Mang áo");
                break;
        }
    }
}

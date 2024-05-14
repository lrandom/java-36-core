public class Button {
    public void onClick(EventListener eventListener) {
        eventListener.onClickHandler();
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.onClick(new EventListener() {
            @Override
            void onClickHandler() {
                System.out.println("Button clicked!");
            }
        });
    }
}

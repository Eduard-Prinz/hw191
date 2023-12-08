public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try {
            Validator.validate(login, password, confirmPassword);
            System.out.println("Регистрация прошла успешно!");
        } catch (ValidationException e) {
            System.out.println("Ошибка при регистрации: " + e.getMessage());
        }
    }
}
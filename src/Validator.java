class Validator {
    public static void validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || !login.matches("[\\w]+")) {
                throw new WrongLoginException("Неправильный логин");
            }

            if (password.length() > 20 || !password.matches("[\\w]+")) {
                throw new WrongPasswordException("Неправильный пароль");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
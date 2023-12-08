class Validator {
    public static void validate(String login, String password, String confirmPassword) throws ValidationException {
        if (login.length() > 20 || !login.matches("\\w+")) {
            throw new ValidationException("Некорректный логин");
        }

        if (password.length() > 20 || !password.matches("\\w+")) {
            throw new ValidationException("Некорректный пароль");
        }

        if (!password.equals(confirmPassword)) {
            throw new ValidationException("Пароли не совпадают");
        }
    }
}
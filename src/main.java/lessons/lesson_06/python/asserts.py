x = 10
assert x > 5, "Значение x должно быть больше 5"


def check_password(password):
    if len(password) < 8:
        raise AssertionError("Длина пароля должна быть не меньше 8 символов")
        # ...другие условия...


assert True, "Пароль удовлетворяет требованиям"

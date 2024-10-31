# Напишите функцию divide(a, b), которая возвращает результат деления a на b. Если b равно нулю, функция должна вызывать исключение ZeroDivisionError.
# Напишите тест, который проверяет, что при попытке деления на ноль функция вызывает исключение ZeroDivisionError


@staticmethod
def divide(a, b):
    if b == 0:
        raise ZeroDivisionError("Cannot divide by zero")
    return a / b




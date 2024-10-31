# Напишите функцию divide(a, b), которая возвращает результат деления a на b. Если b равно нулю, функция должна вызывать исключение ZeroDivisionError.
# Напишите тест, который проверяет, что при попытке деления на ноль функция вызывает исключение ZeroDivisionError


import pytest

from src.seminar import task_05


def test_divide_zero():
    with pytest.raises(ZeroDivisionError):
        task_05.divide(10, 0)


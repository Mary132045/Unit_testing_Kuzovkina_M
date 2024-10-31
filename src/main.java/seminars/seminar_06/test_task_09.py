# Напишите функцию is_prime(n), которая проверяет, является ли число n простым.
# Простое число - это число, которое делится только на 1 и на себя. Напишите параметризованный тест с использованием
# pytest.mark.parametrize, который проверяет эту функцию на нескольких наборах данных.


import pytest

from src.seminar import task_09


@pytest.mark.parametrize("test_input, expected", [(2, True), (3, True), (4, False), (16, False), (17, True), (18, False)])
def test_is_prime(test_input, expected):
    assert task_09.is_prime(test_input) == expected


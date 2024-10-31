# Создайте функцию square(n), которая возвращает квадрат числа n.
# Напишите doctest, который проверяет работу этой функции.

import doctest
import task_08


def test_square():
    """
    This function tests the square function.

    >>> task_08.square(4)
    16
    >>> task_08.square(0)
    0
    """
    pass


if __name__ == "__main__":
    doctest.testmod(task_08)


# либо для запуска теста необходимо использовать команду в терминале python -m doctest task_08.py


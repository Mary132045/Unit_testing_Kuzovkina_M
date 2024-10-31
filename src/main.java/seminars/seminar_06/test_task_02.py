# Модифицируйте функцию find_average так, чтобы она вызывала исключение TypeError, если ей передается не список.
# Напишите тест, который проверяет вызов этого исключения
import pytest

from src.seminar import task_02


def test_find_average_typeerror():
    with pytest.raises(TypeError):
        task_02.find_average("Not a list")



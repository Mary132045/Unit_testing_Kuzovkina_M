# Напишите функцию для поиска среднего значения в списке чисел и соответствующие юнит-тесты с использованием
# фреймворка pytest.


from src.seminar import task_01


def test_find_average():
    assert task_01.find_average([10, 20, 30, 40, 50]) == 30
    assert task_01.find_average([]) == 0
    assert task_01.find_average([5]) == 5















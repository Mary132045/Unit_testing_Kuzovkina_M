# Напишите функцию для поиска среднего значения в списке чисел и соответствующие юнит-тесты с использованием
# фреймворка pytest.


@staticmethod
def find_average(numbers):
    if not numbers:
        return 0
    return sum(numbers) / len(numbers)










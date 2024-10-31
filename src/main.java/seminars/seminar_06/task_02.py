# Модифицируйте функцию find_average так, чтобы она вызывала исключение TypeError, если ей передается не список.
# Напишите тест, который проверяет вызов этого исключения


@staticmethod
def find_average(numbers):
    if not isinstance(numbers, list):
        raise TypeError("Input should be a list.")
    if not numbers:
        return 0
    return sum(numbers) / len(numbers)



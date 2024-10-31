from pymock import PyMock
from my_module import function_to_test

def test_function():
    # Создаем заглушку для зависимости
    dependency_mock = PyMock()
    # Подменяем зависимость в тестируемой функции
    function_to_test.dependency = dependency_mock
    # Задаем ожидаемое значение для вызова зависимости
    dependency_mock.expect_call_with(10).and_return(42)
    # Вызываем функцию и проверяем результат
    result = function_to_test(10)
    assert result == 420
    # Проверяем, что вызов зависимости произошел с правильным аргументом
    dependency_mock.assert_call_with(10)
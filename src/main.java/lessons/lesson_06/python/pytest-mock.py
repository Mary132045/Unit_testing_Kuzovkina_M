from pytest_mock import mocker
from my_module import function_to_test

def test_function(mocker):
    # Создаем заглушку для зависимости
    dependency_mock = mocker.MagicMock(return_value=42)
    # Подменяем зависимость в тестируемой функции
    function_to_test.dependency = dependency_mock
    # Вызываем функцию и проверяем результат
    result = function_to_test(10)
    assert result == 420
    # Проверяем, что зависимость была вызвана с правильным аргументом
    dependency_mock.assert_called_once_with(10)
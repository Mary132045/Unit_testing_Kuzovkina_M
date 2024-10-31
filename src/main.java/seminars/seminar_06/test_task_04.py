# В задании №3 используйте unittest.mock для создания мок-объекта Bank.
# Напишите тест, в котором вы проверите, вызывается ли метод receive_money с правильным аргументом.


from unittest.mock import Mock

from src.seminar import task_04


def test_transfer_with_mock():
    person = task_04.Person(1000)
    # Создаём мок-объект для банка
    bank_mock = Mock()

    person.transfer_money(500, bank_mock)
    # Проверяем, был ли вызван метод receive_money() с аргументом 500
    bank_mock.receive_money.assert_called_with(500)


# Создайте два класса: Person и Bank. Класс Person должен иметь метод transfer_money, который позволяет перевести деньги в Bank. Класс Bank должен иметь метод receive_money.
# Напишите тесты, проверяющие корректность взаимодействия этих классов.


import pytest

from src.seminar import task_03


def test_person_bank_interaction():
    person = task_03.Person(1000)
    bank = task_03.Bank()
    person.transfer_money(500, bank)
    assert person.balance == 500
    assert bank.balance == 500


def test_person_bank_valueerror():
    with pytest.raises(ValueError):
        person = task_03.Person(0)
        bank = task_03.Bank()
        person.transfer_money(500, bank)



# Создайте два класса: Person и Bank. Класс Person должен иметь метод transfer_money, который позволяет перевести деньги в Bank. Класс Bank должен иметь метод receive_money.
# Напишите тесты, проверяющие корректность взаимодействия этих классов.


class Person:
    def __init__(self, balance = 0):
        self.balance = balance

    def transfer_money(self, amount, bank):
        if amount <= 0 or amount > self.balance:
            raise ValueError("Invalid transfer amount")
        self.balance -= amount
        bank.receive_money(amount)


class Bank:
    def __init__(self):
        self.balance = 0

    def receive_money(self, amount):
        self.balance += amount


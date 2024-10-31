# В задании №3 используйте unittest.mock для создания мок-объекта Bank.
# Напишите тест, в котором вы проверите, вызывается ли метод receive_money с правильным аргументом.


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


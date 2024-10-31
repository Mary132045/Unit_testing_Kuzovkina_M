from _ctypes_test import func


def func(x):
    return x + 1


def test_answer():
    assert func(3) == 5

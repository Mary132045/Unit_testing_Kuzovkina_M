test('adding two numbers with the add method should return the correct sum', () => {
    const calculator = new Calculator();
    expect(calculator.add(5, 10)).toBe(15);
    expect(calculator.add(-5, 10)).toBe(5);
});
    test('subtracting two numbers with the subtract method should return the correct difference', () => {
    const calculator = new Calculator();
    expect(calculator.subtract(10, 5)).toBe(5);
    expect(calculator.subtract(-5, 10)).toBe(-15);
});
    test('multiplying two numbers with the multiply method should return the correct product', () => {
    const calculator = new Calculator();
    expect(calculator.multiply(5, 10)).toBe(50);
    expect(calculator.multiply(-5, 10)).toBe(-50);
});
    test('dividing two numbers with the divide method should return the correct quotient', () => {
    const calculator = new Calculator();
    expect(calculator.divide(10, 2)).toBe(5);
    expect(calculator.divide(10, 3)).toBeCloseTo(3.333, 3);
});
    
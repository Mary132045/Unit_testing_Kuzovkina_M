import "testing"
func TestAdd(t *testing.T) {

	// Arrange
	num1 := 5
	num2 := 10
	expected := 15

	// Act
	result := Add(num1, num2)
	
	// Assert
	if result != expected {
		t.Errorf("Add(%d, %d) = %d; expected %d", num1, num2, result, expected)
	}
}
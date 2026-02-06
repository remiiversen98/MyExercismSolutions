class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException, IllegalOperationException, ArithmeticException {
        //if (operation == null) throw new IllegalArgumentException("Operation cannot be null");
        //if (operation.equals("null")) throw new IllegalArgumentException("Operation cannot be empty");


        String statement = switch (operation) {
            case null -> throw new IllegalArgumentException("Operation cannot be null");
            case "" -> throw new IllegalArgumentException("Operation cannot be empty");
            case "+" -> operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            case "*" -> operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            case "/" -> {
                try {
                yield operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                } catch (ArithmeticException e) {throw new IllegalOperationException("Division by zero is not allowed", e);}
            }
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };
        return statement;
    }
}

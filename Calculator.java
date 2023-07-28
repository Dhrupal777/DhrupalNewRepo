import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.steps();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Select an operation: ");
            int select = scanner.nextInt();

            if (select == 1) {
                calculator.addition();
            } else if (select == 2) {
                calculator.subtraction();
            } else if (select == 3) {
                calculator.multiplication();
            } else if (select == 4) {
                calculator.division();
            } else if (select == 5) {
                calculator.root();
            } else if (select == 6) {
                calculator.exponentiation();
            } else if (select == 7) {
                calculator.modulus();
            } else if (select == 8) {
                calculator.floorDivision();
            } else if (select == 9) {
                Matrix matrix = new Matrix();
                int[][] A = matrix.readMatrix();
                System.out.println("Matrix A:");
                matrix.printMatrix(A);
                int[][] B = matrix.readMatrix();
                System.out.println("Matrix B:");
                matrix.printMatrix(B);
                int[][] s = matrix.sum(A, B);
                System.out.println("Ans:");
                matrix.printMatrix(s);
            } else if (select == 10) {
                Matrix matrix = new Matrix();
                int[][] A = matrix.readMatrix();
                System.out.println("Matrix A:");
                matrix.printMatrix(A);
                int[][] B = matrix.readMatrix();
                System.out.println("Matrix B:");
                matrix.printMatrix(B);
                int[][] s = matrix.subtraction(A, B);
                System.out.println("Ans:");
                matrix.printMatrix(s);
            } else if (select == 11) {
                Matrix matrix = new Matrix();
                int[][] A = matrix.readMatrix();
                System.out.println("Matrix A:");
                matrix.printMatrix(A);
                int[][] B = matrix.readMatrix();
                System.out.println("Matrix B:");
                matrix.printMatrix(B);
                int[][] s = matrix.division(A, B);
                System.out.println("Ans:");
                matrix.printMatrix(s);
            } else if (select == 12) {
                Matrix matrix = new Matrix();
                int[][] A = matrix.readMatrix();
                System.out.println("Matrix A:");
                matrix.printMatrix(A);
                int[][] B = matrix.readMatrix();
                System.out.println("Matrix B:");
                matrix.printMatrix(B);
                int[][] s = matrix.multiplication(A, B);
                System.out.println("Ans:");
                matrix.printMatrix(s);
            } else if (select == 13) {
                System.out.println("\n------------------------");
                System.out.println("-------Thank You--------");
                System.out.println("------------------------");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

    public void steps() {
        System.out.println("\n------------------------------");
        System.out.println("------ Java Calculator -------");
        System.out.println("------------------------------");
        System.out.println("\nList of calculator operations:\n");
        System.out.println("1. Addition..");
        System.out.println("2. Subtraction..");
        System.out.println("3. Multiplication..");
        System.out.println("4. Division..");
        System.out.println("5. Root of number..");
        System.out.println("6. Exponentiation..");
        System.out.println("7. Modulus..");
        System.out.println("8. Floor Division..");
        System.out.println("9. Sum of matrix..");
        System.out.println("10. Subtraction of matrix..");
        System.out.println("11. Division of matrix..");
        System.out.println("12. Multiplication of matrix..");
        System.out.println("13. Exit the calculator\n");
    }

    public void addition() {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        System.out.print("\nHow many numbers for addition: ");
        int addNumber = scanner.nextInt();
        for (int i = 0; i < addNumber; i++) {
            System.out.print("Enter number: ");
            double add = scanner.nextDouble();
            numbers.add(add);
        }
        double result = numbers.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Ans: " + result);
    }

    public void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number A: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number B: ");
        double number2 = scanner.nextDouble();
        double result = number1 - number2;
        System.out.println("Ans: " + result);
    }

    public void multiplication() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("How many numbers for multiplication: ");
        int multiplyNumber = scanner.nextInt();
        for (int i = 0; i < multiplyNumber; i++) {
            System.out.print("Enter number: ");
            int multiply = scanner.nextInt();
            numbers.add(multiply);
        }
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        System.out.println("Ans: " + result);
    }

    public void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number A: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number B: ");
        int number2 = scanner.nextInt();
        double result = (double) number1 / number2;
        System.out.println("Ans: " + result);
    }

    public void root() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ex: 2^2 = 4, 3^2 = 9");
        System.out.print("Enter root number: ");
        int number1 = scanner.nextInt();
        double result = Math.pow(number1, 2);
        System.out.println("Ans: " + result);
    }

    public void exponentiation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ex: 2^3 = 8, 2^5 = 32");
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        double result = Math.pow(number1, number2);
        System.out.println("Ans: " + result);
    }

    public void modulus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number A: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number B: ");
        int number2 = scanner.nextInt();
        int result = number1 % number2;
        System.out.println("Ans: " + result);
    }

    public void floorDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number A: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number B: ");
        int number2 = scanner.nextInt();
        int result = number1 / number2;
        System.out.println("Ans: " + result);
    }
}

class Matrix {
    private int m;
    private int n;

    public Matrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows: ");
        this.m = scanner.nextInt();
        System.out.print("How many columns: ");
        this.n = scanner.nextInt();
    }

    public int[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public int[][] sum(int[][] A, int[][] B) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public int[][] subtraction(int[][] A, int[][] B) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public int[][] division(int[][] A, int[][] B) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] / B[i][j];
            }
        }
        return result;
    }

    public int[][] multiplication(int[][] A, int[][] B) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] * B[i][j];
            }
        }
        return result;
    }
}

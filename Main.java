package tema_matrici;

public class Main {

	public static void main(String[] args) {
		
		MatrixOperations matrixOp = new MatrixOperations();
		
		int rowSize = 3;
		int colSize = 3;
		
		int[][] matrix1 = { {2, 3, 5}, {7, 4, 2}, {5, 8, 6}};
		System.out.println("\nMatrix A: ");
		matrixOp.printMatrix(matrix1);
		
		int[][] matrix2 = {{4, 8, 3}, {3, 7, 6}, {8, 5, 4}};
		System.out.println("\nMatrix B:");
		matrixOp.printMatrix(matrix2);
		
		int[][] sumResult = matrixOp.sumMatrix(matrix1, matrix2, rowSize, colSize);
		System.out.println("\nA+B Matrix: ");
		matrixOp.printMatrix(sumResult);
		
		int[][] subtractResult = matrixOp.subtractMatrix(matrix1, matrix2, rowSize, colSize);
		System.out.println("\nA-B Matrix: ");
		matrixOp.printMatrix(subtractResult);
		
		int number = 2;
		int[][] multiplicationWithScalarResult = matrixOp.multiplicationWithScalar(matrix1, rowSize, colSize, number);
		System.out.println("\nn=" + number);
		System.out.println("n*A Matrix: ");
		matrixOp.printMatrix(multiplicationWithScalarResult);
		
		int rowSize1 = 2;
		int colSize1 = 3;
		int rowSize2 = 3; 
		int colSize2 = 2;
		int[][] matrix3 = {{3, 1}, {2, 4}, {5, 7}};
		System.out.println("\nMatrix C: ");
		matrixOp.printMatrix(matrix3);
		
		int[][] matrix4 = {{2, 5, 4}, {7, 5, 0}};
		System.out.println("\nMatrix D: ");
		matrixOp.printMatrix(matrix4);
		
		int[][] multiplicationResult = matrixOp.multiplicationMatrix(matrix3, matrix4, rowSize1, colSize1, rowSize2, colSize2);
		System.out.println("\nC*D Matrix: ");
		matrixOp.printMatrix(multiplicationResult);
		
	}
}

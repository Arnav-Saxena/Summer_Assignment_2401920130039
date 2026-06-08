class Matrixdiagonalsum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j)
                    sum += mat[i][j];

                if (i + j == m - 1)
                    sum += mat[i][j];
            }
        }

        if (n % 2 != 0)
            sum -= mat[n / 2][n / 2];

        return sum;
    }
}
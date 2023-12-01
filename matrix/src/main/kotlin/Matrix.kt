class Matrix(private val matrixAsString: String) {
    private val matrix: List<List<Int>> =
        matrixAsString.lines().map { row -> row.split(" ").map { char -> char.toInt() } }

    fun column(colNr: Int): List<Int> = matrix.map { it[colNr - 1] }

    fun row(rowNr: Int): List<Int> = matrix[rowNr - 1]
}

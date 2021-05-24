package challenge

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculateOptimalPathKtTest{
    @Test
    fun `calculate optimal path 2 X 2 matrix`() {
        assertEquals(7, calculateOptimalPath(arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3)
        )), "1")
        assertEquals(8, calculateOptimalPath(arrayOf(
            intArrayOf(4, 2),
            intArrayOf(2, 3))
        ), "2")
    }

    @Test
    fun `calculate optimal path 2 X N matrix`() {
        assertEquals(12, calculateOptimalPath(arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(2, 3, 4)
        )), "1")
        assertEquals(19, calculateOptimalPath(arrayOf(
            intArrayOf(1, 2, 6, 4),
            intArrayOf(2, 3, 4, 5)
        )), "2")
        assertEquals(14, calculateOptimalPath(arrayOf(
            intArrayOf(1, 5, 1, 3),
            intArrayOf(2, 3, 4, 5)
        )), "3")
    }

    @Test
    fun `calculate optimal path 3 X 3 matrix`() {
        assertEquals(22, calculateOptimalPath(arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(2, 3, 4),
            intArrayOf(4, 5, 6))
        ))
    }

    @Test
    fun `calculate optimal path 3 X N matrix`() {
        assertEquals(31, calculateOptimalPath(arrayOf(
            intArrayOf(1, 2, 5, 4),
            intArrayOf(2, 6, 7, 4),
            intArrayOf(4, 5, 5, 3))
        ), "1")
        assertEquals(28, calculateOptimalPath(arrayOf(
            intArrayOf(7, 2, 5, 4),
            intArrayOf(6, 6, 7, 4),
            intArrayOf(4, 5, 5, 3))
        ), "2")
    }

    @Test
    fun `calculate optimal path N X N matrix`() {
        assertEquals(70, calculateOptimalPath(arrayOf(
            intArrayOf(1, 2, 5, 4, 5, 6, 7),
            intArrayOf(2, 6, 7, 4, 1, 3, 5),
            intArrayOf(4, 5, 5, 4, 5, 6, 2),
            intArrayOf(4, 3, 4, 9, 3, 7, 1),
            intArrayOf(4, 3, 9, 3, 5, 6, 5),
            intArrayOf(4, 5, 8, 7, 7, 5, 1),
        )))
    }
}
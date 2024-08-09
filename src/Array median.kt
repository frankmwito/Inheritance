import java.util.Scanner

open class Solution(
    var nums1: IntArray,
    var nums2: IntArray
) {
    fun findMedianSortedArrays(): Double {
        val mergedArray = (nums1 + nums2).sorted()
        val totalLength = mergedArray.size

        return if (totalLength % 2 == 0) {
            // If even, average of the two middle elements
            (mergedArray[totalLength / 2 - 1] + mergedArray[totalLength / 2]) / 2.0
        } else {
            // If odd, middle element
            mergedArray[totalLength / 2].toDouble()
        }
    }
}

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter the size of nums1 array")
    val m = reader.nextInt()
    val nums1 = IntArray(m)
    for (i in 0 until m) {
        println("Enter the array digits")
        nums1[i] = reader.nextInt()
    }

    println("Enter the size of nums2 array")
    val n = reader.nextInt()
    val nums2 = IntArray(n)
    for (i in 0 until n) {
        println("Enter the array digits")
        nums2[i] = reader.nextInt()
    }

    val solution = Solution(nums1, nums2)
    val median = solution.findMedianSortedArrays()
    println("The median of the two sorted arrays is: $median")
}

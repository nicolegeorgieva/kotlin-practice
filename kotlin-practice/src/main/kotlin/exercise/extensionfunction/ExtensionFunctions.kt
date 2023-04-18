package exercise.extensionfunction

fun main() {
    println(wordFrequency("the dog stays in the dog house when nobody lets it in"))
}

/*
Input: "the dog stays in the dog house when nobody lets it in" - only lowercase letters and spaces
Output: {the=2, dog=2, ...}
 */

fun wordFrequency(sentence: String): Map<String, Int> {
    // Split the sentence into words and use the 'groupingBy' function to create a frequency map
    return sentence.split(" ").groupingBy { it }.eachCount()
}
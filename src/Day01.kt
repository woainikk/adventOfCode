fun main() {

    fun calculateSnacks(input: List<String>): MutableList<Int>{
        val reindeers: MutableList<Int> = mutableListOf()
        var sum = 0
        for (i in input) {
            if(i.isEmpty()){
                reindeers.add(sum)
                sum = 0
                continue
            }
            else{
                sum += i.toInt()
            }
        }
        return reindeers
    }

    fun part1(input: List<String>): Int {
        return calculateSnacks(input).max()
    }

    fun part2(input: List<String>): Int {
        return calculateSnacks(input).sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

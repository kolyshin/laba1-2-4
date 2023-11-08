fun main() {
    val sizetable = 9 //

    print("\t\t")
    for (i in 1..sizetable) {
        print("$i\t")
    }
    println()

    for (i in 1..sizetable) {
        print("$i \t| \t")
        for (j in 1..sizetable) {
            print("${i * j}\t")
        }
        println()
    }
}
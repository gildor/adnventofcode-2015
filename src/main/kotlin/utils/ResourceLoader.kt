package utils

fun readResource(
        name: String
): String {
    return Thread.currentThread().contextClassLoader
            .getResourceAsStream(name)
            .also { stream ->
                requireNotNull(stream) {
                    "Resource $name not found"
                }
            }
            .bufferedReader()
            .readText()
}

fun String.res() = readResource(this)
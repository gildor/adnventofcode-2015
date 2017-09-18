package utils

import org.junit.Test
import org.junit.Assert.*

class ResourceLoaderTest {
    @Test
    fun readTestResource() {
        assertEquals(
                "content of resource",
                readResource("test.resource")
        )
    }

    @Test
    fun readNonExistingResource() {
        try {
            readResource("unknown.resource")
        } catch (e: IllegalArgumentException) {
            assertEquals(
                    "Resource unknown.resource not found",
                    e.message
            )
        }
    }
}
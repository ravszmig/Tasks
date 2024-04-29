package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VersionCheckTest {
    @Test
    void versionNumber_usesCases() {
        assertEquals(0, VersionCheck.compare("15", "15.0"));
        assertEquals(0, VersionCheck.compare("10.1", "10.1.0"));
        assertEquals(-1, VersionCheck.compare("10.1", "10.1.1"));
        assertEquals(1, VersionCheck.compare("10.1.2", "10.1.1"));
    }
}

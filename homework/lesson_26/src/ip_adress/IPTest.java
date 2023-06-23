package ip_adress;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IPTest {
    IP ip;

    @BeforeEach
    void setUp() {
        ip = new IP();
    }

    @Test
    void checkPrint() {
        String ipTest = "192.168.0.1";
        assertTrue(ip.isValid(ipTest));
        ip.printBlocksIp(ipTest);


    }

}
import java.util.UUID;

public class DeviceUtils {

    public static String generateDeviceId() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        String deviceId = generateDeviceId();
        System.out.println("Generated Device ID: " + deviceId);
    }
}

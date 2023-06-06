package org.curie;

public class SystemOperation {
    public void operation(String s) {
        if (s.contains("Shutdown") || s.contains("shutdown") || s.contains("Shut-down") ||s.contains("shut-down") || s.contains("Shut down") || s.contains("shut down")) {
            try {
                Runtime.getRuntime().exec("shutdown -s -t 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (s.contains("Restart") || s.contains("restart")) {
            try {
                Runtime.getRuntime().exec("shutdown -r -t 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

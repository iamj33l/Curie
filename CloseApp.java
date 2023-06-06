package org.curie;

import java.io.IOException;

public class CloseApp {
    String closeApp(String text) throws IOException {
        Runtime app = Runtime.getRuntime();
        String appname = null;
        try {
            if(text.contains("notepad") || text.contains("notepad")) {
                app.exec(new String[]{"taskkill", "/F", "/IM", "notepad.exe"});
                appname = "Notepad";
            }

            if (text.contains("paint") || text.contains("Paint")) {
                app.exec(new String[]{"taskkill", "/F","/IM","Paint.exe"});
                appname = "Paint";
            }

            if (text.contains("calcualtor") || text.contains("Calculqtor")) {
                app.exec (new String [] {"taskkill", "/F", "/IM", "calc.exe"});
                appname = "Calcultor";
            }

            if (text.contains("cmd") || text.contains("cmd") || text.contains("command prompt") || text.contains("Command Prompt")) {
                app.exec(new String[]{"taskkill", "/F","/IM","cmd.exe"});
                appname = "Command Prompt";
            }


            if (text.contains("control panel") || text.contains("control panel") || text.contains("Control Panel") || text.contains("Control Panel")) {
                app.exec(new String[]{"taskkill", "/F","/IM","control.exe"});
                appname = "Control Panel";
            }

            if (text.contains("explorer") || text.contains("explorer")) {
                app.exec(new String[]{"taskkill", "/F","/IM","explorer.exe"});
                appname = "Explorer";
            }

            if (text.contains("task manager") || text.contains("task manager") || text.contains("taskmgr") || text.contains("taskmgr")) {
                app.exec(new String[]{"taskkill", "/F","/IM","taskmgr.exe"});
                appname = "Task Manager";
            }


            if (text.contains("edge") || text.contains("edge") || text.contains("Microsoft Edge") || text.contains("Microsoft Edge")) {
                app.exec(new String[]{"taskkill", "/F","/IM","MicrosoftEdge.exe"});
                appname = "Microsoft Edge";
            }

            if (text.contains("chrome") || text.contains("chrome") || text.contains("Google Chrome") || text.contains("Google Chrome")) {
                app.exec(new String[]{"taskkill", "/F","/IM","chrome.exe"});
                appname = "Google Chrome";
            }

            if (text.contains("firefox") || text.contains("firefox") || text.contains("Mozilla Firefox") || text.contains("Mozilla Firefox")) {
                app.exec(new String[]{"taskkill", "/F","/IM","firefox.exe"});
                appname = "Mozilla firefox";
            }

            if (text.contains("opera") || text.contains("opera")) {
                app.exec(new String[]{"taskkill", "/F","/IM","opera.exe"});
                appname = "Opera Mini";
            }

            if (text.contains("vlc") || text.contains("vlc") || text.contains("VLC") || text.contains("VLC") || text.contains("vlc media player") || text.contains("vlc media player") || text.contains("VLC media player") || text.contains("VLC media player")) {
                app.exec(new String[]{"taskkill", "/F","/IM","vlc.exe"});
                appname = "VLC Media Player";
            }

            if (text.contains("close wordpad") || text.contains("Close wordpad")) {
                app.exec(new String[]{"taskkill", "/F","/IM","wordpad.exe"});
                appname = "Wordpad";
            }

            if (text.contains("close word") || text.contains("Close word") || text.contains("close Microsoft Word") || text.contains("Microsoft Word")) {
                app.exec(new String[]{"taskkill", "/F","/IM","winword.exe"});
                appname = "Microsoft Word";
            }

            if (text.contains("excel") || text.contains("excel") || text.contains("Microsoft Excel") || text.contains("Microsoft Excel")) {
                app.exec(new String[]{"taskkill", "/F","/IM","excel.exe"});
                appname = "Microsoft Excel";
            }

            if (text.contains("powerpoint") || text.contains("powerpoint") || text.contains("Microsoft Powerpoint") || text.contains("Microsoft Powerpoint")) {
                app.exec(new String[]{"taskkill", "/F","/IM","powerpnt.exe"});
                appname = "Microsoft PowerPoint";
            }

            if (text.contains("onenote") || text.contains("onenote") || text.contains("Microsoft Onenote") || text.contains("Microsoft Onenote")) {
                app.exec(new String[]{"taskkill", "/F","/IM","onenote.exe"});
                appname = "Microsoft Onenote";
            }

            if (text.contains("outlook") || text.contains("outlook") || text.contains("Microsoft Outlook") || text.contains("Microsoft Outlook")) {
                app.exec(new String[]{"taskkill", "/F","/IM","outlook.exe"});
                appname = "Microsoft Outlook";
            }

            if (text.contains("close skype") || text.contains("skype")) {
                app.exec(new String[]{"taskkill", "/F","/IM","skype.exe"});
                appname = "Skype";
            }

            if (text.contains("spotify") || text.contains("spotify")) {
                app.exec(new String[]{"taskkill", "/F","/IM","spotify.exe"});
                appname = "Spotify";
            }

            if (text.contains("telegram") || text.contains("Telegram")) {
                app.exec(new String[]{"taskkill", "/F","/IM","Telegram.exe"});
                appname = "Telegram";
            }

            if (text.contains("zoom") || text .contains("Zoom")) {
                app.exec(new String[]{"taskkill", "/F","/IM","zoom.exe"});
                appname = "Zoom";
            }

            if (text.contains("system settings") || text.contains("system settings") || text.contains("System Settings") || text.contains("System Settings")) {
                app.exec(new String[]{"taskkill", "/F","/IM","ms-settings.exe"});
                appname = "System Setting";
            }

            if (text.contains("system information") || text.contains("system information") || text.contains("System Information") || text.contains("System Information")) {
                app.exec(new String[]{"taskkill", "/F","/IM","msinfo32.exe"});
                appname = "System Information";
            }

            if(text.contains("system properties") || text.contains("system properties") || text.contains("System Properties") || text.contains("System Properties")) {
                app.exec(new String[]{"taskkill", "/F","/IM","sysdm.cpl"});
                appname = "System Properties";
            }

            if(text.contains("system configuration") || text.contains("system configuration") || text.contains("System Configuration") || text.contains("Close System Configuration")) {
                app.exec(new String[]{"taskkill", "/F","/IM","msconfig.exe"});
                appname = "System Configuration";
            }
        }
         catch (Exception Ex) {
            System.out.println("Error: " + Ex.toString());
        }

        return "Curie closed " + appname + " for you!";
    }
}
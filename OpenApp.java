package org.curie;

import java.io.IOException;

public class OpenApp {
    String openApp(String text) throws IOException {
            Runtime app = Runtime.getRuntime();
            String appname = null;

            if (text.contains("Notepad") || text.contains("notepad")) {
                app.exec(new String[]{"notepad.exe"});
                appname = "Notepad";
            }

            if (text.contains("Calendar") || text.contains("calendar")) {
                app.exec((new String[]{"cmd", "/c", "start chrome https://calendar.google.com/calendar/r"}));
                appname = "Calendar";
            }

            if (text.contains("paint") || text.contains("Paint")) {
                app.exec(new String[]{"mspaint.exe"});
                appname = "paint";
            }

            if (text.contains("whatsapp") || text.contains("Whatsapp") || text.contains("WhatsApp") || text.contains("whatsApp")) {
                app.exec(new String[]{"cmd.exe", "/c", "C:\\Program Files\\WindowsApps\\5319275A.WhatsAppDesktop_2.2301.2.0_x64__cv1g1gvanyjgm\\WhatsApp.exe"});
                appname = "System Information";
            }

            if (text.contains("cmd") || text.contains("Cmd") || text.contains("command prompt") || text.contains("Command Prompt")) {
                app.exec(new String[]{"cmd.exe", "/c", "start"});
                appname = "cmd";
            }

            if (text.contains("Control panel") || text.contains("control panel") || text.contains("Control Panel") || text.contains("control Panel")) {
                app.exec(new String[]{"control.exe"});
                appname = "Control panel";
            }

            if (text.contains("explorer") || text.contains("Explorer")) {
                app.exec("explorer");
                appname = "explorer";
            }

            if (text.contains("task manager") || text.contains("Task Manager") || text.contains("taskmgr") || text.contains("Taskmgr")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "taskmgr"});
                appname = "task manager";
            }

            if (text.contains("edge") || text.contains("Edge") || text.contains("Microsoft Edge") || text.contains("microsoft edge")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "microsoft-edge:"});
                appname = "Microsoft edge";
            }

            if (text.contains("chrome") || text.contains("Chrome") || text.contains("Google Chrome") || text.contains("google chrome")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "chrome"});
                appname = "Gooogle Chrome";
            }

            if (text.contains("firefox") || text.contains("Firefox") || text.contains("Mozilla Firefox") || text.contains("mozilla firefox")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "firefox"});
                appname = "Mozilla Firefox";
            }

            if (text.contains("opera") || text.contains("Opera")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "opera"});
                appname = "Opera browser";
            }

            if (text.contains("vlc") || text.contains("Vlc") || text.contains("VLC") || text.contains("vlc media player") || text.contains("Vlc media player") || text.contains("VLC media player")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "vlc"});
                appname = "VLC mediaplayer";
            }

            if (text.contains("wordpad") || text.contains("Wordpad")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "wordpad"});
                appname = "Wordpad";
            }

            if (text.contains("word") || text.contains("Word") || text.contains("Microsoft Word") || text.contains("microsoft word")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "winword"});
                appname = "Microsoft Word";
            }

            if (text.contains("excel") || text.contains("Excel") || text.contains("Microsoft Excel") || text.contains("microsoft excel")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "excel"});
                appname = "Microsoft Excel";
            }

            if (text.contains("powerpoint") || text.contains("Powerpoint") || text.contains("Microsoft Powerpoint") || text.contains("microsoft powerpoint")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "powerpnt"});
                appname = "Microsoft PowerPoint";
            }

            if (text.contains("onenote") || text.contains("Onenote") || text.contains("Microsoft Onenote") || text.contains("microsoft onenote")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "onenote"});
                appname = "Microsoft Onenote";
            }

            if (text.contains("outlook") || text.contains("Outlook") || text.contains("Microsoft Outlook") || text.contains("microsoft outlook")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "outlook"});
                appname = "Microsoft Outlook";
            }

            if (text.contains("skype") || text.contains("Skype")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "skype"});
                appname = "Skype";
            }

            if (text.contains("spotify") || text.contains("Spotify")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "spotify",});
                appname = "Spotify";
            }

            if (text.contains("zoom") || text.contains("Zoom")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "zoom"});
                appname = "Zoom";
            }

            if (text.contains("System Settings") || text.contains("system settings") || text.contains("System settings")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "ms-settings:"});
                appname = "System Settings";
            }

            if (text.contains("System Information") || text.contains("system information") || text.contains("System information")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "msinfo32"});
                appname = "System Information";
            }

            if (text.contains("System Properties") || text.contains("system properties") || text.contains("System properties")) {
                app.exec(new String[]{"cmd.exe", "/c", "start", "sysdm.cpl"});
                appname = "System Properties";
            }

            return "Curie Opened " + appname + " for you!";
    }
}

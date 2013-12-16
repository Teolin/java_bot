package i43.teolin.java_bot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

public class App
{

public static void main(String[] args) {
    PopupMenu popup = new PopupMenu();

    MenuItem exitItem = new MenuItem("test");

    exitItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });

    popup.add(exitItem);

    SystemTray systemTray = SystemTray.getSystemTray();
    try 
    {
    URL imageUrl = new URL("http://icons.iconarchive.com/icons/artcore-illustrations/artcore/512/firefox-icon.png");
    
    Image image = Toolkit.getDefaultToolkit().getImage(imageUrl);
   
    TrayIcon trayIcon = new TrayIcon(image, "test2", popup);

    trayIcon.setImageAutoSize(true);

    systemTray.add(trayIcon);
        } catch (Exception e)
    {
    }
}
}

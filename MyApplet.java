// example on Applet

import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{
public void init() {
	System.out.println("Init Called...");
}
public void start() {
	System.out.println("Start Called...");
}
public void paint(Graphics object) {
	System.out.println("paint Called...");
}
public void stop() {
	System.out.println("Stop Called...");
}
public void destroy() {
	System.out.println("Destroy Called...");
}
}

/*
<applet code="MyApplet.class" width=400 height=400>
</applet>
*/
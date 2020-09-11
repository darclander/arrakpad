

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.*;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    private GUI UI;

    public Main() { 
        this.UI = new GUI();

    }

    public static void main(String[] args) {
        System.out.println("Test2");
        Main main = new Main();
    }

}


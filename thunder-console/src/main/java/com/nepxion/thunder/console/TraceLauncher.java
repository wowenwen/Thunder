package com.nepxion.thunder.console;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import javax.swing.SwingUtilities;

import com.nepxion.thunder.console.context.ContextInitializer;

public class TraceLauncher {
    public static void main(String[] args) {
        ContextInitializer.initialize();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TraceFrame traceFrame = new TraceFrame();
                traceFrame.launch();
            }
        });
    }
}
package org.citi;

import org.citi.fv.FileViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Class defined to be the start point 
 *
 */
public class App {
	/**
	 * Starts main program.
	 */
	public static void main(String[] args) {
		Display display = null;
		int tryes = 0;

		while (display == null) {
			display = new Display();

			tryes++;

			if (tryes == 10) {
				System.out.println("Try to create Display object 10 times exit application");
				System.exit(1);
			}
		}

		FileViewer application = new FileViewer();
		Shell shell = application.open(display);
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		application.close();
		display.dispose();
	}
}

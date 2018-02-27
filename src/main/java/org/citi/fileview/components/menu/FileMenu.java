package org.citi.fv.components.menu;

import static org.eclipse.swt.events.SelectionListener.widgetSelectedAdapter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class FileMenu extends Menu{

	public FileMenu(Menu arg0) {
		super(arg0);
		
		createMenu();
	}

	private void createMenu() {
		MenuItem header = new MenuItem(this.getParentMenu(), SWT.CASCADE);
		header.setText(getResourceString("menu.File.text"));
		header.setMenu(this);

		final MenuItem simulateItem = new MenuItem(this, SWT.CHECK);
		simulateItem.setText(getResourceString("menu.File.SimulateOnly.text"));
		simulateItem.setSelection(simulateOnly);
		simulateItem.addSelectionListener(widgetSelectedAdapter(e -> simulateOnly = simulateItem.getSelection()));

		MenuItem item = new MenuItem(this, SWT.PUSH);
		item.setText(getResourceString("menu.File.Close.text"));
		item.addSelectionListener(widgetSelectedAdapter(e -> shell.close()));
	}

	

}
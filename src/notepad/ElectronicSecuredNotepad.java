package notepad;

import java.util.Scanner;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean started = false;

	@Override
	public void start() {
		started = true;
		System.out.println("Notepad has been started!");
	}

	@Override
	public void stop() {
		started = false;
		System.out.println("Notepad has been stopped!");
	}

	@Override
	public boolean isStarted() {
		return started;
	}
}

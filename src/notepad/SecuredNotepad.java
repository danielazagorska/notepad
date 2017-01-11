package notepad;

import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	String permanentPass;

	private void enterPassword() {
		System.out.println("Please set a password");
		Scanner sc = new Scanner(System.in);
		permanentPass = hash(sc.nextLine());

	}

	private boolean authenticate(String password) {
		System.out.println("Please enter the password");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String tempPass = hash(sc.nextLine());
			if (tempPass.equals(permanentPass)) {
				return true;
			}
			sc.close();
		}
		return false;
	}

	private String hash(String passString) {
		String hash = null;
		byte[] bytesOfMessage;
		try {
			bytesOfMessage = passString.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] thedigest = md.digest(bytesOfMessage);
			hash = new String(thedigest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hash;
	}

	@Override
	public Page createPage(String title, String text) {
		String password = null;
		if (authenticate(password)) {
		return super.createPage(title, text);
		}
		return null;
	}

	@Override
	public void replaceText(int pageNumber, String text) {
		String password = null;
		if (authenticate(password)) {
			super.replaceText(pageNumber, text);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		String password = null;
		if (authenticate(password)) {
		super.deleteText(pageNumber);
		}
	}

	@Override
	public void viewAllPages() {
		String password = null;
		if (authenticate(password)) {
		super.viewAllPages();
		}
	}

}

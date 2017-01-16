package notepad;

import java.util.Scanner;

class Demo {
	ElectronicSecuredNotepad notepad = new ElectronicSecuredNotepad();
	public String[] menu = new String[] { "Start Notepad", "Stop Notepad", "Select permanent password",
			"Create new page", "Print page", "Replace text", "Delete text", "View all pages" };

	public void menu() {
		System.out.println("Select one of the following options:" + '\n');
		for (int i = 0; i < menu.length; i++) {
			System.out.println(String.valueOf(i + 1) + ". " + menu[i] + "\n");
		}
		System.out.println('\n');
	}
	private void userInput(){
		Scanner sc = new Scanner(System.in);
		String userSelection = sc.next();
		int menuSelection = Integer.parseInt(userSelection);
		switch (menuSelection) {
		case 1:
			notepad.start();
			break;
		case 2:
			notepad.stop();
			break;
		case 3:
			System.out.println("Enter permanet password, you can never change it, choose wisely!" + '\n');
			notepad.enterPassword();
			break;
		case 4:
			System.out.println("Please add a title to your page:" + '\n');
			Scanner title = new Scanner(System.in);
			String pageTitle = title.next();
			System.out.println("Please input some text to your page:" + '\n');
			Scanner text = new Scanner(System.in);
			String pageText = text.next();
			notepad.createPage(pageTitle, pageText);
			break;
		case 5:
			System.out.println("Select a page number to print:" + '\n');
			Scanner pgNmbr = new Scanner(System.in);
			String userPage = pgNmbr.next();
			int printPage = Integer.parseInt(userPage);		
			notepad.printPage(printPage);
			break;
		case 6:
			System.out.println("Select a page number to print:" + '\n');
			Scanner rplcTxt = new Scanner(System.in);
			Scanner pg = new Scanner(System.in);
			String pageNumber = pg.next();
			int pg1 = Integer.parseInt(pageNumber);
			String textToReplace = rplcTxt.next();
			notepad.replaceText(pg1, textToReplace);
			break;
		case 7:
			System.out.println("Select page to delete" + '\n');
			Scanner pgToDel = new Scanner(System.in);
			String pageToDelete = pgToDel.next();
			int page = Integer.parseInt(pageToDelete);
			notepad.deleteText(page);
			break;
		case 8:
			notepad.viewAllPages();
			break;
		}
		sc.close();
	}
	

	public static void main(String[] args) {
		
		
		
		
	}

}

package notepad;

import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements INotepad {

	private List<Page> pages;

	public SimpleNotepad() {
		this.pages = new ArrayList<>(); 
	}

	@Override
	public Page createPage(String title, String text) {
		Page curPage = new Page();
		curPage.addText(text);
		curPage.setTitle(title);

		return curPage;
	}
	
	public void printPage(int pageNumber) {
		Page page = pages.get(pageNumber);
		if (page != null){
			System.out.println(page.getPageContents());
		}
		
	}
	
	@Override
	public void replaceText(int pageNumber, String text) {
		deleteText(pageNumber);
		pages.get(pageNumber).addText(text);
	}

	@Override
	public void deleteText(int pageNumber) {
		Page page = pages.get(pageNumber);
		if (page == null) {
			System.out.println("Page doesn't exist");
		} else if (page.getText() != null) {
			page.deleteText();
		}

	}

	@Override
	public void viewAllPages() {
		for (int i = 0; i < (pages.size() - 1); i++){
			printPage(i);
		}
		
	}

}

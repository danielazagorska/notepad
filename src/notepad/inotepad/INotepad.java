package notepad.inotepad;

import notepad.notepadmainfunctions.PageNotepad;

public interface INotepad {
	public PageNotepad createPage(String title, String text);

	public void replaceText(int pageNumber, String text);

	public void deleteText(int pageNumber);

	public void viewAllPages();

}

package notepad.notepadmainfunctions;

	public class PageNotepad {
	private String title;
	private String text;
	private int pageNumber;

	public void addText(String text) {

		if (text == null) {
			this.text = text;
		} else {
			this.text += text;
		}
	}

	public void deleteText() {
		this.text = null;
	}
	public String getText() {
		return text;
	}
		

	public String getPageContents() {
		return this.title + "\n" + this.text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

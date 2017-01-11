package notepad;

public interface INotepad {
	public Page createPage(String title, String text);

	public void replaceText(int pageNumber, String text);

	public void deleteText(int pageNumber);

	public void viewAllPages();

}

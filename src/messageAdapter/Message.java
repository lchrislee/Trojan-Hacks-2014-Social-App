package messageAdapter;

import android.graphics.drawable.Drawable;

public class Message {
	private String title;
	private String message;
	private String source;
	private Drawable image;
	
	public Message(String t, String m, String s, Drawable i){
		title = t;
		message = m;
		source = s;
		image = i;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Drawable getImage() {
		return image;
	}

	public void setImage(Drawable image) {
		this.image = image;
	}
}

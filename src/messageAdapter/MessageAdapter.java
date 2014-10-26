package messageAdapter;

import java.util.ArrayList;

import com.example.hello.R;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MessageAdapter extends BaseAdapter {

	private class ViewComponents{
		TextView txvwTitle;
		TextView txvwMessage;
	}
	
	private ViewComponents myComponents;
	private ArrayList<Message> conversation;
	
	public MessageAdapter(){
		conversation = new ArrayList<Message>();
	}
	
	@Override
	public int getCount() {
		return conversation.size();
	}

	@Override
	public Object getItem(int position) {
		return conversation.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null){
			myComponents = new ViewComponents();
			convertView.setTag(myComponents);
		}else{
			myComponents = (ViewComponents) convertView.getTag();
		}
		
		myComponents.txvwMessage = (TextView) convertView.findViewById(R.id.txvwMessage);
		myComponents.txvwTitle = (TextView) convertView.findViewById(R.id.txvwTitle);
		
		myComponents.txvwMessage.setText(conversation.get(position).getMessage());
		
		if (!conversation.get(position).getSource().equals("self"))
			myComponents.txvwTitle.setCompoundDrawables(null, null, conversation.get(position).getImage(), null);
		else
			myComponents.txvwTitle.setCompoundDrawables(conversation.get(position).getImage(), null, null, null);
			
		myComponents.txvwTitle.setText(conversation.get(position).getTitle());
		
		return null;
	}

}

package example.android.ylink;

import example.android.ylink.S1Activity.ButtonClickListener1;
import example.android.ylink.S1Activity.ButtonClickListener2;
import example.android.ylink.S1Activity.ButtonClickListener3;
import example.android.ylink.S1Activity.ButtonClickListener4;
import example.android.ylink.S1Activity.ImageButtonClickListener1;
import example.android.ylink.S1Activity.ListItemClickListener;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.content.Intent;

public class S2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.s2);
		
		Intent data=getIntent();
		
		ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
		imagebutton1.setOnClickListener(new ImageButtonClickListener1());
		
		Button button1=(Button)findViewById(R.id.Newslist_new);
		button1.setOnClickListener(new ButtonClickListener1());
		
		Button button2=(Button)findViewById(R.id.Campusinfo_bt);
		button2.setOnClickListener(new ButtonClickListener2());
		
		Button button3=(Button)findViewById(R.id.Share_bt);
		button3.setOnClickListener(new ButtonClickListener3());
		
		Button button4=(Button)findViewById(R.id.Link_bt);
		button4.setOnClickListener(new ButtonClickListener4());
		
		Button button5=(Button)findViewById(R.id.NewsToukou_bt);
		button5.setOnClickListener(new ButtonClickListener5());
		
		
		ListView listView1=(ListView)findViewById(R.id.lv_news);
		listView1.setOnItemClickListener(new ListItemClickListener());
	}
	
	class ImageButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S2Activity.this , S1Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S2Activity.this , S22Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S2Activity.this , S3Activity.class);
		    startActivity(intent);
		}
	}
	
	class ButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S2Activity.this , S4Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener4 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S2Activity.this , S5Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener5 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S2Activity.this , ToukouNewsActivity.class);
		    startActivity(intent);
			
		}
	}
	
	class ListItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView<?>parent,View view,int position,long id){
			ListView listview = (ListView)parent;
			String item = (String)listview.getItemAtPosition(position);
			
			Intent intent = new Intent(S2Activity.this,NewsActivity.class);
			intent.putExtra("SELECTED", item);
			startActivity(intent);
			
			}
		}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s2, menu);
		return true;
	}

}
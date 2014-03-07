package com.suntek.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * ��ȡ��ϵ�ˡ�ͨ����¼������
 * 
 * @author wwj
 * 
 */
public class MainActivity extends Activity implements OnClickListener {
	private Button btnLoadContacts;
	private Button btnGetRecentContacts;
	private Button btnGetSMS;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnLoadContacts = (Button) findViewById(R.id.btn_load_contacts);
		btnGetRecentContacts = (Button) findViewById(R.id.btn_get_recent_contact);
		btnGetSMS = (Button) findViewById(R.id.btn_get_sms);

		btnLoadContacts.setOnClickListener(this);
		btnGetRecentContacts.setOnClickListener(this);
		btnGetSMS.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.btn_load_contacts: // ��ȡ��ϵ��
			intent = new Intent(this, ContactListActivity.class);
			break;
		case R.id.btn_get_recent_contact: // ��ȡͨ����¼
			intent = new Intent(this, ContactRecordListActivity.class);
			break;
		case R.id.btn_get_sms: // ��ȡ���ż�¼
			intent = new Intent(this, SMSListActivity.class);
			break;
		}
		startActivity(intent);
	}

}

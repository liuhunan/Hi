package com.example.hunanliu.hixianglin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.example.hunanliu.hixianglin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button say;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //say=findViewById(R.id.hello);
        //say.setOnClickListener(new View.OnClickListener(){

    }
        public void  sendMessage(View view){
            Intent intent=new Intent(this,DisplayMessageActivity.class);
            EditText editText=(EditText)findViewById(R.id.editText);
            String message=editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE,message);
            startActivity(intent);

        }


//     public void onClick(View v){
//       Toast.makeText(getApplicationContext(),"亲爱的张总，么么哒",Toast.LENGTH_LONG).show();};





}


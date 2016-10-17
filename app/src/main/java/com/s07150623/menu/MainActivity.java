package com.s07150623.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    //private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.button);
        registerForContextMenu(tv);
    }
    //创建选项菜单

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //加载menu xml
        //MenuInflater mi = getMenuInflater();
       // mi.inflate(R.menu.menu,menu);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        return super.onCreateOptionsMenu(menu);
    }

//创建上下文菜单
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
    //选项菜单被选中
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

//上下文菜单被选中
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);
    }
}

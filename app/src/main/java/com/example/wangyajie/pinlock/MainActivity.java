package com.example.wangyajie.pinlock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NumLockPanel mNumLockPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumLockPanel = (NumLockPanel) findViewById(R.id.num_lock);
        mNumLockPanel.setInputListener(new NumLockPanel.InputListener() {
            @Override
            public void inputFinish(String result) {
                Log.e("结果",result);
                //此处result即为输入结果
                if (result.equals("1234")){
                    Log.e("正确","啊啊啊啊");
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

                }
                else {
                    //错误效果示例
                    Log.e("错误","哈哈哈");
                    mNumLockPanel.showErrorStatus();
                }
            }
        });
    }
}

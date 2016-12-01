package moe.xing.databindingnogetter;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import moe.xing.databindingnogetter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_main, null, false);
        setContentView(binding.getRoot());
        binding.setText("test in data binding.");

        //next line will fail build in library.
        String text = binding.getText();
    }
}

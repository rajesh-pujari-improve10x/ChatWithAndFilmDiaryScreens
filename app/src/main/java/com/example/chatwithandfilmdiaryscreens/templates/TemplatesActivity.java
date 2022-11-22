package com.example.chatwithandfilmdiaryscreens.templates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chatwithandfilmdiaryscreens.R;

import java.util.ArrayList;

public class TemplatesActivity extends AppCompatActivity {

    public ArrayList<Template> templates;
    public RecyclerView templatesRv;
    public TemplateAdapter templateAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        getSupportActionBar().setTitle("Templates");
        setupTemplates();
        setupTemplatesRv();
    }

    public void setupTemplates() {
        templates = new ArrayList<>();
        Template messageOne = new Template();
        messageOne.messageTxt = "Hi,\nWelcome to Improve 10X.";
        templates.add(messageOne);

        Template messageTwo = new Template();
        messageTwo.messageTxt = "Hi, I'm busy. I'll call you later";
        templates.add(messageTwo);

        Template messageThree = new Template();
        messageThree.messageTxt = "Hi,\ncall me when you see the message";
        templates.add(messageThree);

        Template messageFour = new Template();
        messageFour.messageTxt = "-Hi, Please find my contact details\nName : Viswanath Kumar Sandu\ncompany : Improve 10X\nMobile : +919000540052";
        templates.add(messageFour);

        Template messageFive = new Template();
        messageFive.messageTxt = "Hi, Please find my account details\nAccount Number : 625101515776\nBank : ICICI Bank\nIFSC : ICIC0006251";
        templates.add(messageFive);
    }

    public void setupTemplatesRv() {
        templatesRv = findViewById(R.id.templates_rv);
        templatesRv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter = new TemplateAdapter();
        templateAdapter.setData(templates);
        templatesRv.setAdapter(templateAdapter);
    }
}
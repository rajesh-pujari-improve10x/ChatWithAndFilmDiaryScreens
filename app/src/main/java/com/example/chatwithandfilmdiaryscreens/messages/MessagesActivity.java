package com.example.chatwithandfilmdiaryscreens.messages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chatwithandfilmdiaryscreens.R;

import java.util.ArrayList;

public class MessagesActivity extends AppCompatActivity {

    public ArrayList<Message> messages;
    public RecyclerView messagesRv;
    public MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        getSupportActionBar().setTitle("Messages");
        setupMessages();
        setupMessagesRv();
    }

    public void setupMessages() {
        messages = new ArrayList<>();
        Message firstMsg = new Message();
        firstMsg.name = "Aravind";
        firstMsg.phoneNumber = "+91 9000540052";
        firstMsg.messageTxt = "Hi, Welcome to Improve 10X.";
        messages.add(firstMsg);

        Message secondMsg = new Message();
        secondMsg.name = "Ramesh";
        secondMsg.phoneNumber = "+91 9999999999";
        secondMsg.messageTxt = "Hi, Welcome to Improve 10X";
        messages.add(secondMsg);

        Message thirdMsg = new Message();
        thirdMsg.name = "";
        thirdMsg.phoneNumber = "+91 999999991";
        thirdMsg.messageTxt = "Hi, call me when you see the message";
        messages.add(thirdMsg);

        Message fourthMsg = new Message();
        fourthMsg.name = "Kailash";
        fourthMsg.phoneNumber = "+91 9999999992";
        firstMsg.messageTxt = "-";
        messages.add(firstMsg);

        Message fifthMsg = new Message();
        fifthMsg.name = "Swiggy Delivery";
        fifthMsg.phoneNumber = "+91 9999999993";
        fifthMsg.messageTxt = "full address";
        messages.add(fifthMsg);

        Message sixthMsg = new Message();
        sixthMsg.name = "Swiggy Delivery";
        sixthMsg.phoneNumber = "+91 9999999993";
        sixthMsg.messageTxt = "Are you available for this Sunday?\n\nWe can have a call and discuss the movie";
        messages.add(sixthMsg);
    }

    public void setupMessagesRv() {
        messagesRv = findViewById(R.id.messages_rv);
        messagesRv.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter();
        messageAdapter.setData(messages);
        messagesRv.setAdapter(messageAdapter);
    }
}
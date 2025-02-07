package com.example.exp7;

import android.content.Context;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InternalStorage {
    public void writeToFile(String data, Context context) {
        String fileName = "example.txt";
        try (FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_PRIVATE)) {
            fos.write(data.getBytes());
            Toast.makeText(context, "file written succesfully", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readToFile(Context context) {
        String fileName = "example.txt";
        StringBuilder stringBuilder=new StringBuilder();
        try (FileInputStream fis = context.openFileInput(fileName)) {
         int content;
         while((content=fis.read())!=-1){
             stringBuilder.append((char)content);
         }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

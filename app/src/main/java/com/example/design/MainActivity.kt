package com.example.design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var c=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickLogin(view: View) {
        var etuname=findViewById<EditText>(R.id.etuname)
        var etpass=findViewById<EditText>(R.id.etpass)
        if(etuname.editableText.toString().equals("Prats") && etpass.editableText.toString().equals("123")){
            Toast.makeText(this,"Logged in successfully",Toast.LENGTH_SHORT).show()
        }
        else{
           var adb=AlertDialog.Builder(this)
            adb.setMessage("Invalid uname or password")
            adb.setTitle("Oops!!!")
            adb.setPositiveButton("OK",null)
            adb.show()
        }
    }
    fun onClickClear(view: View) {
        var etuname=findViewById<EditText>(R.id.etuname)
        var etpass=findViewById<EditText>(R.id.etpass)
        etpass.setText("")
        etuname.setText("")
    }

    fun onClickEye(view: View) {
        var etpass=findViewById<EditText>(R.id.etpass)
        c++;
        if(c%2==1){
            etpass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        else{
            etpass.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
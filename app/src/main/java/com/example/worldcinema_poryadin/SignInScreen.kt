package com.example.worldcinema_poryadin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import retrofit2.Call
import retrofit2.Response

class SignInScreen : AppCompatActivity() {
    private lateinit var password:EditText
    private lateinit var email:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)

        password = findViewById(R.id.pass)
        email = findViewById(R.id.email)
    }

    fun reg_click(view: View) {
        val intent = Intent(this,SignUpScreen::class.java)
        startActivity(intent)
    }

    fun logbut_click(view: View) {


        if (email.text.toString() == "cool.poryadin2014@yandex.ru" && password.text.toString() == "12345") {
            val intent = Intent(this@SignInScreen, MainScreen::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show()
        }

/*
        if (email.text.toString().isNotEmpty()&&password.text.toString().isNotEmpty())
        {
          val log = MyRetrofit().getRetrofit()
          val getApi = log.create(Api::class.java)
            var hashMap:HashMap<String,String> = HashMap<String,String>()
            hashMap.put("email",email.text.toString())
            hashMap.put("password",password.text.toString())
            val log_call:retrofit2.Call<login> = getApi.getAuth(hashMap)
            log_call.enqueue(object : retrofit2.Callback<login>{
                override fun onResponse(call: Call<login>, response: Response<login>) {
                    if (response.isSuccessful) {
                        val body = response.body()
                        if (body != null) {
                            // Обработка успешного ответа
                            val intent = Intent(this@SignInScreen, MainScreen::class.java)
                            startActivity(intent)
                        } else {
                            // Обработка пустого ответа
                            Toast.makeText(this@SignInScreen, "Empty response body", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        // Обработка неуспешного ответа
                        Toast.makeText(this@SignInScreen, "Unsuccessful response: ${response.code()}", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<login>, t: Throwable) {
                    t.printStackTrace()
                    Toast.makeText(this@SignInScreen, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
                }
            })
        }

 */







    }
}
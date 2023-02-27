package cat.urv.deim.asm.patinfly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import cat.urv.deim.asm.patinfly.R.id.loginPasswordEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email: EditText = this.findViewById(R.id.loginEmailEditAddress)
        val password: EditText = this-findViewById(R.id.loginPasswordEditText)
    }

    val emailValue: String = email.text.toString()
    val passwordValue:
}
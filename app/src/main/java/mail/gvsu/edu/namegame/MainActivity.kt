package mail.gvsu.edu.namegame

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button.setOnClickListener {
            d("Christian", "Hello ${editText.text}")
            helloMessage.text = " Hello ${editText.text}"

            if(editText.text.toString() == "bad"){
                customImage.setImageResource(R.drawable.badday)
            }else if(editText.text.toString() == "good"){
                customImage.setImageResource(R.drawable.goodday)
            }else{
                customImage.setImageResource(R.drawable.mehday)
            }
        }
    }
}

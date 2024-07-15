package com.example.fragments

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.ui.AppBarConfiguration
import com.example.fragments.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.example.fragments.Second_Fragment
val Default_Frag:Fragment=DefaultFragment()
val First_Frag:Fragment=First_Fragment()
val Second_Frag:Fragment=Second_Fragment()
val Third_Frag:Fragment=third_Fragment()
class MainActivity : AppCompatActivity() {

//    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
//    lateinit var b1:Button
//    lateinit var b2:Button
//    lateinit var b3:Button
    fun loadfrag(K:Fragment,flag:Int){
        val fm:FragmentManager= supportFragmentManager
        val ft:FragmentTransaction=fm.beginTransaction()
        if(flag==0)ft.add(R.id.container,K)
        else ft.replace(R.id.container,K)
        ft.commit()

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        b1=findViewById<Button>(R.id.firstbutton)
//        b2=findViewById<Button>(R.id.secondbutton)
//        b3=findViewById<Button>(R.id.thirdbutton)
        loadfrag(Default_Frag,0)
//        setSupportActionBar(binding.toolbar)
        binding.firstbutton.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.firstbutton).show()

            loadfrag(First_Frag,1)


        }

        binding.secondbutton.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.secondbutton).show()
           loadfrag(Second_Frag,1)
        }
        binding.thirdbutton.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.thirdbutton).show()
            loadfrag(Third_Frag,1)
        }
        binding.Defaultbtn.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.secondbutton).show()
            loadfrag(Default_Frag,1)
        }


     }

}
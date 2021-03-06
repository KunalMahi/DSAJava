package com.example.android.navigation

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.navigation.dummy.DummyContent
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),ListFragment.OnListFragmentInteractionListener {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener{item ->
        when(item.itemId)
        {
            R.id.navigation_home -> {
                findNavController(R.id.nav_host_fragment).navigate(R.id.main_dest)
                return@OnNavigationItemSelectedListener true;
            }
            R.id.navigation_dashboard -> {
                findNavController(R.id.nav_host_fragment).navigate(R.id.list_dest)
                return@OnNavigationItemSelectedListener true;
            }
            R.id.navigation_notifications -> {
                val args=Bundle()
                args.putString("param1","Lydia")
                args.putString("param2","Romero")
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_params,args)
                return@OnNavigationItemSelectedListener true;
        }

            else -> false
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem) {
//        val args=Bundle()
//        args.putString("param1","Selected")
//        args.putString("param2",item.toString())
        val action=ListFragmentDirections.actionToParams()
        action.setParam1("Selected( with safeargs")
        action.setParam2(item.toString())
        findNavController(R.id.nav_host_fragment).navigate(action)
    }
}
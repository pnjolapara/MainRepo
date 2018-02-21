package com.basickotlin

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)

        println("Hello, world!")
        //     println("Hello, world!sum(10,10)");
        val a = sum(11, 12);
        println("a is $a");

        val b = sum(11, 12, 13);
        println("b is $b");

        val c = printSum(14, 15);
        println("c is $c");

        val d = printSum(15, 16, 17);
        println("d is $d");

        val aa: Int = 1  // immediate assignment
        val bb = 2   // `Int` type is inferred
        val cc: Int  // Type required when no initializer is provided
        cc = 3       // deferred assignment

        println("aa is $aa");
        println("bb is $bb");
        println("cc is $cc");

        var a1 = 1
        // simple name in template:
        val s1 = "a1 is $a1"

        a1 = 2
        // arbitrary expression in template:
        val s2 = "${s1.replace("is", "was")}, but now is $a1"

        val a2 = maxOf(10, 11);
        println("a2 is $a2");

        val a3 = maxOff(10, 11);
        println("a3 is $a3");

    }


    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOff(a: Int, b: Int) = if (a > b) a else b

    fun printSum(a: Int, b: Int, c: Int) {
        println("sum of $a and $b and $c is ${a + b + c}")
    }

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")

    }

    fun sum(a: Int, b: Int, c: Int) = a + b + c

    fun sum(a: Int, b: Int): Int {
        println("sum ( $a, $b )");
        return a + b
    }


    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    //val retValue Int=sum(10,10);
    //println("sum of $retValue")

//    val list = asList(1, 2, 3)

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }


}

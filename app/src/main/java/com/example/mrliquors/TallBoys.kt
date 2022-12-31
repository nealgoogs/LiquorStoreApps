package com.example.mrliquors

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.mrliqours.R

class TallBoys : AppCompatActivity() {

    private lateinit var prefs: SharedPreferences
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView
    private lateinit var txt3: TextView
    private lateinit var txt4: TextView
    private lateinit var txt5: TextView
    private lateinit var txt6: TextView
    private lateinit var txt7: TextView
    private lateinit var txt8: TextView
    private lateinit var txt9: TextView
    private lateinit var txt10: TextView
    private lateinit var txt11: TextView
    private lateinit var txt12: TextView
    private lateinit var txt13: TextView
    private lateinit var txt14: TextView
    private lateinit var txt15: TextView
    private lateinit var txt16: TextView
    private lateinit var txt17: TextView
    private lateinit var txt18: TextView
    private lateinit var txt19: TextView
    private lateinit var txt20: TextView
    private lateinit var txt21: TextView
    private lateinit var txt22: TextView
    private lateinit var txt23: TextView
    private lateinit var txt24: TextView
    private lateinit var txt25: TextView
    private lateinit var txt26: TextView
    private lateinit var txt27: TextView
    private lateinit var txt28: TextView
    private lateinit var txt29: TextView
    private lateinit var txt30: TextView
    private lateinit var txt31: TextView
    private lateinit var txt32: TextView
    private lateinit var txt33: TextView
    private lateinit var txt34: TextView
    private lateinit var txt35: TextView
    private lateinit var txt36: TextView
    private lateinit var txt37: TextView
    private lateinit var txt38: TextView
    private lateinit var txt39: TextView
    private lateinit var txt40: TextView
    private lateinit var txt41: TextView
    private lateinit var txt42: TextView
    private lateinit var txt43: TextView
    private lateinit var txt44: TextView
    private lateinit var txt45: TextView
    private lateinit var txt46: TextView
    private lateinit var txt47: TextView
    private lateinit var txt48: TextView
    private lateinit var txt49: TextView
    private lateinit var txt50: TextView
    private lateinit var txt51: TextView
    private lateinit var txt52: TextView
    private lateinit var txt53: TextView
    private lateinit var txt54: TextView
    private lateinit var txt55: TextView
    private lateinit var txt56: TextView
    private lateinit var txt57: TextView
    private lateinit var txt58: TextView
    private lateinit var txt59: TextView
    private lateinit var txt60: TextView
    private lateinit var txt61: TextView
    private lateinit var txt62: TextView
    private lateinit var txt63: TextView
    private lateinit var txt64: TextView
    private lateinit var txt65: TextView
    private lateinit var txt66: TextView
    private lateinit var txt67: TextView
    private lateinit var txt68: TextView
    private lateinit var txt69: TextView
    private lateinit var txt70: TextView
    private lateinit var txt71: TextView
    private lateinit var txt72: TextView
    private lateinit var txt73: TextView
    private lateinit var txt74: TextView
    private lateinit var txt75: TextView
    private lateinit var txt76: TextView

    private lateinit var builder: AlertDialog.Builder


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tall_boys)




        prefs = getSharedPreferences("MY_PREFS", Context.MODE_PRIVATE)


        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        txt3 = findViewById(R.id.txt3)
        txt4 = findViewById(R.id.txt4)
        txt5 = findViewById(R.id.txt5)
        txt6 = findViewById(R.id.txt6)
        txt7 = findViewById(R.id.txt7)
        txt8 = findViewById(R.id.txt8)
        txt9 = findViewById(R.id.txt9)
        txt10 = findViewById(R.id.txt10)
        txt11 = findViewById(R.id.txt11)
        txt12 = findViewById(R.id.txt12)
        txt13 = findViewById(R.id.txt13)
        txt14 = findViewById(R.id.txt14)
        txt15 = findViewById(R.id.txt15)
        txt16 = findViewById(R.id.txt16)
        txt17 = findViewById(R.id.txt17)
        txt18 = findViewById(R.id.txt18)
        txt19 = findViewById(R.id.txt19)
        txt20 = findViewById(R.id.txt20)
        txt21 = findViewById(R.id.txt21)
        txt22 = findViewById(R.id.txt22)
        txt23 = findViewById(R.id.txt23)
        txt24 = findViewById(R.id.txt24)
        txt25 = findViewById(R.id.txt25)
        txt26 = findViewById(R.id.txt26)
        txt27 = findViewById(R.id.txt27)
        txt28 = findViewById(R.id.txt28)
        txt29 = findViewById(R.id.txt29)
        txt30 = findViewById(R.id.txt30)
        txt31 = findViewById(R.id.txt31)
        txt32 = findViewById(R.id.txt32)
        txt33 = findViewById(R.id.txt33)
        txt34 = findViewById(R.id.txt34)
        txt35 = findViewById(R.id.txt35)
        txt36 = findViewById(R.id.txt36)
        txt37 = findViewById(R.id.txt37)
        txt38 = findViewById(R.id.txt38)
        txt39 = findViewById(R.id.txt39)
        txt40 = findViewById(R.id.txt40)
        txt41 = findViewById(R.id.txt41)
        txt42 = findViewById(R.id.txt42)
        txt43 = findViewById(R.id.txt43)
        txt44 = findViewById(R.id.txt44)
        txt45 = findViewById(R.id.txt45)
        txt46 = findViewById(R.id.txt46)
        txt47 = findViewById(R.id.txt47)
        txt48 = findViewById(R.id.txt48)
        txt49 = findViewById(R.id.txt49)
        txt50 = findViewById(R.id.txt50)
        txt51 = findViewById(R.id.txt51)
        txt52 = findViewById(R.id.txt52)
        txt53 = findViewById(R.id.txt53)
        txt54 = findViewById(R.id.txt54)
        txt55 = findViewById(R.id.txt55)
        txt56 = findViewById(R.id.txt56)
        txt57 = findViewById(R.id.txt57)
        txt58 = findViewById(R.id.txt58)
        txt59 = findViewById(R.id.txt59)
        txt60 = findViewById(R.id.txt60)
        txt61 = findViewById(R.id.txt61)
        txt62 = findViewById(R.id.txt62)
        txt63 = findViewById(R.id.txt63)
        txt64 = findViewById(R.id.txt64)
        txt65 = findViewById(R.id.txt65)
        txt66 = findViewById(R.id.txt66)
        txt67 = findViewById(R.id.txt67)
        txt68 = findViewById(R.id.txt68)
        txt69 = findViewById(R.id.txt69)
        txt70 = findViewById(R.id.txt70)
        txt71 = findViewById(R.id.txt71)
        txt72 = findViewById(R.id.txt72)
        txt73 = findViewById(R.id.txt73)
        txt74 = findViewById(R.id.txt74)
        txt75 = findViewById(R.id.txt75)
        txt76 = findViewById(R.id.txt76)



        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)
        val btn6: Button = findViewById(R.id.button6)
        val btn7: Button = findViewById(R.id.button7)
        val btn8: Button = findViewById(R.id.button8)
        val btn9: Button = findViewById(R.id.button9)
        val btn10: Button = findViewById(R.id.button10)
        val btn11: Button = findViewById(R.id.button11)
        val btn12: Button = findViewById(R.id.button12)
        val btn13: Button = findViewById(R.id.button13)
        val btn14: Button = findViewById(R.id.button14)
        val btn15: Button = findViewById(R.id.button15)
        val btn16: Button = findViewById(R.id.button16)
        val btn17: Button = findViewById(R.id.button17)
        val btn18: Button = findViewById(R.id.button18)
        val btn19: Button = findViewById(R.id.button19)
        val btn20: Button = findViewById(R.id.button20)
        val btn21: Button = findViewById(R.id.button21)
        val btn22: Button = findViewById(R.id.button22)
        val btn23: Button = findViewById(R.id.button23)
        val btn24: Button = findViewById(R.id.button24)
        val btn25: Button = findViewById(R.id.button25)
        val btn26: Button = findViewById(R.id.button26)
        val btn27: Button = findViewById(R.id.button27)
        val btn28: Button = findViewById(R.id.button28)
        val btn29: Button = findViewById(R.id.button29)
        val btn30: Button = findViewById(R.id.button30)
        val btn31: Button = findViewById(R.id.button31)
        val btn32: Button = findViewById(R.id.button32)
        val btn33: Button = findViewById(R.id.button33)
        val btn34: Button = findViewById(R.id.button34)
        val btn35: Button = findViewById(R.id.button35)
        val btn36: Button = findViewById(R.id.button36)
        val btn37: Button = findViewById(R.id.button37)
        val btn38: Button = findViewById(R.id.button38)
        val btn39: Button = findViewById(R.id.button39)
        val btn40: Button = findViewById(R.id.button40)
        val btn41: Button = findViewById(R.id.button41)
        val btn42: Button = findViewById(R.id.button42)
        val btn43: Button = findViewById(R.id.button43)
        val btn44: Button = findViewById(R.id.button44)
        val btn45: Button = findViewById(R.id.button45)
        val btn46: Button = findViewById(R.id.button46)
        val btn47: Button = findViewById(R.id.button47)
        val btn48: Button = findViewById(R.id.button48)
        val btn49: Button = findViewById(R.id.button49)
        val btn50: Button = findViewById(R.id.button50)
        val btn51: Button = findViewById(R.id.button51)
        val btn52: Button = findViewById(R.id.button52)
        val btn53: Button = findViewById(R.id.button53)
        val btn54: Button = findViewById(R.id.button54)
        val btn55: Button = findViewById(R.id.button55)
        val btn56: Button = findViewById(R.id.button56)
        val btn57: Button = findViewById(R.id.button57)
        val btn58: Button = findViewById(R.id.button58)
        val btn59: Button = findViewById(R.id.button59)
        val btn60: Button = findViewById(R.id.button60)
        val btn61: Button = findViewById(R.id.button61)
        val btn62: Button = findViewById(R.id.button62)
        val btn63: Button = findViewById(R.id.button63)
        val btn64: Button = findViewById(R.id.button64)
        val btn65: Button = findViewById(R.id.button65)
        val btn66: Button = findViewById(R.id.button66)
        val btn67: Button = findViewById(R.id.button67)
        val btn68: Button = findViewById(R.id.button68)
        val btn69: Button = findViewById(R.id.button69)
        val btn70: Button = findViewById(R.id.button70)
        val btn71: Button = findViewById(R.id.button71)
        val btn72: Button = findViewById(R.id.button72)
        val btn73: Button = findViewById(R.id.button73)
        val btn74: Button = findViewById(R.id.button74)
        val btn75: Button = findViewById(R.id.button75)
        val btn76: Button = findViewById(R.id.button76)


        val removeBtn: Button = findViewById(R.id.removeBtn)
        builder = AlertDialog.Builder(this)




        btn1.setOnClickListener {

            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL1")
            startActivity(intent)

        }

        btn2.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL2")
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL3")
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL4")
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL5")
            startActivity(intent)
        }
        btn6.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL6")
            startActivity(intent)
        }
        btn7.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL7")
            startActivity(intent)
        }

        btn8.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL8")
            startActivity(intent)
        }
        btn9.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL9")
            startActivity(intent)
        }
        btn10.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL10")
            startActivity(intent)
        }
        btn11.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL11")
            startActivity(intent)
        }
        btn12.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL12")
            startActivity(intent)
        }
        btn13.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL13")
            startActivity(intent)
        }
        btn14.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL14")
            startActivity(intent)
        }
        btn15.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL15")
            startActivity(intent)
        }
        btn16.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL16")
            startActivity(intent)
        }
        btn17.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL17")
            startActivity(intent)
        }
        btn18.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL18")
            startActivity(intent)
        }
        btn19.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL19")
            startActivity(intent)
        }
        btn20.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL20")
            startActivity(intent)
        }
        btn21.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL21")
            startActivity(intent)
        }
        btn22.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL22")
            startActivity(intent)
        }
        btn23.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL23")
            startActivity(intent)
        }
        btn24.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL24")
            startActivity(intent)
        }
        btn25.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL25")
            startActivity(intent)
        }
        btn26.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL26")
            startActivity(intent)
        }
        btn27.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL27")
            startActivity(intent)
        }
        btn28.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL28")
            startActivity(intent)
        }
        btn29.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL29")
            startActivity(intent)
        }

        btn30.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL30")
            startActivity(intent)
        }
        btn31.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL31")
            startActivity(intent)
        }
        btn32.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL32")
            startActivity(intent)
        }
        btn33.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL33")
            startActivity(intent)
        }
        btn34.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL34")
            startActivity(intent)
        }
        btn35.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL35")
            startActivity(intent)
        }
        btn36.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL36")
            startActivity(intent)
        }
        btn37.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL37")
            startActivity(intent)
        }
        btn38.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL38")
            startActivity(intent)
        }
        btn39.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL39")
            startActivity(intent)
        }
        btn40.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL40")
            startActivity(intent)
        }
        btn41.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL41")
            startActivity(intent)
        }
        btn42.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL42")
            startActivity(intent)
        }
        btn43.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL43")
            startActivity(intent)
        }
        btn44.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL44")
            startActivity(intent)
        }
        btn45.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL45")
            startActivity(intent)
        }
        btn46.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL46")
            startActivity(intent)
        }
        btn47.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL47")
            startActivity(intent)
        }
        btn48.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL48")
            startActivity(intent)
        }
        btn49.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL49")
            startActivity(intent)
        }
        btn50.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL50")
            startActivity(intent)
        }
        btn51.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL51")
            startActivity(intent)
        }
        btn52.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL52")
            startActivity(intent)
        }
        btn53.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL53")
            startActivity(intent)
        }
        btn54.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL54")
            startActivity(intent)
        }
        btn55.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL55")
            startActivity(intent)
        }
        btn56.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL56")
            startActivity(intent)
        }
        btn57.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL57")
            startActivity(intent)
        }
        btn58.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL58")
            startActivity(intent)
        }
        btn59.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL59")
            startActivity(intent)
        }
        btn60.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL60")
            startActivity(intent)
        }
        btn61.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL61")
            startActivity(intent)
        }
        btn62.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL62")
            startActivity(intent)
        }
        btn63.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL63")
            startActivity(intent)
        }
        btn64.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL64")
            startActivity(intent)
        }
        btn65.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL65")
            startActivity(intent)
        }
        btn66.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL66")
            startActivity(intent)
        }
        btn67.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL67")
            startActivity(intent)
        }
        btn68.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL68")
            startActivity(intent)
        }
        btn69.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL69")
            startActivity(intent)
        }
        btn70.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL70")
            startActivity(intent)
        }
        btn71.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL71")
            startActivity(intent)
        }
        btn72.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL72")
            startActivity(intent)
        }
        btn73.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL73")
            startActivity(intent)
        }
        btn74.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL74")
            startActivity(intent)
        }
        btn75.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL75")
            startActivity(intent)
        }
        btn76.setOnClickListener {
            val intent = Intent(this, TallBoysNumbers::class.java)
            intent.putExtra("KEY","VAL76")
            startActivity(intent)
        }



        removeBtn.setOnClickListener{
            builder.setTitle("Alert!")
                .setMessage("Do you want to reset?")
                .setCancelable(true)
                .setPositiveButton("Yes"){dialogInterface, it ->
                    prefs.edit().clear().apply()
                    finish()
                }
                .setNegativeButton("No"){dialogInterface, it ->
                    dialogInterface.cancel()
                }
                .show()
        }


    }
    override fun onResume() {
        super.onResume()

        val num1 = prefs.getInt("VAL1", 0)
        val num2 = prefs.getInt("VAL2", 0)
        val num3 = prefs.getInt("VAL3", 0)
        val num4 = prefs.getInt("VAL4", 0)
        val num5 = prefs.getInt("VAL5", 0)
        val num6 = prefs.getInt("VAL6", 0)
        val num7 = prefs.getInt("VAL7", 0)
        val num8 = prefs.getInt("VAL8", 0)
        val num9 = prefs.getInt("VAL9", 0)
        val num10 = prefs.getInt("VAL10", 0)
        val num11 = prefs.getInt("VAL11", 0)
        val num12 = prefs.getInt("VAL12", 0)
        val num13 = prefs.getInt("VAL13", 0)
        val num14 = prefs.getInt("VAL14", 0)
        val num15 = prefs.getInt("VAL15", 0)
        val num16 = prefs.getInt("VAL16", 0)
        val num17 = prefs.getInt("VAL17", 0)
        val num18 = prefs.getInt("VAL18", 0)
        val num19 = prefs.getInt("VAL19", 0)
        val num20 = prefs.getInt("VAL20", 0)
        val num21 = prefs.getInt("VAL21", 0)
        val num22 = prefs.getInt("VAL22", 0)
        val num23 = prefs.getInt("VAL23", 0)
        val num24 = prefs.getInt("VAL24", 0)
        val num25 = prefs.getInt("VAL25", 0)
        val num26 = prefs.getInt("VAL26", 0)
        val num27 = prefs.getInt("VAL27", 0)
        val num28 = prefs.getInt("VAL28", 0)
        val num29 = prefs.getInt("VAL29", 0)
        val num30 = prefs.getInt("VAL30", 0)
        val num31 = prefs.getInt("VAL31", 0)
        val num32 = prefs.getInt("VAL32", 0)
        val num33 = prefs.getInt("VAL33", 0)
        val num34 = prefs.getInt("VAL34", 0)
        val num35 = prefs.getInt("VAL35", 0)
        val num36 = prefs.getInt("VAL36", 0)
        val num37 = prefs.getInt("VAL37", 0)
        val num38 = prefs.getInt("VAL38", 0)
        val num39 = prefs.getInt("VAL39", 0)
        val num40 = prefs.getInt("VAL40", 0)
        val num41 = prefs.getInt("VAL41", 0)
        val num42 = prefs.getInt("VAL42", 0)
        val num43 = prefs.getInt("VAL43", 0)
        val num44 = prefs.getInt("VAL44", 0)
        val num45 = prefs.getInt("VAL45", 0)
        val num46 = prefs.getInt("VAL46", 0)
        val num47 = prefs.getInt("VAL47", 0)
        val num48 = prefs.getInt("VAL48", 0)
        val num49 = prefs.getInt("VAL49", 0)
        val num50 = prefs.getInt("VAL50", 0)
        val num51 = prefs.getInt("VAL51", 0)
        val num52 = prefs.getInt("VAL52", 0)
        val num53 = prefs.getInt("VAL53", 0)
        val num54 = prefs.getInt("VAL54", 0)
        val num55 = prefs.getInt("VAL55", 0)
        val num56 = prefs.getInt("VAL56", 0)
        val num57 = prefs.getInt("VAL57", 0)
        val num58 = prefs.getInt("VAL58", 0)
        val num59 = prefs.getInt("VAL59", 0)
        val num60 = prefs.getInt("VAL60", 0)
        val num61 = prefs.getInt("VAL61", 0)
        val num62 = prefs.getInt("VAL62", 0)
        val num63 = prefs.getInt("VAL63", 0)
        val num64 = prefs.getInt("VAL64", 0)
        val num65 = prefs.getInt("VAL65", 0)
        val num66 = prefs.getInt("VAL66", 0)
        val num67 = prefs.getInt("VAL67", 0)
        val num68 = prefs.getInt("VAL68", 0)
        val num69 = prefs.getInt("VAL69", 0)
        val num70 = prefs.getInt("VAL70", 0)
        val num71 = prefs.getInt("VAL71", 0)
        val num72 = prefs.getInt("VAL72", 0)
        val num73 = prefs.getInt("VAL73", 0)
        val num74 = prefs.getInt("VAL74", 0)
        val num75 = prefs.getInt("VAL75", 0)
        val num76 = prefs.getInt("VAL76", 0)


        txt1.text = num1.toString()
        txt2.text = num2.toString()
        txt3.text = num3.toString()
        txt4.text = num4.toString()
        txt5.text = num5.toString()
        txt6.text = num6.toString()
        txt7.text = num7.toString()
        txt8.text = num8.toString()
        txt9.text = num9.toString()
        txt10.text = num10.toString()
        txt11.text = num11.toString()
        txt12.text = num12.toString()
        txt13.text = num13.toString()
        txt14.text = num14.toString()
        txt15.text = num15.toString()
        txt16.text = num16.toString()
        txt17.text = num17.toString()
        txt18.text = num18.toString()
        txt19.text = num19.toString()
        txt20.text = num20.toString()
        txt21.text = num21.toString()
        txt22.text = num22.toString()
        txt23.text = num23.toString()
        txt24.text = num24.toString()
        txt25.text = num25.toString()
        txt26.text = num26.toString()
        txt27.text = num27.toString()
        txt28.text = num28.toString()
        txt29.text = num29.toString()
        txt30.text = num30.toString()
        txt31.text = num31.toString()
        txt32.text = num32.toString()
        txt33.text = num33.toString()
        txt34.text = num34.toString()
        txt35.text = num35.toString()
        txt36.text = num36.toString()
        txt37.text = num37.toString()
        txt38.text = num38.toString()
        txt39.text = num39.toString()
        txt40.text = num40.toString()
        txt41.text = num41.toString()
        txt42.text = num42.toString()
        txt43.text = num43.toString()
        txt44.text = num44.toString()
        txt45.text = num45.toString()
        txt46.text = num46.toString()
        txt47.text = num47.toString()
        txt48.text = num48.toString()
        txt49.text = num49.toString()
        txt50.text = num50.toString()
        txt51.text = num51.toString()
        txt52.text = num52.toString()
        txt53.text = num53.toString()
        txt54.text = num54.toString()
        txt55.text = num55.toString()
        txt56.text = num56.toString()
        txt57.text = num57.toString()
        txt58.text = num58.toString()
        txt59.text = num59.toString()
        txt60.text = num60.toString()
        txt61.text = num61.toString()
        txt62.text = num62.toString()
        txt63.text = num63.toString()
        txt64.text = num64.toString()
        txt65.text = num65.toString()
        txt66.text = num66.toString()
        txt67.text = num67.toString()
        txt68.text = num68.toString()
        txt69.text = num69.toString()
        txt70.text = num70.toString()
        txt71.text = num71.toString()
        txt72.text = num72.toString()
        txt73.text = num73.toString()
        txt74.text = num74.toString()
        txt75.text = num75.toString()
        txt76.text = num76.toString()

    }



}



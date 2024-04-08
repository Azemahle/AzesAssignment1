@file:Suppress("UNUSED_VARIABLE")

package com.example.azesassignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {
    // Declare Variables
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize
        searchButton= findViewById(R.id.searchButton)
        clearButton= findViewById(R.id.clearButton)
        ageInput= findViewById(R.id.resultTextView)
        resultTextView= findViewById(R.id.ageInput)


        searchButton.setOnClickListener{
            // create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            // if age is not full age and is in range between 20 and 100
            if (age != null && age in 20..100) {

                // when age is 39 display Princess Diana else when is.. so on
                val studentAge = when (age){
                    39 -> "Princess Diana"
                    40 -> "Brenda Fassie"
                    50 -> "Michael Jackson"
                    52 -> "William Shakespear"
                    55 -> "Emily Dicknson"
                    79 -> "Albert Einstein"
                    81 -> "Queen Victoria"
                    82 -> "Neil Armstrong"
                    91 -> "Harriet Tubman"
                    95 -> "Nelson Mandela"
                    else -> null

                    }
                //if age is not full and age is in range between 20 and 100
                if (age in 20..100){
                // when age is 39 display Princess Diana else when is .. and s on
                val studentAge = when (age){

                    39 -> "Princess Diana.she was the princess of Whales, member of the British family"
                    40 -> "Brenda Fassie. She was the niece of Nelson Mandela"
                    50 -> "Michael Jackson. He was an American singer-songwritter and dancer"
                    52 -> "William Shakespear. William Shakespeare was an English playwright, poet and actor. He is widely regarded as the greatest writer in the English language and the world's pre-eminent dramatist."
                    55 -> "Emily Dicknson. Emily Elizabeth Dickinson was an American poet. Little-known during her life, she has since been regarded as one of the most important figures in American poetry"
                    79 -> "Albert Einstein. Albert Einstein was a German-born theoretical physicist who is widely held to be one of the greatest and most influential scientists of all time."
                    81 -> "Queen Victoria. Albert Einstein was a German-born theoretical physicist who is widely held to be one of the greatest and most influential scientists of all time."
                    82 -> "Neil Armstrong.Neil Alden Armstrong was an American astronaut and aeronautical engineer who in 1969 became the first person to walk on the Moon."
                    91 -> "Harriet Tubman. Harriet Tubman was an American abolitionist and social activist. After escaping slavery, Tubman made some 13 missions to rescue approximately 70 enslaved people, including her family and friends, using the network of antislavery activists and safe houses known collectively as the Underground Railroad."
                    95 -> "Nelson Mandela. Nelson Rolihlahla Mandela was a South African anti-apartheid activist, politician, and statesman who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election."
                    else -> null



                }



              val message = if (studentAge != null) "The student's famous historical figure is $studentAge."
                else "No famous figure found with the entered age."
                resultTextView.text =message}

            } else {
                "invalid input please enter a valid age between 20 and 100.".also { resultTextView.text = it }
            }
         clearButton.setOnClickListener{
             ageInput.text.clear()
             resultTextView.text=""
         }}
    }
}